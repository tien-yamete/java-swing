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
        String sql = "INSERT INTO ChiTietHoaDon(MaHD, MaCTSP, SoLuong, TongTien)"
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

    public  ArrayList<ModelOrderDetail> getListOrderDetail(int maHD){
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
    public boolean updateOrderDetail(ModelOrderDetail modelOrderDetail) throws SQLException{
        String sql = "UPDATE ChiTietHoaDon SET SoLuong=?, TongTien=? WHERE MaHD=? AND MaCTSP=?";
        try (PreparedStatement ps = dao.getConn().prepareStatement(sql)) {
        // Set parameters for the query
        ps.setInt(1, modelOrderDetail.getQuantity()); // SoLuong là int
        ps.setString(2, String.valueOf(modelOrderDetail.getPrice()));
        ps.setInt(3, modelOrderDetail.getOrderID()); // WHERE MaHD=?       
        ps.setString(4, modelOrderDetail.getProductDetail().getProductDetailId()); // WHERE MaCTSP=?

        return ps.executeUpdate() > 0;
        }
    }
    public boolean deleteChiTietHoaDon(int maHD, String MaCTSP) throws SQLException {
        String sql = "DELETE FROM ChiTietHoaDon WHERE MaHD = ? AND MaCTSP = ?";
        try (PreparedStatement stmt = dao.getConn().prepareStatement(sql)) {
            stmt.setInt(1, maHD);
            stmt.setString(2, MaCTSP);
            return stmt.executeUpdate() > 0;
        }
    }
    
    // Xóa các dòng trong bảng ChiTietHoaDon dựa vào MaHD
    public boolean deleteChiTietHoaDonByMaHD(int maHD) throws SQLException {
        String sql = "DELETE FROM ChiTietHoaDon WHERE MaHD = ?";
        try (PreparedStatement stmt = dao.getConn().prepareStatement(sql)) {
            stmt.setInt(1, maHD);
            return stmt.executeUpdate() > 0;
        }
    }

    // Xóa các dòng trong bảng ChiTietHoaDon dựa vào MaCTSP
    public boolean deleteChiTietHoaDonByMaCTSP(String maCTSP) throws SQLException {
        String sql = "DELETE FROM ChiTietHoaDon WHERE MaCTSP = ?";
        try (PreparedStatement stmt = dao.getConn().prepareStatement(sql)) {
            stmt.setString(1, maCTSP);
            return stmt.executeUpdate() > 0;
        }
    }
    
}
