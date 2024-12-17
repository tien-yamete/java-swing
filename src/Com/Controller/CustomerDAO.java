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
    
    public void deleteCustomer(String customer) {
        try {
            String del = "delete from Customer where CustomerID="+customer;
            PreparedStatement ps = dao.getConn().prepareStatement(del);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
}
