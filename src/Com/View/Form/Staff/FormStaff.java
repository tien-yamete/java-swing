package Com.View.Form.Staff;

import Com.Controller.UserDAO;
import Com.Model.ModelUser;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormStaff extends javax.swing.JPanel {
    boolean kt;
    UserDAO udao = new UserDAO();
    DefaultTableModel model;
    ModelUser modelUserSelected;
    private Frame Dashboard;
    public FormStaff() {
        initComponents();
        setOpaque(false);
        searchText2.setHint("Search");
        tableNV.addTableStyle(jScrollPane1);

                
        model = (DefaultTableModel) tableNV.getModel();

        model.setColumnIdentifiers(new Object[]{
            "Mã Nhân Viên","Họ Tên","Giới Tính","Ngày Sinh","Số Điện Thoại","Địa Chỉ","Tên Tài Khoản","Mật Khẩu","Email","Vị Trí"
        });
        
        ListSelectionModel selectionModel = tableNV.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        initDataTable();
        initListenerTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Com.Swing.RoundPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchText2 = new Com.Swing.SearchText();
        roundPanel2 = new Com.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new Com.Swing.Table();
        roundPanel3 = new Com.Swing.RoundPanel();
        imageAvatar1 = new Com.Swing.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        roundPanel5 = new Com.Swing.RoundPanel();
        viTriText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maNVText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gioiTinhText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ngaySinhText = new javax.swing.JLabel();
        soDienThoaiText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        diaChiText = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tenTKText = new javax.swing.JLabel();
        matKhauText = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        roundPanel4 = new Com.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();

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

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableNV);

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

        viTriText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viTriText.setForeground(new java.awt.Color(255, 255, 255));
        viTriText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viTriText.setText("Vị Trí");

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viTriText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viTriText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mã Nhân Viên  : ");

        maNVText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maNVText.setForeground(new java.awt.Color(204, 204, 204));
        maNVText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maNVText.setText("NULL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Giới Tính          :");

        gioiTinhText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gioiTinhText.setForeground(new java.awt.Color(204, 204, 204));
        gioiTinhText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gioiTinhText.setText("NULL");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ngày Sinh        : ");

        ngaySinhText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ngaySinhText.setForeground(new java.awt.Color(204, 204, 204));
        ngaySinhText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngaySinhText.setText("NULL");

        soDienThoaiText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soDienThoaiText.setForeground(new java.awt.Color(204, 204, 204));
        soDienThoaiText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soDienThoaiText.setText("NULL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Số Điện Thoại  : ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Địa Chỉ             : ");

        diaChiText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diaChiText.setForeground(new java.awt.Color(204, 204, 204));
        diaChiText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        diaChiText.setText("NULL");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Tên Tài Khoản : ");

        tenTKText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenTKText.setForeground(new java.awt.Color(204, 204, 204));
        tenTKText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenTKText.setText("NULL");

        matKhauText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        matKhauText.setForeground(new java.awt.Color(204, 204, 204));
        matKhauText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        matKhauText.setText("NULL");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Mật Khẩu         : ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Email               : ");

        emailText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(204, 204, 204));
        emailText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailText.setText("NULL");

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
                        .addComponent(maNVText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenTKText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matKhauText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaChiText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soDienThoaiText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaySinhText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gioiTinhText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maNVText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gioiTinhText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ngaySinhText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(soDienThoaiText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(diaChiText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tenTKText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(matKhauText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(emailText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Nhân Viên");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
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
        InputStaff inputStaff = new InputStaff(Dashboard, true);
        inputStaff.setVisible(true);
        if(inputStaff.isKt()){
            refreshUser();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(kt == true){
            EditStaff editStaff = new EditStaff(Dashboard, kt, modelUserSelected);
            editStaff.setVisible(kt);
            if(editStaff.isKtra()){
                refreshUser();
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableNV.getSelectedRow();
                String value = (tableNV.getModel().getValueAt(row, 0)).toString();
                udao.deleteStaff(value);
                refreshUser();
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
        searchText2.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        model = (DefaultTableModel) tableNV.getModel();
        model.setRowCount(0);
        for(ModelUser s: udao.searchUser(searchText2.getText())){
            //dsImage.add(s.getImage());
            model.addRow(new Object[]{
                s.getId(), s.getName(), s.getGender(), s.getDateOfBirth(), s.getPhone(), s.getAddress(), s.getUsername(), s.getPassword(), s.getEmail(),s.getPosition()
            });
        }
    }//GEN-LAST:event_searchText2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel diaChiText;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel gioiTinhText;
    private Com.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maNVText;
    private javax.swing.JLabel matKhauText;
    private javax.swing.JLabel ngaySinhText;
    private javax.swing.JButton refreshButton;
    private Com.Swing.RoundPanel roundPanel1;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel3;
    private Com.Swing.RoundPanel roundPanel4;
    private Com.Swing.RoundPanel roundPanel5;
    private Com.Swing.SearchText searchText2;
    private javax.swing.JLabel soDienThoaiText;
    private Com.Swing.Table tableNV;
    private javax.swing.JLabel tenTKText;
    private javax.swing.JLabel tenText;
    private javax.swing.JLabel viTriText;
    // End of variables declaration//GEN-END:variables

    private void refreshUser(){
        model = (DefaultTableModel) tableNV.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelUser s: udao.getListUser()){
            //dsImage.add(s.getImage());
            model.addRow(new Object[]{
                s.getId(), s.getName(), s.getGender(), s.getDateOfBirth(), s.getPhone(), s.getAddress(), s.getUsername(), s.getPassword(), s.getEmail(),s.getPosition()
            });
        }
    }

    private void initListenerTable() {
        ListSelectionModel listSelectionModel = tableNV.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = tableNV.getSelectedRows();
                //Nếu được chọn sẽ set giá trị của dòng được chọn vào bảng
                if(rows.length>0){
                String ma = String.valueOf(tableNV.getValueAt(rows[0], 0));
                String ten = String.valueOf(tableNV.getValueAt(rows[0], 1));
                String gt = String.valueOf(tableNV.getValueAt(rows[0], 2));
                String ns = String.valueOf(tableNV.getValueAt(rows[0], 3));
                String dt = String.valueOf(tableNV.getValueAt(rows[0], 4));
                String dc = String.valueOf(tableNV.getValueAt(rows[0], 5));
                String tk = String.valueOf(tableNV.getValueAt(rows[0], 6));
                String mk = String.valueOf(tableNV.getValueAt(rows[0], 7));
                String em = String.valueOf(tableNV.getValueAt(rows[0], 8));
                String vt = String.valueOf(tableNV.getValueAt(rows[0], 9));
                
                for(ModelUser s: udao.getListUser()){
                    if(s.getUsername().equalsIgnoreCase(tk)){
                        if(s.getImage() != null){
                            ImageIcon imageIcon = new ImageIcon(s.getImage());
                            imageAvatar1.setImage(imageIcon);
                        }
                        else{
                            imageAvatar1.setImage(null);
                        }
                    }
                }
                tenText.setText(ten);
                viTriText.setText(vt);
                maNVText.setText(ma);
                gioiTinhText.setText(gt);
                ngaySinhText.setText(ns);
                soDienThoaiText.setText(dt);
                diaChiText.setText(dc);
                tenTKText.setText(tk);
                matKhauText.setText(mk);
                emailText.setText(em);
                
                
                int selectedRow = tableNV.getSelectedRow();
                modelUserSelected = udao.getListUser().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("Name");
                    viTriText.setText("Vị trí");
                    maNVText.setText("NULL");
                    gioiTinhText.setText("NULL");
                    ngaySinhText.setText("NULL");
                    soDienThoaiText.setText("NULL");
                    diaChiText.setText("NULL");
                    tenTKText.setText("NULL");
                    matKhauText.setText("NULL");
                    emailText.setText("NULL");
                    imageAvatar1.setImage(null);
                }
                    
            }
        });
    }
}
