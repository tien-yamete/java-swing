package Com.View.Form.Customer;

import Com.Controller.CustomerDAO;
import Com.Model.ModelCustomer;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormCustomer extends javax.swing.JPanel {
    boolean kt;
    CustomerDAO cdao = new CustomerDAO();
    DefaultTableModel model;
    ModelCustomer modelCustomerSelected;
    private Frame Dashboard;
    public FormCustomer() {
        initComponents();
        setOpaque(false);
        searchText2.setHint("Search");
        tableKH.addTableStyle(jScrollPane1);

                
        model = (DefaultTableModel) tableKH.getModel();

        model.setColumnIdentifiers(new Object[]{
            "Mã Khách Hàng","Họ Tên","Giới Tính","Ngày Sinh","Số Điện Thoại","Địa Chỉ","Email"
        });
        
        ListSelectionModel selectionModel = tableKH.getSelectionModel();
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
        tableKH = new Com.Swing.Table();
        roundPanel3 = new Com.Swing.RoundPanel();
        imageAvatar1 = new Com.Swing.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        roundPanel5 = new Com.Swing.RoundPanel();
        viTriText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maKHText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gioiTinhText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ngaySinhText = new javax.swing.JLabel();
        soDienThoaiText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        diaChiText = new javax.swing.JLabel();
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
                .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addGap(143, 143, 143)
                .addComponent(refreshButton)
                .addGap(40, 40, 40)
                .addComponent(addButton)
                .addGap(40, 40, 40)
                .addComponent(editButton)
                .addGap(40, 40, 40)
                .addComponent(deleteButton)
                .addGap(36, 36, 36))
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

        tableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableKH);

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
        viTriText.setText("Khách Hàng");

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
        jLabel5.setText("Mã Khách Hàng  : ");

        maKHText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maKHText.setForeground(new java.awt.Color(204, 204, 204));
        maKHText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maKHText.setText("NULL");

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
                        .addComponent(maKHText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(maKHText))
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
                    .addComponent(jLabel19)
                    .addComponent(emailText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Khách Hàng");

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
        InputCustomer inputCustomer = new InputCustomer(Dashboard, true);
        inputCustomer.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(kt == true){
            EditCustomer editStaff = new EditCustomer(Dashboard, kt, modelCustomerSelected);
            editStaff.setVisible(kt);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableKH.getSelectedRow();
                String value = (tableKH.getModel().getValueAt(row, 0)).toString();
                cdao.deleteCustomer(value);
                refreshUser();
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased

    }//GEN-LAST:event_searchText2KeyReleased

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

    }//GEN-LAST:event_imageAvatar1MouseClicked


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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maKHText;
    private javax.swing.JLabel ngaySinhText;
    private javax.swing.JButton refreshButton;
    private Com.Swing.RoundPanel roundPanel1;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel3;
    private Com.Swing.RoundPanel roundPanel4;
    private Com.Swing.RoundPanel roundPanel5;
    private Com.Swing.SearchText searchText2;
    private javax.swing.JLabel soDienThoaiText;
    private Com.Swing.Table tableKH;
    private javax.swing.JLabel tenText;
    private javax.swing.JLabel viTriText;
    // End of variables declaration//GEN-END:variables

    private void refreshUser(){
        model = (DefaultTableModel) tableKH.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelCustomer s: cdao.getListCustomer()){
            model.addRow(new Object[]{
                s.getId(), s.getName(), s.getGender(), s.getDateOfBirth(), s.getPhone(), s.getAddress(), s.getEmail()
            });
        }
    }

    private void initListenerTable() {
        ListSelectionModel listSelectionModel = tableKH.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = tableKH.getSelectedRows();
                //Nếu được chọn sẽ set giá trị của dòng được chọn vào bảng
                if(rows.length>0){
                String ma = String.valueOf(tableKH.getValueAt(rows[0], 0));
                String ten = String.valueOf(tableKH.getValueAt(rows[0], 1));
                String gt = String.valueOf(tableKH.getValueAt(rows[0], 2));
                String ns = String.valueOf(tableKH.getValueAt(rows[0], 3));
                String dt = String.valueOf(tableKH.getValueAt(rows[0], 4));
                String dc = String.valueOf(tableKH.getValueAt(rows[0], 5));
                String em = String.valueOf(tableKH.getValueAt(rows[0], 6));

                tenText.setText(ten);
                maKHText.setText(ma);
                gioiTinhText.setText(gt);
                ngaySinhText.setText(ns);
                soDienThoaiText.setText(dt);
                diaChiText.setText(dc);
                emailText.setText(em);
                
                
                int selectedRow = tableKH.getSelectedRow();
                modelCustomerSelected = cdao.getListCustomer().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("Name");
                    viTriText.setText("Vị trí");
                    maKHText.setText("NULL");
                    gioiTinhText.setText("NULL");
                    ngaySinhText.setText("NULL");
                    soDienThoaiText.setText("NULL");
                    diaChiText.setText("NULL");
                    emailText.setText("NULL");
                }
                    
            }
        });
    }
}
