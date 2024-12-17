package Com.View.Form.Sale;

import Com.Controller.SaleDAO;
import Com.Model.ModelSale;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormSale extends javax.swing.JPanel {
    boolean kt;
    SaleDAO sdao = new SaleDAO();
    DefaultTableModel model;
    ModelSale modelSaleSelected;
    private Frame Dashboard;
    public FormSale() {
        initComponents();
        setOpaque(false);
        searchText2.setHint("Search");
        tableKM.addTableStyle(jScrollPane1);

                
        model = (DefaultTableModel) tableKM.getModel();

        model.setColumnIdentifiers(new Object[]{
            "Mã Khuyến Mãi","Tên Khuyến Mãi","Ngày Bắt Đầu","Ngày Kết Thúc", "Loại Khuyến Mãi","Giá Trị Khuyến Mãi","Trạng Thái","Mô Tả"
        });
        
        ListSelectionModel selectionModel = tableKM.getSelectionModel();
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
        tableKM = new Com.Swing.Table();
        roundPanel3 = new Com.Swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maKMText = new javax.swing.JLabel();
        gtriKMText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        moTaText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ngayBDText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ngayKTText = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        trangThaiText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loaiKMText1 = new javax.swing.JLabel();
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
                .addGap(144, 144, 144)
                .addComponent(refreshButton)
                .addGap(40, 40, 40)
                .addComponent(addButton)
                .addGap(40, 40, 40)
                .addComponent(editButton)
                .addGap(40, 40, 40)
                .addComponent(deleteButton)
                .addGap(34, 34, 34))
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

        tableKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableKM);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel3.setBackground(new java.awt.Color(60, 60, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thông Tin Chi Tiết");

        tenText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tenText.setForeground(new java.awt.Color(255, 255, 255));
        tenText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tenText.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mã Khuyễn Mãi :");

        maKMText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maKMText.setForeground(new java.awt.Color(204, 204, 204));
        maKMText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maKMText.setText("NULL");

        gtriKMText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gtriKMText.setForeground(new java.awt.Color(204, 204, 204));
        gtriKMText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gtriKMText.setText("NULL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Giá Trị Khuyến Mãi :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Mô Tả :");

        moTaText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moTaText.setForeground(new java.awt.Color(204, 204, 204));
        moTaText.setText("NULL");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ngày Bắt Đầu :");

        ngayBDText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ngayBDText.setForeground(new java.awt.Color(204, 204, 204));
        ngayBDText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayBDText.setText("NULL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ngày Kết Thúc :");

        ngayKTText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ngayKTText.setForeground(new java.awt.Color(204, 204, 204));
        ngayKTText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayKTText.setText("NULL");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Trạng Thái :");

        trangThaiText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trangThaiText.setForeground(new java.awt.Color(204, 204, 204));
        trangThaiText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangThaiText.setText("NULL");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Loại Khuyến Mãi :");

        loaiKMText1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loaiKMText1.setForeground(new java.awt.Color(204, 204, 204));
        loaiKMText1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loaiKMText1.setText("NULL");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(100, 100, 100))
            .addComponent(tenText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moTaText, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(maKMText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel13)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gtriKMText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ngayBDText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ngayKTText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(trangThaiText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loaiKMText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(tenText)
                .addGap(40, 40, 40)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maKMText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ngayBDText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ngayKTText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(loaiKMText1))
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gtriKMText))
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(trangThaiText))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moTaText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Khuyến Mãi");

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
        InputSale inputSale = new InputSale(Dashboard, true);
        inputSale.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(kt == true){
            EditSale editSale = new EditSale(Dashboard, kt, modelSaleSelected);
            editSale.setVisible(kt);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableKM.getSelectedRow();
                String value = (tableKM.getModel().getValueAt(row, 0)).toString();
                sdao.deleteSale(value);
                refreshUser();
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
        searchText2.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        model = (DefaultTableModel) tableKM.getModel();
        model.setRowCount(0);
        for(ModelSale s: sdao.searchSale(searchText2.getText())){
            //dsImage.add(s.getImage());
            model.addRow(new Object[]{
                s.getSaleID(), s.getNameSale(), s.getDayStart(), s.getDayEnd(), s.getSaleType(), s.getDiscount(), s.getStatus(), s.getDescription()
            });
        }
    }//GEN-LAST:event_searchText2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel gtriKMText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loaiKMText1;
    private javax.swing.JLabel maKMText;
    private javax.swing.JLabel moTaText;
    private javax.swing.JLabel ngayBDText;
    private javax.swing.JLabel ngayKTText;
    private javax.swing.JButton refreshButton;
    private Com.Swing.RoundPanel roundPanel1;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel3;
    private Com.Swing.RoundPanel roundPanel4;
    private Com.Swing.SearchText searchText2;
    private Com.Swing.Table tableKM;
    private javax.swing.JLabel tenText;
    private javax.swing.JLabel trangThaiText;
    // End of variables declaration//GEN-END:variables

    private void refreshUser(){
        model = (DefaultTableModel) tableKM.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelSale s: sdao.getListSale()){
            //dsImage.add(s.getImage());
            model.addRow(new Object[]{
                s.getSaleID(), s.getNameSale(), s.getDayStart(), s.getDayEnd(), s.getSaleType(), s.getDiscount(), s.getStatus(), s.getDescription()
            });
        }
    }

    private void initListenerTable() {
        ListSelectionModel listSelectionModel = tableKM.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = tableKM.getSelectedRows();
                //Nếu được chọn sẽ set giá trị của dòng được chọn vào bảng
                if(rows.length>0){
                String ma = String.valueOf(tableKM.getValueAt(rows[0], 0));
                String ten = String.valueOf(tableKM.getValueAt(rows[0], 1));
                String nbd = String.valueOf(tableKM.getValueAt(rows[0], 2));
                String nkt = String.valueOf(tableKM.getValueAt(rows[0], 3));
                String lkm = String.valueOf(tableKM.getValueAt(rows[0], 4));
                String gg = String.valueOf(tableKM.getValueAt(rows[0], 5));
                String tt = String.valueOf(tableKM.getValueAt(rows[0], 6));
                String mt = String.valueOf(tableKM.getValueAt(rows[0], 7));

                tenText.setText(ten);
                maKMText.setText(ma);
                ngayBDText.setText(nbd);
                ngayKTText.setText(nkt);
                loaiKMText1.setText(lkm);
                gtriKMText.setText(gg);
                trangThaiText.setText(tt);
                moTaText.setText(mt);

                
                
                int selectedRow = tableKM.getSelectedRow();
                modelSaleSelected = sdao.getListSale().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("Name");
                    maKMText.setText("NULL");
                    ngayBDText.setText("NULL");
                    ngayKTText.setText("NULL");
                    loaiKMText1.setText("NULL");
                    gtriKMText.setText("NULL");
                    trangThaiText.setText("NULL");
                    moTaText.setText("NULL");
                }
                    
            }
        });
    }
}
