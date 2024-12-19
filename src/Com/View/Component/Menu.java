package Com.View.Component;

import Com.Event.MenuEvent;
import Com.View.Swing.MenuButton;
import Com.Swing.Scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import Com.View.Login.Login;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends javax.swing.JPanel {

    private MenuButton selectedMenu;
    private MenuButton unSelectedMenu;
    private Animator animator;
    private MenuEvent event;
    public Menu() {
        initComponents();
        setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
        scroll.getViewport().setOpaque(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0","[fill]"));
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
               selectedMenu.setAnimate(fraction);
               if(unSelectedMenu != null){
                   unSelectedMenu.setAnimate(1f - fraction);
               }

            }
            
        };
        animator = new Animator(300, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
        jLabel2.setText(Login.user.getName());
        if(Login.user.getImage()!= null){
            ImageIcon imageIcon = new ImageIcon(Login.user.getImage());
            imageAvatar1.setImage(imageIcon);
        }     
    }

     public void initMenu(MenuEvent event){

            if(Login.user.getPosition().equalsIgnoreCase("admin")){
                this.event = event;
                addMenu("1", "Trang chủ", 0);
                addMenu("2", "Bán hàng",1);
                //addTitle("   ---Lmao---");
                addMenu("3", "Nhân viên", 2);
                addMenu("5", "Hóa đơn", 4);
                addMenu("6", "Sản phẩm", 5);
                addMenu("7", "Khách hàng", 6);
                addMenu("8", "Thống kê", 7);
                addMenu("9", "Thông tin", 8);
                space();
                addMenu("key", "Logout", 9);
            }
            else if(Login.user.getPosition().equalsIgnoreCase("nhan vien")){
                this.event = event;
                addMenu("1", "Trang chủ", 0);
                addMenu("2", "Bán hàng",1);
                addMenu("5", "Hóa đơn", 4);
                addMenu("7", "Khách hàng", 6);
                addMenu("9", "Thông tin", 8);
                space();
                addMenu("key", "Logout", 9);
            }
     }
    
     private void addMenu(String icon, String text, int index){
         MenuButton menu = new MenuButton(index);
         setFont(menu.getFont().deriveFont(Font.PLAIN, 14));
         menu.setIcon(new ImageIcon(getClass().getResource("/Com/Icon/"+icon+".png")));
         menu.setText(" " + text);
         menu.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(!animator.isRunning()){
                     if(menu != selectedMenu){
                        unSelectedMenu = selectedMenu;
                        selectedMenu = menu;
                        animator.start();
                        event.menuSelected(index);
                     }
                 }
             }
         });
         panelMenu.add(menu);
     }
     
     public void addTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        label.setForeground(new Color(170, 170, 170));
        panelMenu.add(label);
    }
     
     public void space(){
         panelMenu.add(new JLabel(),"push");
     }
     
     public void setSelected (int index){
         for(Component com:panelMenu.getComponents()){
             MenuButton menu = (MenuButton)com;
             if(menu.getIndex()==index){
                 if(menu != selectedMenu){
                     unSelectedMenu = selectedMenu;
                     selectedMenu = menu;
                     animator.start();
                     event.menuSelected(index);
                 }
                 break;
             }
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imageAvatar1 = new Com.View.Swing.ImageAvatar();
        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Icon/logo-dai-hoc-cong-nghiep-ha-noi-inkythuatso-01-21-15-51-20-removebg-preview (1).png"))); // NOI18N
        jLabel1.setText("WELCOME");

        scroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        panelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Com.View.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

}
