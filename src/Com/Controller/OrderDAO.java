package Com.Controller;

import Com.Model.ModelOrder;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrderDAO {
    DAO dao = new DAO();
    ArrayList<ModelOrder> dsOrder;

    public OrderDAO() {
        dsOrder = getListOrder();
    }
    public boolean addOrder(ModelOrder modelOrder){
        String sql = "INSERT INTO HoaDon(StaffID, MaBan, CustomerID, NgayTao, TongTien, TrangThai)"
                + "VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, String.valueOf(modelOrder.getEmployeeID()));
            ps.setString(2, modelOrder.getTableID());
            ps.setString(3, String.valueOf(modelOrder.getCustomerID()));
            ps.setString(4, modelOrder.getCreatedDate());
            ps.setString(5, String.valueOf(modelOrder.getPrice()));
            ps.setString(6, modelOrder.getStatus());
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public ArrayList<ModelOrder> getListTableUse(){
        ArrayList<ModelOrder> dsTableUses = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon WHERE TrangThai=N'Chưa Thanh Toán'";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                s.setTableID(rs.getString("MaBan"));
                s.setCustomerID(rs.getInt("CustomerID"));
                s.setCreatedDate(rs.getString("NgayTao"));
                s.setPrice(rs.getDouble("TongTien"));
                s.setStatus(rs.getString("TrangThai"));
                dsTableUses.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsTableUses;
    }
    public  ArrayList<ModelOrder> getListOrder(){
        ArrayList<ModelOrder> dsOrders = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                s.setTableID(rs.getString("MaBan"));
                s.setCustomerID(rs.getInt("CustomerID"));
                s.setCreatedDate(rs.getString("NgayTao"));
                s.setPrice(rs.getDouble("TongTien"));
                s.setStatus(rs.getString("TrangThai"));
                dsOrders.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsOrders;
    }
    public boolean updateOrder(ModelOrder modelOrder){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE HoaDon SET StaffID=?, MaBan=?, CustomerID=?, NgayTao=?, TongTien=?, TrangThai=? WHERE MaHD = "+modelOrder.getOrderId());
            ps.setString(2, String.valueOf(modelOrder.getCustomerID()));
            ps.setString(3, modelOrder.getTableID());
            ps.setString(4, String.valueOf(modelOrder.getEmployeeID()));
            ps.setString(5, modelOrder.getCreatedDate());
            ps.setString(6, String.valueOf(modelOrder.getPrice()));
            ps.setString(7, modelOrder.getStatus());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public void deleteOrder(String MaHD) {
        try {
            String deleteBan = "DELETE FROM Ban WHERE MaBan = "+MaHD;
            PreparedStatement ps = dao.getConn().prepareStatement(deleteBan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
}
