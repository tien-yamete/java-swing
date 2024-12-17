package Com.View.Form.Sell;

import Com.Controller.OrderDAO;
import Com.Controller.OrderDetailDAO;
import Com.Controller.ProductDetailDAO;
import Com.Controller.TableDAO;
import Com.Model.ImageWrapper;
import Com.Model.ModelOrder;
import Com.Model.ModelOrderDetail;
import Com.Model.ModelProductDetail;
import Com.Model.ModelTable;
import Com.Swing.Scrollbar.ScrollBarCustom;
import Com.View.Login.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FormSell extends javax.swing.JPanel {
    DefaultTableModel model;
    DefaultTableModel modelHD;
    boolean kt;
    ProductDetailDAO pddao = new ProductDetailDAO();
    TableDAO tdao = new TableDAO();
    String maBanSelected =null;
    private Frame Dashboard;
    ModelProductDetail modelProductDetail;
    ModelTable modelTable;
    ModelTable banSD = null;
    OrderDAO odao = new OrderDAO();
    OrderDetailDAO oddao =  new OrderDetailDAO();
    public FormSell() {
        initComponents();
        setOpaque(false);
        
        searchText2.setHint("Search");
        tableSP.addTableStyle(jScrollPane1);
        tableHD.addTableStyle(jScrollPane2);
        jScrollPane3.setVerticalScrollBar(new ScrollBarCustom());
        //jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        model.setColumnIdentifiers(new Object[]{
            "Ảnh", "Mã Chi Tiết SP","Mã Sản Phẩm","Tên Sản Phẩm","Loại Sản Phẩm", "Ngày Nhập","Số Lượng","Giá Bán","Trạng Thái"
        });
        tableSP.setModel(model); // Gán lại mô hình dữ liệu
        
        // Ngăn thay đổi vị trí và kích thước cột
        tableSP.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
        tableSP.getTableHeader().setResizingAllowed(false);   // Không cho phép thay đổi kích thước cột

        ListSelectionModel selectionModel = tableSP.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Dữ liệu cho bảng hóa đơn
        modelHD = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        modelHD.setColumnIdentifiers(new Object[]{
            "Mã CTSP","Tên Sản Phẩm","Loại Sản Phẩm","Số Lượng", "Đơn Giá","Thành Tiền"
        });
        tableHD.setModel(modelHD); // Gán lại mô hình dữ liệu
        
        // Ngăn thay đổi vị trí và kích thước cột
        tableHD.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
        tableHD.getTableHeader().setResizingAllowed(false);   // Không cho phép thay đổi kích thước cột

        SpinnerNumberModel modelS = new SpinnerNumberModel(1, 1, 100, 1); 
        soLuongSpinner.setModel(modelS);
        
        ListSelectionModel selectionModelHD = tableHD.getSelectionModel();
        selectionModelHD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        initDataTableSP();
        initListenerTable();
        jPanel1.setLayout(new GridLayout(0, 4, 10, 10));
        initPanel1();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        themBanMenuItem = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        taoDonMenuItem = new javax.swing.JMenuItem();
        vaoBanMenuItem = new javax.swing.JMenuItem();
        xoaBanMenuItem = new javax.swing.JMenuItem();
        banMenu = new javax.swing.JMenu();
        donBanMenuItem = new javax.swing.JMenuItem();
        hoanThanhMenuItem = new javax.swing.JMenuItem();
        roundPanel2 = new Com.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new Com.Swing.Table();
        roundPanel4 = new Com.Swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        imageAvatar1 = new Com.Swing.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        maCTSPText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loaiSPText = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        giaBanText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        soLuongSpinner = new javax.swing.JSpinner();
        resetButton = new javax.swing.JButton();
        thenMonButton = new javax.swing.JButton();
        roundPanel5 = new Com.Swing.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHD = new Com.Swing.Table();
        roundPanel6 = new Com.Swing.RoundPanel();
        searchText2 = new Com.Swing.SearchText();
        roundPanel7 = new Com.Swing.RoundPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        thanhToanButton = new javax.swing.JButton();
        huyDonButton = new javax.swing.JButton();
        roundPanel8 = new Com.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new Com.Swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        maBanSDText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tenBanSDText = new javax.swing.JLabel();
        roiBanButton = new javax.swing.JButton();

        themBanMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/add.png"))); // NOI18N
        themBanMenuItem.setText("Thêm Bàn");
        themBanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBanMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(themBanMenuItem);

        taoDonMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/order.png"))); // NOI18N
        taoDonMenuItem.setText("Tạo Đơn");
        taoDonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taoDonMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu2.add(taoDonMenuItem);

        vaoBanMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/join.png"))); // NOI18N
        vaoBanMenuItem.setText("Vào Bàn");
        vaoBanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaoBanMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu2.add(vaoBanMenuItem);

        xoaBanMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/delete.png"))); // NOI18N
        xoaBanMenuItem.setText("Xóa Bàn");
        xoaBanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBanMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu2.add(xoaBanMenuItem);

        banMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/table.png"))); // NOI18N
        banMenu.setText("Bàn");

        donBanMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/sync.png"))); // NOI18N
        donBanMenuItem.setText("Dọn Bàn");
        donBanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donBanMenuItemActionPerformed(evt);
            }
        });
        banMenu.add(donBanMenuItem);

        hoanThanhMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/check-mark.png"))); // NOI18N
        hoanThanhMenuItem.setText("Hoàn Thành Dọn Bàn");
        hoanThanhMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoanThanhMenuItemActionPerformed(evt);
            }
        });
        banMenu.add(hoanThanhMenuItem);

        jPopupMenu2.add(banMenu);

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableSP);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sản Phẩm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã CTSP :");

        maCTSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maCTSPText.setForeground(new java.awt.Color(255, 255, 255));
        maCTSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maCTSPText.setText("NULL");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tên Sản Phẩm :");

        tenText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenText.setForeground(new java.awt.Color(255, 255, 255));
        tenText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenText.setText("NULL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Loại Sản Phẩm :");

        loaiSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loaiSPText.setForeground(new java.awt.Color(255, 255, 255));
        loaiSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loaiSPText.setText("NULL");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Giá Bán :");

        giaBanText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaBanText.setForeground(new java.awt.Color(255, 255, 255));
        giaBanText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        giaBanText.setText("NULL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Số Lượng :");

        soLuongSpinner.setBorder(null);

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        thenMonButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thenMonButton.setText("Thêm");
        thenMonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thenMonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maCTSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loaiSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giaBanText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(resetButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soLuongSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel4Layout.createSequentialGroup()
                                .addComponent(thenMonButton)
                                .addGap(37, 37, 37)))))
                .addGap(37, 37, 37))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maCTSPText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tenText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loaiSPText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(giaBanText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(soLuongSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(thenMonButton))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel6.setBackground(new java.awt.Color(60, 60, 60));

        searchText2.setBackground(new java.awt.Color(204, 204, 204));
        searchText2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchText2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/search.png"))); // NOI18N
        searchText2.setSelectionColor(new java.awt.Color(0, 0, 51));
        searchText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundPanel6Layout = new javax.swing.GroupLayout(roundPanel6);
        roundPanel6.setLayout(roundPanel6Layout);
        roundPanel6Layout.setHorizontalGroup(
            roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel6Layout.setVerticalGroup(
            roundPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel7.setBackground(new java.awt.Color(60, 60, 60));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Mã Hóa Đơn :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("NULL");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Bàn :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("NULL");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Tổng Tiền :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("NULL");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Tiền Khách Trả :");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Tiền Trả Lại :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Ngày Tạo :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("NULL");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Nhân Viên :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("NULL");

        thanhToanButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanhToanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/bill.png"))); // NOI18N
        thanhToanButton.setText("Thanh Toán");
        thanhToanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhToanButtonActionPerformed(evt);
            }
        });

        huyDonButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        huyDonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/delete.png"))); // NOI18N
        huyDonButton.setText("Hủy Đơn");

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel7Layout.createSequentialGroup()
                        .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel7Layout.createSequentialGroup()
                                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(roundPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 27, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundPanel7Layout.createSequentialGroup()
                                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(roundPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(roundPanel7Layout.createSequentialGroup()
                        .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(roundPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thanhToanButton)
                            .addComponent(huyDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundPanel7Layout.setVerticalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(20, 20, 20)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(thanhToanButton))
                .addGap(20, 20, 20)
                .addGroup(roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(huyDonButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        roundPanel8.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Hóa Đơn");

        javax.swing.GroupLayout roundPanel8Layout = new javax.swing.GroupLayout(roundPanel8);
        roundPanel8.setLayout(roundPanel8Layout);
        roundPanel8Layout.setHorizontalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel8Layout.setVerticalGroup(
            roundPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bàn");

        jScrollPane3.setBackground(new java.awt.Color(60, 60, 60));
        jScrollPane3.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel1);

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bàn Đang Sử Dụng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Mã Bàn :");

        maBanSDText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maBanSDText.setForeground(new java.awt.Color(255, 255, 255));
        maBanSDText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maBanSDText.setText("Chưa Sử Dụng");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Tên Bàn :");

        tenBanSDText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenBanSDText.setForeground(new java.awt.Color(255, 255, 255));
        tenBanSDText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenBanSDText.setText("Chưa Sử Dụng");

        roiBanButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roiBanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/join.png"))); // NOI18N
        roiBanButton.setText("Rời Bàn");
        roiBanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roiBanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maBanSDText))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tenBanSDText)))
                .addGap(24, 24, 24))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(roiBanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(maBanSDText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tenBanSDText))
                .addGap(18, 18, 18)
                .addComponent(roiBanButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        for(ModelProductDetail s: pddao.searchProduct(searchText2.getText())){
            if(s.getQuantity()!=0){
                model.addRow(new Object[]{
                new ImageWrapper(s.getProduct().getImage()), s.getProductDetailId(), s.getProduct().getProductId(), s.getProduct().getProductName(), s.getProduct().getProductCategory().getCategoryName(), s.getEntryDate(), s.getQuantity(), s.getPrice(), s.getProduct().getStatus()
                });
            }
        }
        tableSP.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
        @Override
            public void setValue(Object value) {
                if (value instanceof ImageWrapper) {
                    ImageWrapper wrapper = (ImageWrapper) value;
                    setIcon(wrapper.getImageIcon());
                    setText("");
                } else {
                    setIcon(null);
                    setText("");
                }
            }
        });

        // Cập nhật chiều cao hàng
        tableSP.setRowHeight(80);
    }//GEN-LAST:event_searchText2KeyReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        if(SwingUtilities.isRightMouseButton(evt)){
            jPopupMenu1.show(jPanel1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void themBanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBanMenuItemActionPerformed
        InputTable inputTable = new InputTable(Dashboard, true);
        inputTable.setVisible(true);
        if(inputTable.isKt()){
            updateTable();
        }
    }//GEN-LAST:event_themBanMenuItemActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        refreshTableSP();
        searchText2.setText("");
        soLuongSpinner.setValue(0);
        modelProductDetail = null;
    }//GEN-LAST:event_resetButtonActionPerformed

    private void xoaBanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBanMenuItemActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                tdao.deleteTable(maBanSelected);
                updateTable();
            }
    }//GEN-LAST:event_xoaBanMenuItemActionPerformed

    private void vaoBanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaoBanMenuItemActionPerformed
        if(!banSD.getStatus().equalsIgnoreCase("có khách")){
            JOptionPane.showMessageDialog(null, "Bàn chưa có đơn vui lòng tạo đơn !!!");
            return;
        }
        maBanSDText.setText(banSD.getTableID());
        tenBanSDText.setText(banSD.getTableName());
        initDataTableHD();
    }//GEN-LAST:event_vaoBanMenuItemActionPerformed

    private void donBanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donBanMenuItemActionPerformed
//        
//        EditTable editTable = new EditTable(Dashboard, true, modelTable);
//        editTable.setVisible(true);
//        if(editTable.isKt()){
//            updateTable();
//        }
        if(banSD.getStatus().equalsIgnoreCase("có khách")){
            JOptionPane.showMessageDialog(null, "bàn đang có khách không thể dọn !!!");
            return;
        }
        tdao.updateTable(new ModelTable(banSD.getTableID(),banSD.getTableName(),"Đang Dọn Bàn"));
        updateTable();
    }//GEN-LAST:event_donBanMenuItemActionPerformed

    private void thanhToanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhToanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thanhToanButtonActionPerformed

    private void taoDonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taoDonMenuItemActionPerformed
        if(banSD.getStatus().equalsIgnoreCase("đang dọn bàn")||banSD.getStatus().equalsIgnoreCase("có khách")){
            JOptionPane.showMessageDialog(null, "Bàn hiện tại đang không tạo được menu mới!!!");
            return;
        }
        try{
            InputOrder inputOrder = new InputOrder(Dashboard, true, banSD);
            inputOrder.setVisible(true);
            LocalDate l = LocalDate.now();

            if(inputOrder.isKt()){
                ModelOrder m = new ModelOrder(Login.user.getId(),banSD.getTableID(),inputOrder.getMaKH(),String.valueOf(l),0,"Chưa Thanh Toán");
                odao.addOrder(m);
                tdao.updateTable(new ModelTable(banSD.getTableID(), banSD.getTableName(),"Có Khách"));
                updateTable();
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tạo hóa đơn thất bại!!!");
        }
        
    }//GEN-LAST:event_taoDonMenuItemActionPerformed

    private void hoanThanhMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoanThanhMenuItemActionPerformed
        if(!banSD.getStatus().equalsIgnoreCase("đang dọn bàn")|| banSD.getStatus().equalsIgnoreCase("có khách")){
            JOptionPane.showMessageDialog(null, "bàn đang trống hoặc đang được sử dụng !!!");
            return;
        }
        tdao.updateTable(new ModelTable(banSD.getTableID(),banSD.getTableName(),"Còn Trống"));
        updateTable();
    }//GEN-LAST:event_hoanThanhMenuItemActionPerformed

    private void roiBanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roiBanButtonActionPerformed
        maBanSDText.setText("Chưa Sử Dụng");
        tenBanSDText.setText("Chưa Sử Dụng");
        modelHD = (DefaultTableModel) tableHD.getModel();
        modelHD.setRowCount(0);
    }//GEN-LAST:event_roiBanButtonActionPerformed

    private void thenMonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thenMonButtonActionPerformed
        //ModelOrderDetail themMon = new ModelOrderDetail(banSD.getTableID(), modelProductDetail, Integer.parseInt(soLuongSpinner.getValue()), Double.parseDouble(soLuongSpinner.getValue()*modelProductDetail.getPrice()));
        
        //modelProductDetail;
    }//GEN-LAST:event_thenMonButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu banMenu;
    private javax.swing.JMenuItem donBanMenuItem;
    private javax.swing.JLabel giaBanText;
    private javax.swing.JMenuItem hoanThanhMenuItem;
    private javax.swing.JButton huyDonButton;
    private Com.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel loaiSPText;
    private javax.swing.JLabel maBanSDText;
    private javax.swing.JLabel maCTSPText;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton roiBanButton;
    private Com.Swing.RoundPanel roundPanel1;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel4;
    private Com.Swing.RoundPanel roundPanel5;
    private Com.Swing.RoundPanel roundPanel6;
    private Com.Swing.RoundPanel roundPanel7;
    private Com.Swing.RoundPanel roundPanel8;
    private Com.Swing.SearchText searchText2;
    private javax.swing.JSpinner soLuongSpinner;
    private Com.Swing.Table tableHD;
    private Com.Swing.Table tableSP;
    private javax.swing.JMenuItem taoDonMenuItem;
    private javax.swing.JLabel tenBanSDText;
    private javax.swing.JLabel tenText;
    private javax.swing.JButton thanhToanButton;
    private javax.swing.JMenuItem themBanMenuItem;
    private javax.swing.JButton thenMonButton;
    private javax.swing.JMenuItem vaoBanMenuItem;
    private javax.swing.JMenuItem xoaBanMenuItem;
    // End of variables declaration//GEN-END:variables
    private void refreshTableSP(){
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        initDataTableSP();
    }
    private void refreshTableHD(){
        modelHD = (DefaultTableModel) tableHD.getModel();
        modelHD.setRowCount(0);
        initDataTableHD();
    }
    private  void initDataTableHD() {
//        for(ModelOrderDetail s: oddao.getListOrderDetail()){
//                    model.addRow(new Object[]{
//                        s.getProductDetail().getProductDetailId(), s.getProductDetail().getProduct().getProductName(), s.getQuantity(), s.getPrice(),s.getPrice()*s.getQuantity()
//                    });       
//        }
    }
    private  void initDataTableSP() {
        for(ModelProductDetail s: pddao.getListProductDetail()){
            if(s.getQuantity()!=0){
                model.addRow(new Object[]{
                new ImageWrapper(s.getProduct().getImage()), s.getProductDetailId(), s.getProduct().getProductId(), s.getProduct().getProductName(), s.getProduct().getProductCategory().getCategoryName(), s.getEntryDate(), s.getQuantity(), s.getPrice(), s.getProduct().getStatus()
                });
            }    
        }
        tableSP.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
        @Override
            public void setValue(Object value) {
                if (value instanceof ImageWrapper) {
                    ImageWrapper wrapper = (ImageWrapper) value;
                    setIcon(wrapper.getImageIcon());
                    setText("");
                } else {
                    setIcon(null);
                    setText("");
                }
            }
        });

        // Cập nhật chiều cao hàng
        tableSP.setRowHeight(80);
    }
    
    private void initListenerTable() {
        ListSelectionModel listSelectionModel = tableSP.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = tableSP.getSelectedRows();
                //Nếu được chọn sẽ set giá trị của dòng được chọn vào bảng
                if(rows.length>0){
                byte[] image = null;
                ImageWrapper wrapper = (ImageWrapper) tableSP.getValueAt(rows[0], 0);
                image = wrapper.getImageBytes();
                String maCT = String.valueOf(tableSP.getValueAt(rows[0], 1));
                String ten = String.valueOf(tableSP.getValueAt(rows[0], 3));
                String lsp = String.valueOf(tableSP.getValueAt(rows[0], 4));
                String sl = String.valueOf(tableSP.getValueAt(rows[0], 6));
                String gb = String.valueOf(tableSP.getValueAt(rows[0], 7));
                if (image != null){
                    ImageIcon imageIcon = new ImageIcon(image);
                    imageAvatar1.setImage(imageIcon);
                }else{
                    imageAvatar1.setImage(null);
                }
                // Tạo một SpinnerNumberModel với min = 1, value = 1, max = Số lượng hiện có, step = 1
                SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.parseInt(sl), 1); 
                soLuongSpinner.setModel(model);
                
                tenText.setText(ten);
                loaiSPText.setText(lsp);
                maCTSPText.setText(maCT);
                DecimalFormat formatter = new DecimalFormat("#,###.##");  // Định dạng với dấu phẩy phân cách hàng nghìn
                String gia = formatter.format(Double.valueOf(gb));
                giaBanText.setText(gia + " vnđ");
                
                int selectedRow = tableSP.getSelectedRow();
                modelProductDetail = pddao.getListProductDetail().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("NULL");
                    loaiSPText.setText("NULL");
                    maCTSPText.setText("NULL");
                    giaBanText.setText("NULL");
                    imageAvatar1.setImage(null);
                }
                    
            }
        });
    }
    
    private void initPanel1() {
    // Khởi tạo panel1
    

    
    if (tdao.getListTable() != null) {
        for (ModelTable table : tdao.getListTable()) {
            // Tạo nút đại diện cho mỗi bàn
            JButton tableButton = new JButton();
            tableButton.setLayout(new BorderLayout()); // Đặt layout cho JButton
            JLabel label = new JLabel("<html>" + table.getTableName() + "<br>" + table.getStatus() + "</html>", JLabel.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER); // Canh giữa văn bản
            label.setFont(new Font("Roboto",Font.BOLD,14));
            tableButton.add(label);
            tableButton.setPreferredSize(new Dimension(120, 120)); // Kích thước nút
            tableButton.setBackground(Color.decode("#8080ff")); // Màu mặc định

            // Thay đổi màu dựa trên trạng thái
            switch (table.getStatus()) {
                case "Còn Trống":
                    tableButton.setBackground(Color.decode("#66ff66"));
                    break;
                case "Có Khách":
                    tableButton.setBackground(Color.decode("#ff6699"));
                    break;
                case "Đang Dọn Dẹp":
                default:
                    tableButton.setBackground(Color.decode("#8080ff"));
                    break;
            }

            // Thêm sự kiện khi nhấn nút
            tableButton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    // Kiểm tra nếu là chuột phải
                    if (SwingUtilities.isRightMouseButton(evt)) {
                        jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
                        maBanSelected = table.getTableID();
                        modelTable = table;
                        banSD = table;
                    }
                }
            });

            // Thêm nút vào panel1
            jPanel1.add(tableButton);
        }
    }
    }
    private void updateTable(){
        jPanel1.removeAll();
        initPanel1();
    }
}
