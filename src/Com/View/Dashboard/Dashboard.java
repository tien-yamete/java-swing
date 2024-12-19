package Com.View.Dashboard;

import Com.Event.MenuEvent;
import Com.View.Form.Form;
import Com.View.Form.Customer.FormCustomer;
import Com.View.Form.Staff.FormStaff;
import Com.View.Form.Info.InforForm;
import Com.View.Form.MainFormDashboard;
import Com.View.Form.Order.FormOrder;
import Com.View.Form.Product.FormProductDetail;
import Com.View.Form.Sell.FormSell;
import Com.View.Form.Statistics.FormStatistics;
import Com.View.Login.Login;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        this.setTitle("Anh Em Quán");
        setIconImage(new ImageIcon(getClass().getResource("/Com/Icon/iconFrame.png")).getImage());
        initComponents();
        getContentPane().setBackground(new Color(63, 109, 217));
        MenuEvent event;
        event = (int index) -> {
            switch (index) {
                case 0 -> {
                    MainFormDashboard mainFormDashboard = new MainFormDashboard();
                    showForm(mainFormDashboard);
                }
                case 1 -> {
                    FormSell formSell = new FormSell();
                    showForm(formSell);
                }
                case 2 -> {
                    FormStaff formStaff = new FormStaff();
                    showForm(formStaff);
                }
                case 4 -> {
                    FormOrder formOrder = new FormOrder();
                    showForm(formOrder);
                }
                case 5 -> {
                    FormProductDetail formProduct = new FormProductDetail();
                    showForm(formProduct);
                }
                case 6 -> {
                    FormCustomer formCustomer = new FormCustomer();
                    showForm(formCustomer);
                }
                case 7 -> {
                    FormStatistics formStatistics  = new FormStatistics();
                    showForm(formStatistics);
                }
                case 8 -> {
                    InforForm inforForm = new InforForm();
                    showForm(inforForm);
                }
                case 9 -> {
                    int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không ?","Delete",JOptionPane.YES_NO_OPTION);
                    if(opt == 0){
                        Login loginFrame = new Login();
                        loginFrame.setVisible(true);
                        loginFrame.pack();
                        loginFrame.setLocationRelativeTo(null); // Frame Center
                        loginFrame.setResizable(false);
                        closeFrame();
                    }
                }
                default -> showForm(new Form(index + ""));
            }
        };
        menu.initMenu(event);
        menu.setSelected(0);
    }
    private void closeFrame(){
        this.dispose();
    }
    private void showForm(Component com){
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new Com.View.Component.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(1237, 659));
        jPanel1.setName(""); // NOI18N

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private Com.View.Component.Menu menu;
    // End of variables declaration//GEN-END:variables
}
