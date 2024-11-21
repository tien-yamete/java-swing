package Com.View.Login;

import java.awt.Image;
import javax.swing.ImageIcon;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        scaleImage();
    }
    
    public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\NAME\\OneDrive\\Documents\\NetBeansProjects\\TestLogin\\src\\Icon\\ANh Em Quán.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acalledIcon = new ImageIcon(imgScale );
        ImageLabel.setIcon(acalledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();
        EmailTextField1 = new javax.swing.JTextField();
        EmailLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(43, 39, 56));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignUpLabel.setText("SIGN UP");

        UserNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setText("User Name");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");

        SignUpButton.setBackground(new java.awt.Color(110, 84, 181));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign Up");

        Text.setBackground(new java.awt.Color(238, 238, 250));
        Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Already have an account?");

        LoginButton.setForeground(new java.awt.Color(51, 51, 51));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ImageLabel.setBackground(new java.awt.Color(255, 255, 255));
        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));

        EmailLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel1.setText("Email");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(Text)
                                .addGap(18, 18, 18)
                                .addComponent(LoginButton))
                            .addComponent(PasswordLabel)
                            .addComponent(UserNameLabel)
                            .addComponent(UserNameTextField)
                            .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTextField1)
                            .addComponent(EmailLabel1)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(SignUpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(81, 81, 81)))
                .addGap(42, 42, 42))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(SignUpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EmailLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(SignUpButton)
                        .addGap(43, 43, 43)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text)
                            .addComponent(LoginButton)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 800, 500);

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

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null); // Frame Center
        loginFrame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JTextField EmailTextField1;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
