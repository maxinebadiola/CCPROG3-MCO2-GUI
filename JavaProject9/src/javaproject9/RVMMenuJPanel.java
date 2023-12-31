/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.CardLayout;

/**
 *
 * @author ERICA
 */
public class RVMMenuJPanel extends javax.swing.JPanel {

    private Machine machine;

    /**
     * Creates new form MainMenuJPanel
     */
    public RVMMenuJPanel(Machine machine) {
        this.machine = machine;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        purchaseButton = new javax.swing.JButton();
        maintenanceButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 202, 204));
        setPreferredSize(new java.awt.Dimension(482, 470));

        titleLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel.setText("REGULAR VENDING MACHINE");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        exitButton.setBackground(new java.awt.Color(204, 204, 255));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 249, 249), 5, true));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        purchaseButton.setBackground(new java.awt.Color(204, 204, 255));
        purchaseButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        purchaseButton.setForeground(new java.awt.Color(255, 255, 255));
        purchaseButton.setText("Make a Purchase");
        purchaseButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 249, 249), 5, true));
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        maintenanceButton.setBackground(new java.awt.Color(204, 204, 255));
        maintenanceButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        maintenanceButton.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceButton.setText("Machine Maintenance");
        maintenanceButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 249, 249), 5, true));
        maintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(maintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 416, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maintenanceButtonActionPerformed

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "RVMMaintenancePanel");
    }// GEN-LAST:event_maintenanceButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "MainMenuPanel");
    }// GEN-LAST:event_jButton1ActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_transactionButtonActionPerformed

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "RVMPaymentPanel");

    }// GEN-LAST:event_transactionButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton maintenanceButton;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
