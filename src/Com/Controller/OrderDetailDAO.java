package Com.Controller;

import Com.Model.ModelOrderDetail;
import Com.Model.ModelProduct;
import Com.Model.ModelProductCategory;
import Com.Model.ModelProductDetail;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrderDetailDAO {
    DAO dao = new DAO();
    ArrayList<ModelOrderDetail> dsOrderDetail;

    public OrderDetailDAO() {
    }
    public boolean addOrderDetail(ModelOrderDetail modelOrderDetail){
        String sql = "INSERT INTO HoaDon(MaHD, MaCTSP, SoLuong, TongTien)"
                + "VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ps.setString(1, String.valueOf(modelOrderDetail.getOrderID()));
            ps.setString(2, modelOrderDetail.getProductDetail().getProductDetailId());
            ps.setString(3, String.valueOf(modelOrderDetail.getQuantity()));
            ps.setString(4, String.valueOf(modelOrderDetail.getPrice()));

            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return ps.executeUpdate() > 0;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public  ArrayList<ModelOrderDetail> getListOrderDetail(String maHD){
        ArrayList<ModelOrderDetail> dsOrderDetails = new ArrayList<>();
        String sql = "SELECT MaHD, ChiTietHoaDon.MaCTSP, ChiTietHoaDon.SoLuong, TongTien,"
                + " ChiTietSP.MaSP, NgayNhap, ChiTietSP.SoLuong, Gia, MoTa,"
                + " SanPham.TenSP, Anh, SanPham.TrangThai AS TTSP, SanPham.MaLoaiSP, LoaiSanPham.TenLoai,"
                + " LoaiSanPham.TrangThai "
                + "FROM ChiTietHoaDon JOIN ChiTietSP ON ChiTietSP.MaCTSP = ChiTietHoaDon.MaCTSP "
                + "JOIN SanPham ON ChiTietSP.MaSP = SanPham.MaSP JOIN LoaiSanPham ON LoaiSanPham.MaLoaiSP = SanPham.MaLoaiSP WHERE MaHD ="+maHD;
        try{
            PreparedStatement ps = dao.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ModelOrderDetail s = new ModelOrderDetail();
                s.setOrderID(rs.getInt("MaHD"));
                ModelProductCategory mpc = new ModelProductCategory(
                    rs.getString("MaLoaiSP"),
                    rs.getString("TenLoai"),
                    rs.getString("TrangThai")
                );
                ModelProduct mp = new ModelProduct(
                    rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getBytes("Anh"),
                    rs.getString("TTSP"),
                    mpc
                );
                ModelProductDetail mpd = new ModelProductDetail(
                    rs.getString("MaCTSP"),
                    mp,
                    rs.getString("NgayNhap"),
                    rs.getInt("SoLuong"),
                    rs.getDouble("Gia"),
                    rs.getString("MoTa")
                );
                s.setProductDetail(mpd);
                s.setQuantity(rs.getInt("SoLuong"));
                s.setPrice(rs.getDouble("TongTien"));
                dsOrderDetails.add(s);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return dsOrderDetails;
    }
    public boolean updateOrderDetail(ModelOrderDetail modelOrderDetail){
        try {           
            PreparedStatement ps = dao.getConn().prepareStatement("UPDATE HoaDon SET MaHD=?, MaCTSP=?, SoLuong=?, DonGia=? WHERE MaHD = "+modelOrderDetail.getOrderID());
            ps.setString(1, String.valueOf(modelOrderDetail.getOrderID()));
            ps.setString(2, modelOrderDetail.getProductDetail().getProductDetailId());
            ps.setString(3, String.valueOf(modelOrderDetail.getQuantity()));
            ps.setString(4, String.valueOf(modelOrderDetail.getPrice()));

            ps.execute();
            JOptionPane.showMessageDialog(null, "Updated");    
            return true;
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "update not successful");      
        }
        return false;
        
    }
    
    public void deleteOrderDetail(int MaHD,String ma) {
        try {
            String deleteBan = "DELETE FROM ChiTietHoaDon WHERE MaHD = "+MaHD +" AND MaCTSP="+ma;
            PreparedStatement ps = dao.getConn().prepareStatement(deleteBan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại !!!");
        }
    }
}
