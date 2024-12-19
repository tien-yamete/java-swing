package Com.Controller;

import Com.Model.ModelProductCategory;
import java.awt.HeadlessException;
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
        }catch(HeadlessException | SQLException ex){
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
    
  
    public boolean deleteLoaiSanPham(String maLoaiSP) throws SQLException {
         // 1. Xóa ChiTietHoaDon liên quan thông qua ChiTietSP và SanPham
        String sqlDeleteChiTietHoaDon = "DELETE FROM ChiTietHoaDon WHERE MaCTSP IN (" +
            "SELECT MaCTSP FROM ChiTietSP WHERE MaSP IN (" +
            "SELECT MaSP FROM SanPham WHERE MaLoaiSP = ?))";
        try (PreparedStatement stmt0 = dao.getConn().prepareStatement(sqlDeleteChiTietHoaDon)) {
            stmt0.setString(1, maLoaiSP);
            stmt0.executeUpdate();
        }

        // 2. Xóa ChiTietSP liên quan thông qua MaSP trong SanPham
        String sqlDeleteChiTietSP = "DELETE FROM ChiTietSP WHERE MaSP IN (" +
            "SELECT MaSP FROM SanPham WHERE MaLoaiSP = ?)";
        try (PreparedStatement stmt1 = dao.getConn().prepareStatement(sqlDeleteChiTietSP)) {
            stmt1.setString(1, maLoaiSP);
            stmt1.executeUpdate();
        }

        // 3. Xóa SanPham liên quan đến MaLoaiSP
        String sqlDeleteSanPham = "DELETE FROM SanPham WHERE MaLoaiSP = ?";
        try (PreparedStatement stmt2 = dao.getConn().prepareStatement(sqlDeleteSanPham)) {
            stmt2.setString(1, maLoaiSP);
            stmt2.executeUpdate();
        }

        // 4. Xóa LoaiSanPham liên quan
        String sqlDeleteLoaiSP = "DELETE FROM LoaiSanPham WHERE MaLoaiSP = ?";
        try (PreparedStatement stmt3 = dao.getConn().prepareStatement(sqlDeleteLoaiSP)) {
            stmt3.setString(1, maLoaiSP);
            return stmt3.executeUpdate() > 0;
        }
    }
}