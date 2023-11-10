/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author ERICA
 */
public class RVMPanel extends javax.swing.JPanel {

    private Machine machine;
    private int totalPayment;
    private int change;
    private RVMProductPanel rvmProductPanel;

    public RVMPanel(Machine machine, int totalPayment) {
        this.machine = machine;
        this.totalPayment = totalPayment;
        initComponents();
        initializeProductsPanel(machine);
        rvmChangeButton.setVisible(false);
        updatePaymentLabel();
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
        rvmChangeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rvmPurchaseButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        paymentLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(520, 470));

        titleLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel.setText("INGREDIENT VENDING MACHINE");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel1.setLayout(new java.awt.BorderLayout());

        rvmChangeButton.setBackground(new java.awt.Color(153, 209, 153));
        rvmChangeButton.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        rvmChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        rvmChangeButton.setText("Dispense Change");
        rvmChangeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        rvmChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rvmChangeButtonActionPerformed(evt);
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

        rvmPurchaseButton.setBackground(new java.awt.Color(153, 209, 153));
        rvmPurchaseButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        rvmPurchaseButton.setForeground(new java.awt.Color(255, 255, 255));
        rvmPurchaseButton.setText("Purchase");
        rvmPurchaseButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        rvmPurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rvmPurchaseButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(153, 209, 153));
        clearButton.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Selection");
        clearButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paymentLabel.setText("Total Payment: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(rvmChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rvmPurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(paymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rvmPurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(clearButton)
                            .addComponent(rvmChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rvmChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rvmChangeButtonActionPerformed
        String changeString = machine.dispenseChange(change);

        machine.updateCurrencyStockWithChange(machine.calculateChangeQuantity(change));

        JOptionPane.showMessageDialog(this, "Change is " + changeString + "\n" + " = PHP" + change);
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "RVMMenuPanel");

    }// GEN-LAST:event_rvmChangeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        String changeDenominations = machine.dispenseChange(totalPayment);
         machine.updateCurrencyStockWithChange(machine.calculateChangeQuantity(totalPayment));
        JOptionPane.showMessageDialog(this, "Payment returned: PHP " + changeDenominations + " = PHP " + totalPayment);

        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "RVMMenuPanel");
    }// GEN-LAST:event_jButton1ActionPerformed

    private void rvmPurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        RVMProductPanel rvmProductPanel = (RVMProductPanel) jPanel1.getComponent(0);
        Product selectedProduct = rvmProductPanel.getSelectedProduct();
        Slot slot = machine.findSlotByProduct(selectedProduct);
        

        if (selectedProduct != null) {
            int availableStock = slot.getStock();
            int price = selectedProduct.getPrice();
         if (machine.isValidPayment(price, totalPayment)) {
            if (availableStock > 0) {

                change = machine.calculateTotalChange(price, totalPayment);
               boolean status = machine.performPurchase(selectedProduct, totalPayment);

                if (status) {
                    initializeProductsPanel(machine);
                    totalPayment = change;
                    updatePaymentLabel();
                    jButton1.setVisible(false);
                    rvmChangeButton.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Dispensed: " + selectedProduct.getName() + "\n Change: " + change);
                } else {

                    JOptionPane.showMessageDialog(this, "Insufficient change in machine.", "Transaction failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {

                JOptionPane.showMessageDialog(this, "No stock left.", "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Payment is invalid.", "Invalid Payment",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
        else {
            JOptionPane.showMessageDialog(this, "Please select a product.", "Invalid Selection",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
        rvmProductPanel.clearSelection();
    }// GEN-LAST:event_clearButtonActionPerformed

    private void initializeProductsPanel(Machine machine) {
        if (rvmProductPanel != null) {
            jPanel1.remove(rvmProductPanel);
        }

        rvmProductPanel = new RVMProductPanel(machine);

        jPanel1.add(rvmProductPanel, BorderLayout.CENTER);

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void updatePaymentLabel() {

        paymentLabel.setText("Total Payment: PHP " + totalPayment);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JButton rvmChangeButton;
    private javax.swing.JButton rvmPurchaseButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}