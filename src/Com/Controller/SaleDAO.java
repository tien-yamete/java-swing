package Com.Controller;

import Com.Model.ModelSale;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SaleDAO {
    DAO dao = new DAO();
    ArrayList<ModelSale> dsSale;

    public SaleDAO() {
        dsSale = getListSale();
    }
    public boolean addSale(ModelSale modelSale){
        String sql = "INSERT INTO KhuyenMai(TenKM, MoTa, NgayBatDau, NgayKetThuc, LoaiKM, GiaTriKM, TrangThai)"
                + "VALUES(?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelSale.getNameSale());
            ps.setString(2, modelSale.getDescription());
            ps.setString(3, modelSale.getDayStart());
            ps.setString(4, modelSale.getDayEnd());
            ps.setString(5, modelSale.getSaleType());
            ps.setDouble(6, modelSale.getDiscount());
            ps.setString(7, modelSale.getStatus());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<ModelSale> getListSale(){
        ArrayList<ModelSale> dsSale = new ArrayList<>();
        String sql = "SELECT * FROM KhuyenMai";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelSale s = new ModelSale();
                s.setSaleID(rs.getInt("MaKM"));
                s.setNameSale(rs.getString("TenKM"));
                s.setDescription(rs.getString("MoTa"));
                s.setDayStart(rs.getString("NgayBatDau"));
                s.setDayEnd(rs.getString("NgayKetThuc"));
                s.setSaleType(rs.getString("LoaiKM"));
                s.setDiscount(rs.getDouble("GiaTriKM"));
                s.setStatus(rs.getString("TrangThai"));
                dsSale.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsSale;
    }
    public boolean updateSale(ModelSale modelSale){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE KhuyenMai SET TenKM=?, MoTa=?, NgayBatDau=?, NgayKetThuc=?, LoaiKM=?, GiaTriKM=?, TrangThai=? WHERE MaKM = "+modelSale.getSaleID());
            ps.setString(1, modelSale.getNameSale());
            ps.setString(2, modelSale.getDescription());
            ps.setString(3, modelSale.getDayStart());
            ps.setString(4, modelSale.getDayEnd());
            ps.setString(5, modelSale.getSaleType());
            ps.setDouble(6, modelSale.getDiscount());
            ps.setString(7, modelSale.getStatus());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
    }
    
    public void deleteSale(String IDsale) {
        try {
            String del = "delete from KhuyenMai where MaKM="+IDsale;
            PreparedStatement ps = dao.getConn().prepareStatement(del);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
    
    public  ArrayList<ModelSale> searchSale(String name){
        ArrayList<ModelSale> dsSale = new ArrayList<>();
        String sql = "SELECT * FROM KhuyenMai where (TenKM like N'%"+name+"%') or (TenKM like N'"+name+"%') or (TenKM like N'%"+name+"')";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelSale s = new ModelSale();
                s.setSaleID(rs.getInt("MaKM"));
                s.setNameSale(rs.getString("TenKM"));
                s.setDescription(rs.getString("MoTa"));
                s.setDayStart(rs.getString("NgayBatDau"));
                s.setDayEnd(rs.getString("NgayKetThuc"));
                s.setSaleType(rs.getString("LoaiKM"));
                s.setDiscount(rs.getDouble("GiaTriKM"));
                s.setStatus(rs.getString("TrangThai"));
                dsSale.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsSale;
    }
}
