package Com.Controller;

import Com.Model.ModelProductCategory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductCategoryDAO {
    DAO dao = new DAO();
    ArrayList<ModelProductCategory> dsCategorys;

    public ProductCategoryDAO() {
        dsCategorys = getListProductCategory();
    }
    public boolean addProductCategory(ModelProductCategory modelProductCategory){
        String sql = "INSERT INTO LoaiSanPham(MaLoaiSP, TenLoai, TrangThai)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelProductCategory.getCategoryId());
            ps.setString(2, modelProductCategory.getCategoryName());
            ps.setString(3, modelProductCategory.getStatus());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<ModelProductCategory> getListProductCategory(){
        ArrayList<ModelProductCategory> dsCategorys = new ArrayList<>();
        String sql = "SELECT * FROM LoaiSanPham";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelProductCategory s = new ModelProductCategory();
                s.setCategoryId(rs.getString("MaLoaiSP"));
                s.setCategoryName(rs.getString("TenLoai"));
                s.setStatus(rs.getString("TrangThai"));
                dsCategorys.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsCategorys;
    }
    public boolean updateProductCategory(ModelProductCategory modelProductCategory){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE LoaiSanPham SET MaLoaiSP=?, TenLoai=?, TrangThai=? WHERE MaLoaiSP = '"+modelProductCategory.getCategoryId()+"'");
            ps.setString(1, modelProductCategory.getCategoryId());
            ps.setString(2, modelProductCategory.getCategoryName());
            ps.setString(3, modelProductCategory.getStatus());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public void deleteProduct(String maSP) {
        try {
            String deleteChiTietSP = "DELETE FROM ChiTietSP WHERE MaSP IN (SELECT MaSP FROM SanPham WHERE MaLoaiSP = '"+maSP+ "')";
            PreparedStatement ps = dao.getConn().prepareStatement(deleteChiTietSP);
            ps.executeUpdate();
            String deleteSanPham = "DELETE FROM SanPham WHERE MaLoaiSP = '"+maSP+"'";
            ps = dao.getConn().prepareStatement(deleteSanPham);
            ps.executeUpdate();
            String sql = "delete from LoaiSanPham where MaLoaiSP = '"+maSP+"'";
            ps = dao.getConn().prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
}
