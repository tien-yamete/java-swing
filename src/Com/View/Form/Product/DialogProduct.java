package Com.View.Form.Product;

import Com.Controller.ProductDAO;
import Com.Model.ImageWrapper;
import Com.Model.ModelProduct;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DialogProduct extends javax.swing.JDialog {
    boolean kt;
    ProductDAO pdao = new ProductDAO();
    DefaultTableModel model;
    ModelProduct modelProduct;
    private Frame Dashboard;
    public DialogProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Thông tin sản phẩm");
        
        tableSP.addTableStyle(jScrollPane1);
                
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào
            }
        };
        
        model.setColumnIdentifiers(new Object[]{
            "Ảnh", "Mã Sản Phẩm","Tên Sản Phẩm","Trạng Thái", "Mã Loại Sản Phẩm","Loại Sản Phẩm"
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

        jPanel1 = new javax.swing.JPanel();
        roundPanel4 = new Com.Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        roundPanel3 = new Com.Swing.RoundPanel();
        imageAvatar1 = new Com.Swing.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        tenText = new javax.swing.JLabel();
        roundPanel5 = new Com.Swing.RoundPanel();
        loaiSPText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maSPText = new javax.swing.JLabel();
        trangThaiText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maLSPText = new javax.swing.JLabel();
        roundPanel2 = new Com.Swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new Com.Swing.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        roundPanel4.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Sản Phẩm");

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

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addGap(40, 40, 40)
                .addComponent(addButton)
                .addGap(40, 40, 40)
                .addComponent(editButton)
                .addGap(40, 40, 40)
                .addComponent(deleteButton)
                .addGap(37, 37, 37))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(editButton)
                        .addComponent(deleteButton)
                        .addComponent(refreshButton))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel5.setText("Mã Sản Phẩm :");

        maSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maSPText.setForeground(new java.awt.Color(204, 204, 204));
        maSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maSPText.setText("NULL");

        trangThaiText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trangThaiText.setForeground(new java.awt.Color(204, 204, 204));
        trangThaiText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangThaiText.setText("NULL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Trạng Thái :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mã Loại Sản Phẩm :");

        maLSPText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maLSPText.setForeground(new java.awt.Color(204, 204, 204));
        maLSPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maLSPText.setText("NULL");

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
                        .addComponent(maSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trangThaiText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maLSPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(maSPText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maLSPText))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(trangThaiText))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
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
                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshUser();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        InputProduct inputProduct = new InputProduct (Dashboard, true);
        inputProduct.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(kt == true){
            EditProduct editProduct = new EditProduct(Dashboard, kt, modelProduct);
            editProduct.setVisible(kt);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(kt){
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Delete",JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                int row = tableSP.getSelectedRow();
                String value = (tableSP.getModel().getValueAt(row, 1)).toString();
                System.out.println(value);
                pdao.deleteProduct(value);
                refreshUser();
            }

        }
    }//GEN-LAST:event_deleteButtonActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private Com.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loaiSPText;
    private javax.swing.JLabel maLSPText;
    private javax.swing.JLabel maSPText;
    private javax.swing.JButton refreshButton;
    private Com.Swing.RoundPanel roundPanel2;
    private Com.Swing.RoundPanel roundPanel3;
    private Com.Swing.RoundPanel roundPanel4;
    private Com.Swing.RoundPanel roundPanel5;
    private Com.Swing.Table tableSP;
    private javax.swing.JLabel tenText;
    private javax.swing.JLabel trangThaiText;
    // End of variables declaration//GEN-END:variables
    private void refreshUser(){
        model = (DefaultTableModel) tableSP.getModel();
        model.setRowCount(0);
        initDataTable();
    }
    private  void initDataTable() {
        for(ModelProduct s: pdao.getListProduct()){
            model.addRow(new Object[]{
                new ImageWrapper(s.getImage()), s.getProductId(), s.getProductName(), s.getStatus(), s.getProductCategory().getCategoryId(), s.getProductCategory().getCategoryName()
            });
        }
        // Custom renderer để hiển thị hình ảnh
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
                String ma = String.valueOf(tableSP.getValueAt(rows[0], 1));
                String ten = String.valueOf(tableSP.getValueAt(rows[0], 2));
                String tt = String.valueOf(tableSP.getValueAt(rows[0], 3));
                String mlsp = String.valueOf(tableSP.getValueAt(rows[0], 4));
                String lsp = String.valueOf(tableSP.getValueAt(rows[0], 5));
                
                if (image != null){
                    ImageIcon imageIcon = new ImageIcon(image);
                    imageAvatar1.setImage(imageIcon);
                }else{
                    imageAvatar1.setImage(null);
                }
                
                tenText.setText(ten);
                loaiSPText.setText(lsp);
                maSPText.setText(ma);
                maLSPText.setText(mlsp);
                trangThaiText.setText(tt);

                
                int selectedRow = tableSP.getSelectedRow();
                modelProduct = pdao.getListProduct().get(selectedRow);
                kt = true;
                }
                //Nếu k đc chọn thì sẽ set lại giá trị mặc định
                else{
                    kt = false;
                    tenText.setText("Name");
                    loaiSPText.setText("Loại");
                    maLSPText.setText("NULL");
                    maSPText.setText("NULL");
                    trangThaiText.setText("NULL");
                    imageAvatar1.setImage(null);
                }
                    
            }
        });
    }
}
