package Com.Controller;

import Com.Model.ModelProduct;
import Com.Model.ModelProductCategory;
import Com.Model.ModelProductDetail;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDetailDAO {
    DAO dao = new DAO();
    ArrayList<ModelProductDetail> dsDetails;

    public ProductDetailDAO() {
        dsDetails = getListProductDetail();
    }
    public boolean addProductDetail(ModelProductDetail modelProductDetail){
        String sql = "INSERT INTO ChiTietSP(MaCTSP, MaSP, NgayNhap, SoLuong, Gia, MoTa)"
                + "VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelProductDetail.getProductDetailId());
            ps.setString(2, modelProductDetail.getProduct().getProductId());
            ps.setString(3, modelProductDetail.getEntryDate());
            ps.setString(4, String.valueOf(modelProductDetail.getQuantity()));
            ps.setString(5, String.valueOf(modelProductDetail.getPrice()));
            ps.setString(6, modelProductDetail.getDescription());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<ModelProductDetail> getListProductDetail(){
        ArrayList<ModelProductDetail> dsDetails = new ArrayList<>();
        String sql = "SELECT ChiTietSP.MaCTSP, ChiTietSP.MaSP AS MSP, ChiTietSP.NgayNhap, ChiTietSP.SoLuong,"
                + " ChiTietSP.Gia, ChiTietSP.MoTa, SanPham.MaSP, SanPham.TenSP, SanPham.Anh,"
                + " SanPham.TrangThai AS SPTT, SanPham.MaloaiSP AS MLSP, LoaiSanPham.MaloaiSP,"
                + " LoaiSanPham.TenLoai, LoaiSanPham.TrangThai"
                + "  FROM ChiTietSP JOIN SanPham ON ChiTietSP.MaSP = SanPham.MaSP "
           + "JOIN LoaiSanPham ON LoaiSanPham.MaLoaiSP = SanPham.MaLoaiSP";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelProductCategory mpc = new ModelProductCategory(
                    rs.getString("MaLoaiSP"),
                    rs.getString("TenLoai"),
                    rs.getString("TrangThai")
                );
                ModelProduct mp = new ModelProduct(
                    rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getBytes("Anh"),
                    rs.getString("SPTT"),
                    mpc
                );
                ModelProductDetail s = new ModelProductDetail();
                s.setProductDetailId(rs.getString("MaCTSP"));
                s.setProduct(mp);
                s.setEntryDate(rs.getString("NgayNhap"));
                s.setQuantity(rs.getInt("SoLuong"));
                s.setPrice(rs.getDouble("Gia"));
                s.setDescription(rs.getString("MoTa"));
                dsDetails.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsDetails;
    }
    public boolean updateProductDetail(ModelProductDetail modelProductDetail) throws SQLException{         
        PreparedStatement ps = dao.getConn().prepareStatement("UPDATE ChiTietSP SET MaCTSP=?, MaSP=?, NgayNhap=?, SoLuong=?, Gia=?, MoTa=? WHERE MaCTSP = '"+modelProductDetail.getProductDetailId()+"'");
        ps.setString(1, modelProductDetail.getProductDetailId());
        ps.setString(2, modelProductDetail.getProduct().getProductId());
        ps.setString(3, modelProductDetail.getEntryDate());
        ps.setString(4, String.valueOf(modelProductDetail.getQuantity()));
        ps.setString(5, String.valueOf(modelProductDetail.getPrice()));
        ps.setString(6, modelProductDetail.getDescription());
        return ps.executeUpdate()>0;   
    }
    
    public boolean updateProductDetailByMaCTSP(String maCTSP, int soLuong) throws SQLException{         
        PreparedStatement ps = dao.getConn().prepareStatement("UPDATE ChiTietSP SET SoLuong= SoLuong + ? WHERE MaCTSP = '"+maCTSP+"'");
        ps.setInt(1, soLuong);
        return ps.executeUpdate()>0;   
    }
    
    public boolean deleteChiTietSPByMaSP(String maSP) throws SQLException {
        // Lấy tất cả các MaCTSP liên quan đến MaSP
        String selectSQL = "SELECT MaCTSP FROM ChiTietSP WHERE MaSP = ?";
        try (PreparedStatement selectStmt = dao.getConn().prepareStatement(selectSQL)) {
            selectStmt.setString(1, maSP);
            ResultSet rs = selectStmt.executeQuery();

            // Xóa trong bảng ChiTietHoaDon trước
            OrderDetailDAO cthdDAO = new OrderDetailDAO();
            while (rs.next()) {
                String maCTSP = rs.getString("MaCTSP");
                cthdDAO.deleteChiTietHoaDonByMaCTSP(maCTSP);
            }

            // Sau đó xóa trong bảng ChiTietSP
            String deleteSQL = "DELETE FROM ChiTietSP WHERE MaSP = ?";
            try (PreparedStatement deleteStmt = dao.getConn().prepareStatement(deleteSQL)) {
                deleteStmt.setString(1, maSP);
                return deleteStmt.executeUpdate() > 0;
            }
        }
    }
    
    public  ArrayList<ModelProductDetail> searchProduct(String name){
        ArrayList<ModelProductDetail> dsDetails = new ArrayList<>();
        String sql = "SELECT ChiTietSP.MaCTSP, ChiTietSP.MaSP AS MSP, ChiTietSP.NgayNhap, ChiTietSP.SoLuong,"
                + " ChiTietSP.Gia, ChiTietSP.MoTa, SanPham.MaSP, SanPham.TenSP, SanPham.Anh,"
                + " SanPham.TrangThai AS SPTT, SanPham.MaloaiSP AS MLSP, LoaiSanPham.MaloaiSP,"
                + " LoaiSanPham.TenLoai, LoaiSanPham.TrangThai"
                + "  FROM ChiTietSP JOIN SanPham ON ChiTietSP.MaSP = SanPham.MaSP "
           + "JOIN LoaiSanPham ON LoaiSanPham.MaLoaiSP = SanPham.MaLoaiSP "
                + "where (SanPham.TenSP like N'%"+name+"%') or (SanPham.TenSP like N'"+name+"%') or (SanPham.TenSP like N'%"+name+"')";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelProductCategory mpc = new ModelProductCategory(
                    rs.getString("MaLoaiSP"),
                    rs.getString("TenLoai"),
                    rs.getString("TrangThai")
                );
                ModelProduct mp = new ModelProduct(
                    rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getBytes("Anh"),
                    rs.getString("SPTT"),
                    mpc
                );
                ModelProductDetail s = new ModelProductDetail();
                s.setProductDetailId(rs.getString("MaCTSP"));
                s.setProduct(mp);
                s.setEntryDate(rs.getString("NgayNhap"));
                s.setQuantity(rs.getInt("SoLuong"));
                s.setPrice(rs.getDouble("Gia"));
                s.setDescription(rs.getString("MoTa"));
                dsDetails.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsDetails;
    }
}
