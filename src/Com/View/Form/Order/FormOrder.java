package Com.View.Form.Order;

import Com.Controller.OrderDAO;
import Com.Controller.OrderDetailDAO;
import Com.Controller.TableDAO;
import Com.Model.ModelOrder;
import Com.Model.ModelOrderDetail;
import Com.Model.ModelTable;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class FormOrder extends javax.swing.JPanel {
    OrderDAO odao = new OrderDAO();
    DefaultTableModel model;
    DefaultTableModel modelHD;
    ModelOrder modelOrderUse;
    TableDAO tdao = new TableDAO();
    String pricePattern = "^[0-9]*$";
    OrderDetailDAO oddao = new OrderDetailDAO();
    public FormOrder() {
        initComponents();
        setOpaque(false);
        searchText2.setHint("Search");
        tableHoaDon.addTableStyle(jScrollPane1);
        tableHD.addTableStyle(jScrollPane2);
                
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        modelHD = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        model.setColumnIdentifiers(new Object[]{
            "Mã Hóa Đơn", "Mã Nhân Viên","Mã Bàn","Mã Khách Hàng","Ngày Tạo", "Tổng Tiền","Trạng Thái"
        });
        tableHoaDon.setModel(model); // Gán lại mô hình dữ liệu
        
        modelHD.setColumnIdentifiers(new Object[]{
            "Mã CTSP","Tên Sản Phẩm","Loại Sản Phẩm","Số Lượng", "Đơn Giá","Thành Tiền"
        });
        tableHD.setModel(modelHD); // Gán lại mô hình dữ liệu
        
        // Ngăn thay đổi vị trí và kích thước cột
        tableHoaDon.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
        tableHoaDon.getTableHeader().setResizingAllowed(false);   // Không cho phép thay đổi kích thước cột
        
        tableHD.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
        tableHD.getTableHeader().setResizingAllowed(false);   // Không cho phép thay đổi kích thước cột

        ListSelectionModel selectionModel = tableHoaDon.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        initDataTable();
        initListenerTable();
        
        ListSelectionModel selectionModelHD = tableHD.getSelectionModel();
        selectionModelHD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoaDonPopupMenu = new javax.swing.JPopupMenu();
        xoaMenuItem = new javax.swing.JMenuItem();
        roundPanel1 = new Com.View.Swing.RoundPanel();
        searchText2 = new Com.View.Swing.SearchText();
        jLabel2 = new javax.swing.JLabel();
        ngayBDChoice = new com.toedter.calendar.JDateChooser();
        ngayKTChoice = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ttComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        locButton = new javax.swing.JButton();
        roundPanel2 = new Com.View.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new Com.View.Swing.Table();
        roundPanel4 = new Com.View.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        roundPanel5 = new Com.View.Swing.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHD = new Com.View.Swing.Table();
        roundPanel6 = new Com.View.Swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();

        xoaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/delete.png"))); // NOI18N
        xoaMenuItem.setText("Xóa Hóa Đơn");
        xoaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaMenuItemActionPerformed(evt);
            }
        });
        hoaDonPopupMenu.add(xoaMenuItem);

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        searchText2.setBackground(new java.awt.Color(204, 204, 204));
        searchText2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchText2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/search.png"))); // NOI18N
        searchText2.setSelectionColor(new java.awt.Color(0, 0, 51));
        searchText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText2KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mã Hóa Đơn :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Từ Ngày :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Đến Ngày :");

        ttComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ttComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa Thanh Toán", "Đã Thanh Toán", "Đã Hủy" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Trạng Thái :");

        locButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        locButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/search.png"))); // NOI18N
        locButton.setText("Lọc");
        locButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayBDChoice, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayKTChoice, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ttComboBox, 0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(locButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayBDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locButton))
                        .addComponent(ngayKTChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchText2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Hóa Đơn");

        refreshButton.setBackground(new java.awt.Color(204, 204, 204));
        refreshButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/sync.png"))); // NOI18N
        refreshButton.setText("Làm mới");
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addGap(36, 36, 36))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel5.setBackground(new java.awt.Color(60, 60, 60));

        tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableHD);

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel6.setBackground(new java.awt.Color(60, 60, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông Tin Chi Tiết Hóa Đơn");

        javax.swing.GroupLayout roundPanel6Layout = new javax.swing.GroupLayout(roundPanel6);
        roundPanel6.setLayout(roundPanel6Layout);
        roundPanel6Layout.setHorizontalGroup(
            roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel6Layout.setVerticalGroup(
            roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        if(searchText2.getText().matches(pricePattern)&& !searchText2.getText().equals(""))
        {
            model = (DefaultTableModel) tableHoaDon.getModel();
            model.setRowCount(0);
        
            for(ModelOrder s: odao.searchOrder(Integer.parseInt(searchText2.getText()))){
            model.addRow(new Object[]{
                s.getOrderId(), s.getEmployeeID(), s.getModelTable().getTableID(), s.getCustomerID(), s.getCreatedDate(), s.getPrice(), s.getStatus()
            });
        }
        }else if(searchText2.getText().equals("")){
            refreshUser();
        }
    }//GEN-LAST:event_searchText2KeyReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
        searchText2.setText("");
        modelHD = (DefaultTableModel) tableHD.getModel();
        modelHD.setRowCount(0);
        ngayBDChoice.setDate(null);
        ngayKTChoice.setDate(null);
        ttComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void xoaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaMenuItemActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                if(modelOrderUse.getStatus().equalsIgnoreCase("chưa thanh toán")){
                    JOptionPane.showMessageDialog(null, "Hóa đơn chưa được thanh toán, hãy hủy đơn hoặc thanh toán rồi xóa !!!");
                    return;
                }
                try {
                    odao.deleteHoaDon(modelOrderUse.getOrderId());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Xóa hóa đơn không thành công !!!");
                }
                JOptionPane.showMessageDialog(null, "Xóa hóa đơn thành công");
                tdao.updateTable(new ModelTable(modelOrderUse.getModelTable().getTableID(), modelOrderUse.getModelTable().getTableName(),"Còn Trống"));
                refreshUser();
                modelHD = (DefaultTableModel) tableHD.getModel();
                modelHD.setRowCount(0);
            }
    }//GEN-LAST:event_xoaMenuItemActionPerformed

    private void locButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locButtonActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        if(ngayBDChoice.getDate()!= null && ngayKTChoice.getDate()!= null){
            String ngayBD = formatter.format(ngayBDChoice.getDate());
            String ngayKT = formatter.format(ngayKTChoice.getDate());
            String trangThai = ttComboBox.getSelectedItem().toString();
            
            model = (DefaultTableModel) tableHoaDon.getModel();
            model.setRowCount(0);
            
            ArrayList<ModelOrder> modelOrderList = odao.searchOrderDate(ngayBD,ngayKT,trangThai);
            for(ModelOrder s : modelOrderList){
                model.addRow(new Object[]{
                    s.getOrderId(), s.getEmployeeID(), s.getModelTable().getTableID(), s.getCustomerID(), s.getCreatedDate(), s.getPrice(), s.getStatus()
                });
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ ngày !!!");
        }
        
    }//GEN-LAST:event_locButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu hoaDonPopupMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton locButton;
    private com.toedter.calendar.JDateChooser ngayBDChoice;
    private com.toedter.calendar.JDateChooser ngayKTChoice;
    private javax.swing.JButton refreshButton;
    private Com.View.Swing.RoundPanel roundPanel1;
    private Com.View.Swing.RoundPanel roundPanel2;
    private Com.View.Swing.RoundPanel roundPanel4;
    private Com.View.Swing.RoundPanel roundPanel5;
    private Com.View.Swing.RoundPanel roundPanel6;
    private Com.View.Swing.SearchText searchText2;
    private Com.View.Swing.Table tableHD;
    private Com.View.Swing.Table tableHoaDon;
    private javax.swing.JComboBox<String> ttComboBox;
    private javax.swing.JMenuItem xoaMenuItem;
    // End of variables declaration//GEN-END:variables

    private void refreshUser(){
        model = (DefaultTableModel) tableHoaDon.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelOrder s: odao.getListOrder()){
            DecimalFormat formatter = new DecimalFormat("#,###.##");  // Định dạng với dấu phẩy phân cách hàng nghìn
            String gia = formatter.format(s.getPrice())+" vnđ";
            model.addRow(new Object[]{
                s.getOrderId(), s.getEmployeeID(), s.getModelTable().getTableID(), s.getCustomerID(), s.getCreatedDate(), gia, s.getStatus()
            });
        }
    }

    private void initListenerTable() {
        // Thêm MouseListener cho bảng tableHD chỉ một lần
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                // Kiểm tra xem chuột phải có được nhấn không
                if (SwingUtilities.isRightMouseButton(evt)) {
                    // Lấy chỉ số dòng được nhấn
                    int row = tableHoaDon.rowAtPoint(evt.getPoint());
                    modelOrderUse = odao.getListOrder().get(row);
                    if (row >= 0) {
                       // Chọn dòng đó
                        tableHoaDon.setRowSelectionInterval(row, row);
                        initDataTableHD();
                        // Hiển thị menu popup tại vị trí chuột
                        hoaDonPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                    }
                }
                
                else if(SwingUtilities.isLeftMouseButton(evt)){
                    int row = tableHoaDon.rowAtPoint(evt.getPoint());
                    modelOrderUse = odao.getListOrder().get(row);
                    tableHoaDon.setRowSelectionInterval(row, row);

                    initDataTableHD();
                }
            }
        });
    }
    private  void initDataTableHD() {
        modelHD = (DefaultTableModel) tableHD.getModel();
        modelHD.setRowCount(0);
        for(ModelOrderDetail s: oddao.getListOrderDetail(modelOrderUse.getOrderId())){
            DecimalFormat formatter = new DecimalFormat("#,###.##");  // Định dạng với dấu phẩy phân cách hàng nghìn
            String gia = formatter.format(s.getPrice())+" vnđ";
            modelHD.addRow(new Object[]{
                s.getProductDetail().getProductDetailId(), s.getProductDetail().getProduct().getProductName(),s.getProductDetail().getProductDetailId()
                    , s.getQuantity(), s.getProductDetail().getPrice(),gia
            });       
        }
    }
}
