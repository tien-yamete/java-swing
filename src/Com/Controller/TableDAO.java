package Com.Controller;

import Com.Model.ModelTable;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TableDAO {
    DAO dao = new DAO();
    ArrayList<ModelTable> dsTable;

    public TableDAO() {
        dsTable = getListTable();
    }
    public boolean addTable(ModelTable modelTable){
        String sql = "INSERT INTO Ban(MaBan, TenBan, TrangThai)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, modelTable.getTableID());
            ps.setString(2, modelTable.getTableName());
            ps.setString(3, modelTable.getStatus());
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<ModelTable> getListTable(){
        ArrayList<ModelTable> dsTables = new ArrayList<>();
        String sql = "SELECT * FROM Ban";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelTable s = new ModelTable();
                s.setTableID(rs.getString("MaBan"));
                s.setTableName(rs.getString("TenBan"));
                s.setStatus(rs.getString("TrangThai"));
                dsTables.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsTables;
    }
    public boolean updateTable(ModelTable modelTable){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE Ban SET MaBan=?, TenBan=?, TrangThai=? WHERE MaBan = '"+modelTable.getTableID()+"'");
            ps.setString(1, modelTable.getTableID());
            ps.setString(2, modelTable.getTableName());
            ps.setString(3, modelTable.getStatus());
            ps.execute();   
            JOptionPane.showMessageDialog(null, "updated ");      
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public void deleteTable(String maBan) {
        try {
            String deleteBan = "DELETE FROM Ban WHERE MaBan = '"+maBan+ "'";
            PreparedStatement ps = dao.getConn().prepareStatement(deleteBan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
}
