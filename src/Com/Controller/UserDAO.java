package Com.Controller;

import Com.Model.ModelUser;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserDAO {
    DAO dao = new DAO();
    ArrayList<ModelUser> dsUser;

    public UserDAO() {
        dsUser = getListUser();
    }
    public boolean addUser(ModelUser modelUser){
        String sql = "INSERT INTO Staff(FullName, Gender, DateStaff, PhoneNumber, AddressStaff, UserName, PassWordStaff, Email, Position, ImageStaff)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelUser.getName());
            ps.setString(2, modelUser.getGender());
            ps.setString(3, modelUser.getDateOfBirth());
            ps.setString(4, modelUser.getPhone());
            ps.setString(5, modelUser.getAddress());
            ps.setString(6, modelUser.getUsername());
            ps.setString(7, modelUser.getPassword());
            ps.setString(8, modelUser.getEmail());
            ps.setString(9, modelUser.getPosition());
            if (modelUser.getImage()==null){
                ps.setNull(10, Types.BLOB);
            }else
                ps.setBytes(10, modelUser.getImage());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(HeadlessException | SQLException ex){
        }
        return false;
    }
    
    public  ArrayList<ModelUser> getListUser(){
        ArrayList<ModelUser> dsUser = new ArrayList<>();
        String sql = "SELECT * FROM Staff";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelUser s = new ModelUser();
                s.setId(rs.getInt("StaffID"));
                s.setName(rs.getString("FullName"));
                s.setGender(rs.getString("Gender"));
                s.setDateOfBirth(rs.getString("DateStaff"));
                s.setPhone(rs.getString("PhoneNumber"));
                s.setAddress(rs.getString("AddressStaff"));
                s.setUsername(rs.getString("UserName"));
                s.setPassword(rs.getString("PasswordStaff"));
                s.setEmail(rs.getString("Email"));
                s.setPosition(rs.getString("Position"));
                s.setImage(rs.getBytes("ImageStaff"));
                dsUser.add(s);
            }
        }catch (SQLException ex){
        }
        return dsUser;
    }
    public boolean updateUser(ModelUser modelUser){
//        if(modelUser.getImage()== null){
//            try {           
//            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE Staff SET FullName=?, Gender=?, DateStaff=?, PhoneNumber=?, AddressStaff=?, UserName=?, PassWordStaff=?, Email=?, Position=? WHERE StaffID = "+modelUser.getId());
//            ps.setString(1, modelUser.getName());
//            ps.setString(2, modelUser.getGender());
//            ps.setString(3, modelUser.getDateOfBirth());
//            ps.setString(4, modelUser.getPhone());
//            ps.setString(5, modelUser.getAddress());
//            ps.setString(6, modelUser.getUsername());
//            ps.setString(7, modelUser.getPassword());
//            ps.setString(8, modelUser.getEmail());
//            ps.setString(9, modelUser.getPosition());
//            ps.execute();
//
//            JOptionPane.showMessageDialog(null, "Updated");    
//            return true;
//        } catch (Exception e ) {
//            JOptionPane.showMessageDialog(null, "update not successful");      
//        }s
//        return false;
//            
//        }
//        else{
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE Staff SET FullName=?, Gender=?, DateStaff=?, PhoneNumber=?, AddressStaff=?, UserName=?, PassWordStaff=?, Email=?, Position=?, ImageStaff=? WHERE StaffID = "+modelUser.getId());
            ps.setString(1, modelUser.getName());
            ps.setString(2, modelUser.getGender());
            ps.setString(3, modelUser.getDateOfBirth());
            ps.setString(4, modelUser.getPhone());
            ps.setString(5, modelUser.getAddress());
            ps.setString(6, modelUser.getUsername());
            ps.setString(7, modelUser.getPassword());
            ps.setString(8, modelUser.getEmail());
            ps.setString(9, modelUser.getPosition());
            ps.setBytes(10, modelUser.getImage());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (HeadlessException | SQLException e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public boolean deleteStaff(String staffID) throws SQLException{
            // 1. Xóa chi tiết hóa đơn (ChiTietHoaDon) liên quan thông qua HoaDon
            String sqlDeleteChiTietHoaDon = "DELETE FROM ChiTietHoaDon WHERE MaHD IN " +
                    "(SELECT MaHD FROM HoaDon WHERE StaffID = ?)";
            try (PreparedStatement stmt1 = dao.getConn().prepareStatement(sqlDeleteChiTietHoaDon)) {
                stmt1.setString(1, staffID);
                stmt1.executeUpdate();
            }

            // 2. Xóa hóa đơn (HoaDon) liên quan đến StaffID
            String sqlDeleteHoaDon = "DELETE FROM HoaDon WHERE StaffID = ?";
            try (PreparedStatement stmt2 = dao.getConn().prepareStatement(sqlDeleteHoaDon)) {
                stmt2.setString(1, staffID);
                stmt2.executeUpdate();
            }

            // 3. Xóa nhân viên (Staff)
            String sqlDeleteStaff = "DELETE FROM Staff WHERE StaffID = ?";
            try (PreparedStatement stmt3 = dao.getConn().prepareStatement(sqlDeleteStaff)) {
                stmt3.setString(1, staffID);
            return stmt3.executeUpdate()>0;
        }
    }
    public  ArrayList<ModelUser> searchUser(String name){
        ArrayList<ModelUser> dsUser = new ArrayList<>();
        String sql = "SELECT * FROM Staff where (FullName like N'%"+name+"%') or (FullName like N'"+name+"%') or (FullName like N'%"+name+"')";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelUser s = new ModelUser();
                s.setId(rs.getInt("StaffID"));
                s.setName(rs.getString("FullName"));
                s.setGender(rs.getString("Gender"));
                s.setDateOfBirth(rs.getString("DateStaff"));
                s.setPhone(rs.getString("PhoneNumber"));
                s.setAddress(rs.getString("AddressStaff"));
                s.setUsername(rs.getString("UserName"));
                s.setPassword(rs.getString("PasswordStaff"));
                s.setEmail(rs.getString("Email"));
                s.setPosition(rs.getString("Position"));
                s.setImage(rs.getBytes("ImageStaff"));
                dsUser.add(s);
            }
        }catch (SQLException ex){
        }
        return dsUser;
    }
}
