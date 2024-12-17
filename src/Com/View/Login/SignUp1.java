package Com.View.Login;

import Com.Controller.UserDAO;
import Com.Model.ModelUser;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SignUp1 extends javax.swing.JFrame {
    UserDAO udao = new UserDAO();
    String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public SignUp1() {
        initComponents();
        scaleImage();
        setIconImage(new ImageIcon(getClass().getResource("/Com/Icon/iconFrame.png")).getImage());
    }
    
    //Chỉnh kích thước ảnh theo với Jlaybel
    public void scaleImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Com/Icon/ANh Em Quán.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acalledIcon = new ImageIcon(imgScale );
        jLabel6.setIcon(acalledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        EmailTextF = new javax.swing.JTextField();
        EmailLabel1 = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        UserNameTextF = new javax.swing.JTextField();
        UserNameLabel1 = new javax.swing.JLabel();
        UserPasswordF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(java.awt.SystemColor.control);
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(0, 102, 102));
        SignUpLabel.setText("SIGN UP");

        UserNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserNameLabel.setText("Email");

        EmailLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmailLabel1.setText("Password");

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ConfirmPasswordLabel.setText("Confirm Password");

        SignUpButton.setBackground(new java.awt.Color(0, 102, 102));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        Text.setBackground(new java.awt.Color(238, 238, 250));
        Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text.setForeground(new java.awt.Color(0, 0, 204));
        Text.setText("Already have an account?");

        LoginButton.setForeground(new java.awt.Color(51, 51, 51));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UserNameLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserNameLabel1.setText("User Name");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameLabel1)
                    .addComponent(UserNameLabel)
                    .addComponent(EmailLabel1)
                    .addComponent(ConfirmPasswordLabel)
                    .addComponent(UserPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(Text)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton))
                    .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(EmailTextF)
                    .addComponent(UserNameTextF)
                    .addComponent(UserPasswordF, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(SignUpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(SignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserNameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserPasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignUpButton)
                .addGap(35, 35, 35)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text)
                    .addComponent(LoginButton))
                .addGap(27, 27, 27))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Event nút Login
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null); // Frame Center
        loginFrame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        String ten = UserNameTextF.getText();
        String em = EmailTextF.getText();
        String mk = String.valueOf(UserPasswordField.getPassword());
        String cmk = String.valueOf(UserPasswordF.getPassword());
        boolean kt = true;
        for(ModelUser m : udao.getListUser()){
            if(m.getUsername().equalsIgnoreCase(ten)){
                JOptionPane.showMessageDialog(null, "Tài khoản bị trùng !!!");
                kt = false;
                break;
            }
        }
        if(!ten.equals("") && em.matches(emailPattern) && mk.length()>=6 && cmk.length()>=6 && kt){
            if(mk.equals(cmk)){
                ModelUser nv = new ModelUser(ten,null,null,null, null, ten, mk, em, "nhan vien");
                udao.addUser(nv);
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                loginFrame.pack();
                loginFrame.setLocationRelativeTo(null); // Frame Center
                loginFrame.setResizable(false);
        this.dispose();
            }
        }else
            JOptionPane.showMessageDialog(null, "Thông tin sai, Nhập lại !!!");
    }//GEN-LAST:event_SignUpButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JTextField EmailTextF;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel UserNameLabel1;
    private javax.swing.JTextField UserNameTextF;
    private javax.swing.JPasswordField UserPasswordF;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
