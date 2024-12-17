package Com.View.Form.Product;

import Com.Controller.ProductCategoryDAO;
import Com.Model.ModelProductCategory;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DialogProductCategory extends javax.swing.JDialog {
    boolean kt;
    ProductCategoryDAO pcdao = new ProductCategoryDAO();
    DefaultTableModel model;
    ModelProductCategory modelProductCategory;
    private Frame Dashboard;
    
    public DialogProductCategory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Thông tin loại sản phẩm");
        
        tableSP.addTableStyle(jScrollPane1);

                
        model = (DefaultTableModel) tableSP.getModel();

        model.setColumnIdentifiers(new Object[]{
            "Mã Loại Sản Phẩm", "Loại Sản Phẩm", "Trạng Thái"
        });
        
        ListSelectionModel selectionModel = tableSP.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        initDataTable();
        initListenerTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel4 = new Com.Swing.RoundPanel();
        jLabeltt = new javax.swing.JLabel();
        roundPanel3 = new Com.Swing.RoundPanel();
        jLabelct = new javax.swing.JLabel();
        jLabelT = new javax.swing.JLabel();
        loaiSPText = new javax.swing.JTextField();
        jLabelTT = new javax.swing.JLabel();
        trangThaiComboBox = new javax.swing.JComboBox<>();
        thenButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        jLabelT1 = new javax.swing.JLabel();
        tenText = new javax.swing.JTextField();
        roundPanel2 = new Com.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new Com.Swing.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabeltt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabeltt.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltt.setText("Thông Tin Loại Sản Phẩm");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltt)
                .addContainerGap(867, Short.MAX_VALUE))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(60, 60, 60));

        jLabelct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelct.setForeground(new java.awt.Color(255, 255, 255));
        jLabelct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelct.setText("Thông Tin Chi Tiết");

        jLabelT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelT.setText("Mã Loại Sản Phẩm :");

        jLabelTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTT.setText("Trạng Thái :");

        trangThaiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));

        thenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/add.png"))); // NOI18N
        thenButton.setText("Thêm");
        thenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thenButtonActionPerformed(evt);
            }
        });

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/sync.png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        suaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/pencil.png"))); // NOI18N
        suaButton.setText("Sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        xoaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/delete.png"))); // NOI18N
        xoaButton.setText("Xóa");
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        jLabelT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelT1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelT1.setText("Tên Loại Sản Phẩm :");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(thenButton)
                        .addGap(61, 61, 61)
                        .addComponent(resetButton)
                        .addGap(55, 55, 55)
                        .addComponent(suaButton)
                        .addGap(53, 53, 53)
                        .addComponent(xoaButton))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loaiSPText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trangThaiComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 300, Short.MAX_VALUE)
                            .addComponent(tenText, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(20, 20, 20))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelct)
                .addGap(60, 60, 60)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelT)
                    .addComponent(loaiSPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelT1)
                    .addComponent(tenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTT)
                    .addComponent(trangThaiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thenButton)
                    .addComponent(resetButton)
                    .addComponent(suaButton)
                    .addComponent(xoaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        if(kt){
            if(!tenText.getText().equals("") && !loaiSPText.getText().equalsIgnoreCase("")){
                try {
                    String ma = loaiSPText.getText();
                    String ten = tenText.getText();
                    String tt = trangThaiComboBox.getSelectedItem().toString();
                    ModelProductCategory u = new ModelProductCategory(ma, ten, tt);
                    pcdao.updateProductCategory(u);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            refreshUser();
        }
    }//GEN-LAST:event_suaButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        loaiSPText.setText("");
        tenText.setText("");
        trangThaiComboBox.setSelectedIndex(0);
        kt = false;
    }//GEN-LAST:event_resetButtonActionPerformed

    private void thenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thenButtonActionPerformed
        for(ModelProductCategory m: pcdao.getListProductCategory()){
            if(loaiSPText.getText().equalsIgnoreCase(m.getCategoryId())){
                JOptionPane.showMessageDialog(null, "Mã loại sản phẩm trùng, Thêm thất bại !!!");
                return;
            }
        }
        if(!loaiSPText.getText().equals("") && !tenText.getText().equalsIgnoreCase("")){
            try {
                String ma = loaiSPText.getText();
                String ten = tenText.getText();
                String tt = trangThaiComboBox.getSelectedItem().toString();
                ModelProductCategory u = new ModelProductCategory(ma, ten, tt);
                pcdao.addProductCategory(u);
                loaiSPText.setText("");
                tenText.setText("");
                trangThaiComboBox.setSelectedIndex(0);
                kt = false;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        refreshUser();
    }//GEN-LAST:event_thenButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableSP.getSelectedRow();
                String value = (tableSP.getModel().getValueAt(row, 0)).toString();
                pcdao.deleteProduct(value);
                refreshUser();
            }
        }
    }//GEN-LAST:event_xoaButtonActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelT;
    private javax.swing.JLabel jLabelT1;
    private javax.swing.JLabel jLabelTT;
    private javax.swing.JLabel jLabelct;
    private javax.swing.JLabel jLabeltt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loaiSPText;
    private javax.swing.JButton resetButton;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel3;
    private Com.Swing.RoundPanel roundPanel4;
    private javax.swing.JButton suaButton;
    private Com.Swing.Table tableSP;
    private javax.swing.JTextField tenText;
    private javax.swing.JButton thenButton;
    private javax.swing.JComboBox<String> trangThaiComboBox;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
    private void refreshUser(){
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
    for(ModelProductCategory s: pcdao.getListProductCategory()){
            model.addRow(new Object[]{
                s.getCategoryId(), s.getCategoryName(), s.getStatus()
            });
        }
    }

    private void initListenerTable() {
        ListSelectionModel listSelectionModel = tableSP.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = tableSP.getSelectedRows();
                //Nếu được chọn sẽ set giá trị của dòng được chọn vào bảng
                if(rows.length>0){
                String ma = String.valueOf(tableSP.getValueAt(rows[0], 0));
                String ten = String.valueOf(tableSP.getValueAt(rows[0], 1));
                String tt = String.valueOf(tableSP.getValueAt(rows[0], 2));

                
                tenText.setText(ten);
                loaiSPText.setText(ma);
                trangThaiComboBox.setSelectedItem(tt);

                
                int selectedRow = tableSP.getSelectedRow();
                modelProductCategory = pcdao.getListProductCategory().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    loaiSPText.setText("Name");
                    loaiSPText.setText("Loại");
                    trangThaiComboBox.setSelectedIndex(0);
                }
                    
            }
        });
    }
}
