package Com.Controller;

import Com.Model.ModelTable;
import java.awt.HeadlessException;
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
        }catch(HeadlessException | SQLException ex){
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
        }catch (SQLException ex){
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
            return true;
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public boolean deleteTable(String maBan) throws SQLException {
        // 1. Xóa ChiTietHoaDon liên quan thông qua MaHD từ HoaDon
    String sqlDeleteChiTietHoaDon = "DELETE FROM ChiTietHoaDon WHERE MaHD IN (" +
            "SELECT MaHD FROM HoaDon WHERE MaBan = ?)";
    try (PreparedStatement stmt0 = dao.getConn().prepareStatement(sqlDeleteChiTietHoaDon)) {
        stmt0.setString(1, maBan);
        stmt0.executeUpdate();
    }

    // 2. Xóa các hóa đơn (HoaDon) liên quan đến bàn
    String sqlDeleteHoaDon = "DELETE FROM HoaDon WHERE MaBan = ?";
    try (PreparedStatement stmt1 = dao.getConn().prepareStatement(sqlDeleteHoaDon)) {
        stmt1.setString(1, maBan);
        stmt1.executeUpdate();
    }

    // 3. Xóa bàn từ bảng Ban
    String sqlDeleteBan = "DELETE FROM Ban WHERE MaBan = ?";
    try (PreparedStatement stmt2 = dao.getConn().prepareStatement(sqlDeleteBan)) {
        stmt2.setString(1, maBan);
        return stmt2.executeUpdate() > 0;
    }
    }
}
