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
public class RVMMaintenancePanel extends javax.swing.JPanel {

    private Machine machine;
    private int totalPayment;

    /**
     * Creates new form MainMenuJPanel
     */
    public RVMMaintenancePanel(Machine machine) {
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
        jPanel1 = new javax.swing.JPanel();
        currencyMaintenanceButton = new javax.swing.JButton();
        productMaintenanceButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titleLabel1 = new javax.swing.JLabel();
        transactionMaintenanceButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(482, 470));

        titleLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel.setText("MACHINE MAINTENANCE");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        currencyMaintenanceButton.setBackground(new java.awt.Color(153, 204, 255));
        currencyMaintenanceButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        currencyMaintenanceButton.setForeground(new java.awt.Color(255, 255, 255));
        currencyMaintenanceButton.setText("Currency Maintenance");
        currencyMaintenanceButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        currencyMaintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyMaintenanceButtonActionPerformed(evt);
            }
        });

        productMaintenanceButton.setBackground(new java.awt.Color(209, 235, 209));
        productMaintenanceButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        productMaintenanceButton.setForeground(new java.awt.Color(255, 255, 255));
        productMaintenanceButton.setText("Product Maintenance");
        productMaintenanceButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        productMaintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMaintenanceButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titleLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(204, 204, 255));
        titleLabel1.setText("CHOOSE FUNCTION");

        transactionMaintenanceButton.setBackground(new java.awt.Color(255, 204, 153));
        transactionMaintenanceButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        transactionMaintenanceButton.setForeground(new java.awt.Color(255, 255, 255));
        transactionMaintenanceButton.setText("Display Transaction Info");
        transactionMaintenanceButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        transactionMaintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMaintenanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(404, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titleLabel1)
                    .addComponent(currencyMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(transactionMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currencyMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productMaintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
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
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transactionMaintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionMaintenanceButtonActionPerformed
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        RVMDisplayMaintenancePanel displayMaintenancePanel = new RVMDisplayMaintenancePanel(machine);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(displayMaintenancePanel, "displayMaintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "displayMaintenancePanel");
    }//GEN-LAST:event_transactionMaintenanceButtonActionPerformed

    private void productMaintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_productMaintenanceButtonActionPerformed

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        RVMProductMaintenancePanel productMaintenancePanel = new RVMProductMaintenancePanel(machine);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(productMaintenancePanel, "productMaintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "productMaintenancePanel");

    }// GEN-LAST:event_productMaintenanceButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "RVMMenuPanel");

    }// GEN-LAST:event_jButton1ActionPerformed

    private void currencyMaintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_currencyMaintenanceButtonActionPerformed

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        RVMCurrencyMaintenancePanel currencyMaintenancePanel = new RVMCurrencyMaintenancePanel(machine);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(currencyMaintenancePanel, "currencyMaintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "currencyMaintenancePanel");

    }// GEN-LAST:event_currencyMaintenanceButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton currencyMaintenanceButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton productMaintenanceButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JButton transactionMaintenanceButton;
    // End of variables declaration//GEN-END:variables
}
