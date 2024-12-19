package Com.Controller;

import Com.Model.ModelProduct;
import Com.Model.ModelProductCategory;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDAO {
    DAO dao = new DAO();
    ArrayList<ModelProduct> dsProducts;

    public ProductDAO() {
        dsProducts = getListProduct();
    }
    public boolean addProduct(ModelProduct modelProduct){
        String sql = "INSERT INTO SanPham(MaSP, TenSP, Anh, TrangThai, MaLoaiSP)"
                + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelProduct.getProductId());
            ps.setString(2, modelProduct.getProductName());
            if (modelProduct.getImage()==null){
                ps.setNull(3, Types.BLOB);
            }else
                ps.setBytes(3, modelProduct.getImage());
            ps.setString(4, modelProduct.getStatus());
            ps.setString(5, modelProduct.getProductCategory().getCategoryId());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(HeadlessException | SQLException ex){
        }
        return false;
    }
    
    public  ArrayList<ModelProduct> getListProduct(){
        ArrayList<ModelProduct> dsProduct = new ArrayList<>();
        String sql = "SELECT SanPham.MaSP, SanPham.TenSP, SanPham.Anh, SanPham.TrangThai AS SPTT, SanPham.MaloaiSP AS MLSP,"
                + " LoaiSanPham.MaloaiSP,LoaiSanPham.TenLoai, LoaiSanPham.TrangThai"
                + "  FROM SanPham JOIN LoaiSanPham ON LoaiSanPham.MaLoaiSP = SanPham.MaLoaiSP ";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelProductCategory mpc = new ModelProductCategory(
                    rs.getString("MaLoaiSP"),
                    rs.getString("TenLoai"),
                    rs.getString("TrangThai")
                );
                ModelProduct s = new ModelProduct();
                s.setProductId(rs.getString("MaSP"));
                s.setProductName(rs.getString("TenSp"));
                s.setImage(rs.getBytes("Anh"));
                s.setStatus(rs.getString("SPTT"));
                s.setProductCategory(mpc);
                dsProduct.add(s);
            }
        }catch (SQLException ex){
        }
        return dsProduct;
    }
    public boolean updateProduct(ModelProduct modelProduct){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE SanPham SET MaSP=?, TenSP=?, Anh=?, TrangThai=?, MaLoaiSP=? WHERE MaSP = '"+modelProduct.getProductId()+"'");
            ps.setString(1, modelProduct.getProductId());
            ps.setString(2, modelProduct.getProductName());
            ps.setBytes(3, modelProduct.getImage());
            ps.setString(4, modelProduct.getStatus());
            ps.setString(5, modelProduct.getProductCategory().getCategoryId());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (HeadlessException | SQLException e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    // Xóa sản phẩm từ bảng SanPham và xử lý bảng liên quan
    public boolean deleteSanPham(String maSP) throws SQLException {
        // Trước tiên, xóa dữ liệu liên quan trong bảng ChiTietSP
        ProductDetailDAO ctspDAO = new ProductDetailDAO();
        ctspDAO.deleteChiTietSPByMaSP(maSP);

        // Sau đó xóa bản ghi trong bảng SanPham
        String sql = "DELETE FROM SanPham WHERE MaSP = ?";
        try (PreparedStatement stmt = dao.getConn().prepareStatement(sql)) {
            stmt.setString(1, maSP);
            return stmt.executeUpdate() > 0;
        }
    }
}
