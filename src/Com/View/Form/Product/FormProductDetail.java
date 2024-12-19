package Com.View.Form.Product;

import Com.Controller.ProductDetailDAO;
import Com.Model.ImageWrapper;
import Com.Model.ModelProductDetail;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FormProductDetail extends javax.swing.JPanel {
    boolean kt;
    ProductDetailDAO pddao = new ProductDetailDAO();
    DefaultTableModel model;
    ModelProductDetail modelProductDetail;
    private Frame Dashboard;
    public FormProductDetail() {
        initComponents();
        setOpaque(false);
        searchText2.setHint("Search");
        tableSP.addTableStyle(jScrollPane1);

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
        
        initDataTable();
        initListenerTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Com.View.Swing.RoundPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchText2 = new Com.View.Swing.SearchText();
        roundPanel2 = new Com.View.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new Com.View.Swing.Table();
        roundPanel3 = new Com.View.Swing.RoundPanel();
        imageAvatar1 = new Com.View.Swing.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        roundPanel5 = new Com.View.Swing.RoundPanel();
        loaiSPText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maCTSPText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        trangThaiText = new javax.swing.JLabel();
        ngayNhapText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        soLuongText = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        giaBanText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maSPText = new javax.swing.JLabel();
        roundPanel4 = new Com.View.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        sanPhamButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/add.png"))); // NOI18N
        addButton.setText("Thêm");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(204, 204, 204));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/pencil.png"))); // NOI18N
        editButton.setText("Sửa");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/delete.png"))); // NOI18N
        deleteButton.setText("Xóa");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

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

        searchText2.setBackground(new java.awt.Color(204, 204, 204));
        searchText2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchText2.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/search.png"))); // NOI18N
        searchText2.setSelectionColor(new java.awt.Color(0, 0, 51));
        searchText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addGap(147, 147, 147)
                .addComponent(refreshButton)
                .addGap(40, 40, 40)
                .addComponent(addButton)
                .addGap(40, 40, 40)
                .addComponent(editButton)
                .addGap(40, 40, 40)
                .addComponent(deleteButton)
                .addGap(31, 31, 31))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(editButton)
                        .addComponent(deleteButton)
                        .addComponent(refreshButton))
                    .addComponent(searchText2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableSP);

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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        roundPanel3.setBackground(new java.awt.Color(60, 60, 60));

        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thông Tin Chi Tiết");

        tenText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tenText.setForeground(new java.awt.Color(255, 255, 255));
        tenText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tenText.setText("Name");

        roundPanel5.setBackground(new java.awt.Color(0, 51, 51));

        loaiSPText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loaiSPText.setForeground(new java.awt.Color(255, 255, 255));
        loaiSPText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loaiSPText.setText("Loại");

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loaiSPText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loaiSPText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mã Chi Tiết SP:");

        maCTSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maCTSPText.setForeground(new java.awt.Color(204, 204, 204));
        maCTSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maCTSPText.setText("NULL");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Trạng Thái :");

        trangThaiText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trangThaiText.setForeground(new java.awt.Color(204, 204, 204));
        trangThaiText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangThaiText.setText("NULL");

        ngayNhapText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ngayNhapText.setForeground(new java.awt.Color(204, 204, 204));
        ngayNhapText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayNhapText.setText("NULL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Ngày Nhập :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Số Lượng :");

        soLuongText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soLuongText.setForeground(new java.awt.Color(204, 204, 204));
        soLuongText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soLuongText.setText("NULL");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Giá Bán :");

        giaBanText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaBanText.setForeground(new java.awt.Color(204, 204, 204));
        giaBanText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        giaBanText.setText("NULL");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mã Sản Phẩm :");

        maSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maSPText.setForeground(new java.awt.Color(204, 204, 204));
        maSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maSPText.setText("NULL");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
            .addComponent(tenText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maCTSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giaBanText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soLuongText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ngayNhapText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(30, 30, 30)
                        .addComponent(trangThaiText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tenText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maCTSPText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maSPText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(trangThaiText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ngayNhapText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(soLuongText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(giaBanText))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Chi Tiết Sản Phẩm");

        sanPhamButton.setBackground(new java.awt.Color(204, 204, 204));
        sanPhamButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sanPhamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/drink.png"))); // NOI18N
        sanPhamButton.setText("Sản Phẩm");
        sanPhamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanPhamButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/fast-food.png"))); // NOI18N
        jButton1.setText("Loại Sản Phẩm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(sanPhamButton)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sanPhamButton)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        InputProductDetail inputProduct = new InputProductDetail (Dashboard, true);
        inputProduct.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(kt == true){
            EditProductDetail editProductDetail = new EditProductDetail(Dashboard, kt, modelProductDetail);
            editProductDetail.setVisible(kt);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableSP.getSelectedRow();
                String value = (tableSP.getModel().getValueAt(row, 2)).toString();
                System.out.println(value);
                try {
                    pddao.deleteChiTietSPByMaSP(value);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Xóa Thất Bại !!!");
                }
                JOptionPane.showMessageDialog(null, "Xóa Thành Công");
                refreshUser();
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
        searchText2.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        for(ModelProductDetail s: pddao.searchProduct(searchText2.getText())){
            model.addRow(new Object[]{
                new ImageWrapper(s.getProduct().getImage()), s.getProductDetailId(), s.getProduct().getProductId(), s.getProduct().getProductName(), s.getProduct().getProductCategory().getCategoryName(), s.getEntryDate(), s.getQuantity(), s.getPrice(), s.getProduct().getStatus()
            });
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

    private void sanPhamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanPhamButtonActionPerformed
        DialogProduct dialogProduct = new DialogProduct (Dashboard, true);
        dialogProduct.setVisible(true);
    }//GEN-LAST:event_sanPhamButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DialogProductCategory dialogProductCategory = new DialogProductCategory(Dashboard, true);
        dialogProductCategory.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel giaBanText;
    private Com.View.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loaiSPText;
    private javax.swing.JLabel maCTSPText;
    private javax.swing.JLabel maSPText;
    private javax.swing.JLabel ngayNhapText;
    private javax.swing.JButton refreshButton;
    private Com.View.Swing.RoundPanel roundPanel1;
    private Com.View.Swing.RoundPanel roundPanel2;
    private Com.View.Swing.RoundPanel roundPanel3;
    private Com.View.Swing.RoundPanel roundPanel4;
    private Com.View.Swing.RoundPanel roundPanel5;
    private javax.swing.JButton sanPhamButton;
    private Com.View.Swing.SearchText searchText2;
    private javax.swing.JLabel soLuongText;
    private Com.View.Swing.Table tableSP;
    private javax.swing.JLabel tenText;
    private javax.swing.JLabel trangThaiText;
    // End of variables declaration//GEN-END:variables

    private void refreshUser(){
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelProductDetail s: pddao.getListProductDetail()){
            model.addRow(new Object[]{
                new ImageWrapper(s.getProduct().getImage()), s.getProductDetailId(), s.getProduct().getProductId(), s.getProduct().getProductName(), s.getProduct().getProductCategory().getCategoryName(), s.getEntryDate(), s.getQuantity(), s.getPrice(), s.getProduct().getStatus()
            });
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
                String ma = String.valueOf(tableSP.getValueAt(rows[0], 2));
                String ten = String.valueOf(tableSP.getValueAt(rows[0], 3));
                String lsp = String.valueOf(tableSP.getValueAt(rows[0], 4));
                String nn = String.valueOf(tableSP.getValueAt(rows[0], 5));
                String sl = String.valueOf(tableSP.getValueAt(rows[0], 6));
                String gb = String.valueOf(tableSP.getValueAt(rows[0], 7));
                String tt = String.valueOf(tableSP.getValueAt(rows[0], 8));
                if (image != null){
                    ImageIcon imageIcon = new ImageIcon(image);
                    imageAvatar1.setImage(imageIcon);
                }else{
                    imageAvatar1.setImage(null);
                }
                
                tenText.setText(ten);
                loaiSPText.setText(lsp);
                maCTSPText.setText(maCT);
                maSPText.setText(ma);
                trangThaiText.setText(tt);
                ngayNhapText.setText(nn);
                soLuongText.setText(sl);
                giaBanText.setText(gb);
                
                int selectedRow = tableSP.getSelectedRow();
                modelProductDetail = pddao.getListProductDetail().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("Name");
                    loaiSPText.setText("Loại");
                    maSPText.setText("NULL");
                    maCTSPText.setText("NULL");
                    trangThaiText.setText("NULL");
                    ngayNhapText.setText("NULL");
                    soLuongText.setText("NULL");
                    giaBanText.setText("NULL");
                    imageAvatar1.setImage(null);
                }
                    
            }
        });
    }
}
