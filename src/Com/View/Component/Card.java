package Com.View.Component;

import Com.Model.ModelCard;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Card extends javax.swing.JPanel {
    private Color colorGradient;

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
    }

    public Card(Color colorGradient, JLabel iconLabel, JLabel titleLabel, JLabel valuesLabel) {
        this.colorGradient = colorGradient;
        this.iconLabel = iconLabel;
        this.titleLabel = titleLabel;
        this.valuesLabel = valuesLabel;
    }

    
    public Card() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(112, 69, 246));
        colorGradient = new Color(255, 255, 255);
        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    public void setData(ModelCard data){
        DecimalFormat df = new DecimalFormat("#,##0.##");
        titleLabel.setText(data.getTitle());
        valuesLabel.setText(df.format(data.getValues()));
        iconLabel.setIcon(data.getIcon());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        valuesLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(225, 225, 225));
        titleLabel.setText("Title");

        valuesLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        valuesLabel.setForeground(new java.awt.Color(225, 225, 225));
        valuesLabel.setText("Values");

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(valuesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valuesLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, getHeight(), getBackground(), getWidth(), 0, colorGradient);
        g2.setPaint(gra);
        //g2.fillRect(0, 0, getWidth(), getHeight());
        int width = getWidth();
        int height = getHeight();
        g2.fillRoundRect(0, 0, width, height, 15, 15);
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel valuesLabel;
    // End of variables declaration//GEN-END:variables
}
