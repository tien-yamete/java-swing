package Com.Controller;

import Com.Model.ModelOrder;
import Com.Model.ModelTable;
import java.sql.*;
import java.util.ArrayList;

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
            ps.setString(2, modelOrder.getModelTable().getTableID());
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
        String sql = "SELECT HoaDon.*, TenBan,Ban.TrangThai AS TTB FROM HoaDon JOIN Ban ON HoaDon.MaBan = Ban.Maban WHERE HoaDon.TrangThai=N'Chưa Thanh Toán'";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                ModelTable m = new ModelTable(
                    rs.getString("MaBan"),
                    rs.getString("TenBan"),
                    rs.getString("TTB")
                );
                s.setModelTable(m);
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
        String sql = "SELECT HoaDon.*, TenBan,Ban.TrangThai AS TTB FROM HoaDon JOIN Ban ON HoaDon.MaBan = Ban.Maban";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                ModelTable m = new ModelTable(
                    rs.getString("MaBan"),
                    rs.getString("TenBan"),
                    rs.getString("TTB")
                );
                s.setModelTable(m);
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
    public boolean updateOrder(ModelOrder modelOrder) throws SQLException{        
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE HoaDon SET StaffID=?, MaBan=?, CustomerID=?, NgayTao=?, TongTien=?, TrangThai=? WHERE MaHD = "+modelOrder.getOrderId());
            ps.setString(1, String.valueOf(modelOrder.getCustomerID()));
            ps.setString(2, modelOrder.getModelTable().getTableID());
            ps.setString(3, String.valueOf(modelOrder.getEmployeeID()));
            ps.setString(4, modelOrder.getCreatedDate());
            ps.setString(5, String.valueOf(modelOrder.getPrice()));
            ps.setString(6, modelOrder.getStatus());
            return ps.executeUpdate()>0;
    }

    // Xóa hóa đơn từ bảng HoaDon và xử lý các bảng liên quan
    public boolean deleteHoaDon(int maHD) throws SQLException {
        // Trước tiên, xóa dữ liệu liên quan trong bảng ChiTietHoaDon
        OrderDetailDAO cthdDAO = new OrderDetailDAO();
        cthdDAO.deleteChiTietHoaDonByMaHD(maHD);

        // Sau đó xóa bản ghi trong bảng HoaDon
        String sql = "DELETE FROM HoaDon WHERE MaHD = ?";
        try (PreparedStatement stmt = dao.getConn().prepareStatement(sql)) {
            stmt.setInt(1, maHD);
            return stmt.executeUpdate() > 0;
        }
    }
    
    public  ArrayList<ModelOrder> searchOrder(int name){
        ArrayList<ModelOrder> dsOrders = new ArrayList<>();
        String sql = "SELECT HoaDon.*, TenBan,Ban.TrangThai AS TTB FROM HoaDon JOIN Ban ON HoaDon.MaBan = Ban.Maban where MaHD = "+name;
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                ModelTable m = new ModelTable(
                    rs.getString("MaBan"),
                    rs.getString("TenBan"),
                    rs.getString("TTB")
                );
                s.setModelTable(m);
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
    
    public  ArrayList<ModelOrder> searchOrderDate(String nbd, String nkt, String tt){
        ArrayList<ModelOrder> dsOrders = new ArrayList<>();
        String sql = "SELECT HoaDon.*, TenBan,Ban.TrangThai AS TTB FROM HoaDon JOIN Ban ON HoaDon.MaBan = Ban.Maban where HoaDon.TrangThai = N'"+tt+"' AND (NgayTao BETWEEN '"+nbd+"' AND '"+nkt+"')";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrder s = new ModelOrder();
                s.setOrderId(rs.getInt("MaHD"));
                s.setEmployeeID(rs.getInt("StaffID"));
                ModelTable m = new ModelTable(
                    rs.getString("MaBan"),
                    rs.getString("TenBan"),
                    rs.getString("TTB")
                );
                s.setModelTable(m);
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
}
