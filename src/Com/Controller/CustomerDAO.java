package Com.Controller;

import Com.Model.ModelCustomer;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CustomerDAO {
    DAO dao = new DAO();
    ArrayList<ModelCustomer> dsCustomer;

    public CustomerDAO() {
        dsCustomer = getListCustomer();
    }
    public boolean addCustomer(ModelCustomer modelCustomer){
        String sql = "INSERT INTO Customer(FullName, Gender, DateStaff, PhoneNumber, AddressStaff, Email)"
                + "VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelCustomer.getName());
            ps.setString(2, modelCustomer.getGender());
            ps.setString(3, modelCustomer.getDateOfBirth());
            ps.setString(4, modelCustomer.getPhone());
            ps.setString(5, modelCustomer.getAddress());
            ps.setString(6, modelCustomer.getEmail());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<ModelCustomer> getListCustomer(){
        ArrayList<ModelCustomer> dsUser = new ArrayList<>();
        String sql = "SELECT * FROM Customer";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelCustomer s = new ModelCustomer();
                s.setId(rs.getInt("CustomerID"));
                s.setName(rs.getString("FullName"));
                s.setGender(rs.getString("Gender"));
                s.setDateOfBirth(rs.getString("DateStaff"));
                s.setPhone(rs.getString("PhoneNumber"));
                s.setAddress(rs.getString("AddressStaff"));
                s.setEmail(rs.getString("Email"));
                dsUser.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsUser;
    }
    public boolean updateCustomer(ModelCustomer modelCustomer){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE Customer SET FullName=?, Gender=?, DateStaff=?, PhoneNumber=?, AddressStaff=?, Email=? WHERE CustomerID = "+modelCustomer.getId());
            ps.setString(1, modelCustomer.getName());
            ps.setString(2, modelCustomer.getGender());
            ps.setString(3, modelCustomer.getDateOfBirth());
            ps.setString(4, modelCustomer.getPhone());
            ps.setString(5, modelCustomer.getAddress());
            ps.setString(6, modelCustomer.getEmail());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
    }
    
    public boolean deleteCustomer(String customerID) throws SQLException {
        // 1. Xóa ChiTietHoaDon liên quan thông qua MaHD từ HoaDon
    String sqlDeleteChiTietHoaDon = "DELETE FROM ChiTietHoaDon WHERE MaHD IN (" +
            "SELECT MaHD FROM HoaDon WHERE CustomerID = ?)";
    try (PreparedStatement stmt0 = dao.getConn().prepareStatement(sqlDeleteChiTietHoaDon)) {
        stmt0.setString(1, customerID);
        stmt0.executeUpdate();
    }

    // 2. Xóa các hóa đơn (HoaDon) liên quan đến Customer
    String sqlDeleteHoaDon = "DELETE FROM HoaDon WHERE CustomerID = ?";
    try (PreparedStatement stmt1 = dao.getConn().prepareStatement(sqlDeleteHoaDon)) {
        stmt1.setString(1, customerID);
        stmt1.executeUpdate();
    }

    // 3. Xóa khách hàng từ bảng Customer
    String sqlDeleteCustomer = "DELETE FROM Customer WHERE CustomerID = ?";
    try (PreparedStatement stmt2 = dao.getConn().prepareStatement(sqlDeleteCustomer)) {
        stmt2.setString(1, customerID);
        return stmt2.executeUpdate() > 0;
    }
    }
}
