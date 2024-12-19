package Com.View.Form.Statistics;

import Com.Controller.CustomerDAO;
import Com.Controller.OrderDAO;
import Com.Controller.UserDAO;
import Com.Model.ModelCard;
import Com.Model.ModelCustomer;
import Com.Model.ModelOrder;
import Com.Model.ModelUser;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class FormStatistics extends javax.swing.JPanel {
    DefaultTableModel model;
    
    double tongDoanhThu = 0;
    
    UserDAO udao = new UserDAO();
    OrderDAO odao = new OrderDAO();
    CustomerDAO cdao = new CustomerDAO();
    
    public FormStatistics() {
        initComponents();
        setOpaque(false);
        
        tableHoaDon.addTableStyle(jScrollPane1);
        
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        model.setColumnIdentifiers(new Object[]{
            "Mã Hóa Đơn", "Mã Nhân Viên","Mã Bàn","Mã Khách Hàng","Ngày Tạo", "Tổng Tiền","Trạng Thái"
        });
        
        tableHoaDon.setModel(model); // Gán lại mô hình dữ liệu
        // Ngăn thay đổi vị trí và kích thước cột
        tableHoaDon.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
        tableHoaDon.getTableHeader().setResizingAllowed(false);   // Không cho phép thay đổi kích thước cột
        
        ListSelectionModel selectionModel = tableHoaDon.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        initDataTable();
        
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Com.View.Swing.RoundPanel();
        cardTien = new Com.View.Component.Card();
        cardNhanVien = new Com.View.Component.Card();
        cardKhachHang = new Com.View.Component.Card();
        roundPanel2 = new Com.View.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new Com.View.Swing.Table();
        roundPanel3 = new Com.View.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        cardTien.setBackground(new java.awt.Color(153, 153, 255));
        cardTien.setColorGradient(new java.awt.Color(255, 153, 153));

        cardNhanVien.setBackground(new java.awt.Color(102, 255, 51));
        cardNhanVien.setColorGradient(new java.awt.Color(255, 255, 204));

        cardKhachHang.setBackground(new java.awt.Color(102, 204, 255));
        cardKhachHang.setColorGradient(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cardTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cardNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cardKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableHoaDon);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel3.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hóa Đơn Gần Đây");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Com.View.Component.Card cardKhachHang;
    private Com.View.Component.Card cardNhanVien;
    private Com.View.Component.Card cardTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Com.View.Swing.RoundPanel roundPanel1;
    private Com.View.Swing.RoundPanel roundPanel2;
    private Com.View.Swing.RoundPanel roundPanel3;
    private Com.View.Swing.Table tableHoaDon;
    // End of variables declaration//GEN-END:variables

    private  void initDataTable() {
        for(ModelOrder s: odao.getListOrder()){
            if(s.getStatus().equalsIgnoreCase("đã thanh toán")){
                tongDoanhThu+= s.getPrice();
                DecimalFormat formatter = new DecimalFormat("#,###.##");  // Định dạng với dấu phẩy phân cách hàng nghìn
                String gia = formatter.format(s.getPrice())+" vnđ";
                model.addRow(new Object[]{
                    s.getOrderId(), s.getEmployeeID(), s.getModelTable().getTableID(), s.getCustomerID(), s.getCreatedDate(), gia, s.getStatus()
                });
            }
        }
    }
    private void initData() {
        initCardData();
    }

    private void initCardData() {
        int demNV = 0;
        int demKH = 0;
        for(ModelUser m : udao.getListUser()){
            demNV++;
        }
        for(ModelCustomer m : cdao.getListCustomer()){
            demKH++;
        }
        ImageIcon iconKH = new ImageIcon(getClass().getResource("/Com/Icon/Customer.png"));
        ImageIcon iconNV = new ImageIcon(getClass().getResource("/Com/Icon/Staff.png"));
        ImageIcon iconT = new ImageIcon(getClass().getResource("/Com/Icon/Money.png"));
        //card2.setData(new ModelCard("New Student", 5100, null));
        cardTien.setData(new ModelCard("Tổng Doanh Thu",tongDoanhThu,iconT));
        cardKhachHang.setData(new ModelCard("Tổng Khách Hàng",demKH,iconKH));
        cardNhanVien.setData(new ModelCard("Tổng Nhân Viên",demNV,iconNV));
    }
}
