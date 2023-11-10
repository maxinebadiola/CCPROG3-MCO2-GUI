/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ERICA
 */
public class SVMDisplayMaintenancePanel extends javax.swing.JPanel {

    private Special special;

    public SVMDisplayMaintenancePanel(Special special) {
        this.special = special;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        displayTransactionsButton = new javax.swing.JRadioButton();
        displaySalesButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        exitButton1 = new javax.swing.JButton();
        maintenanceSelectButton = new javax.swing.JButton();
        displayTransactionsPanel = new javax.swing.JPanel();
        container1 = new javax.swing.JScrollPane();
        titleLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        exitButton2 = new javax.swing.JButton();
        transactionsLabel = new javax.swing.JLabel();
        displaySalesPanel = new javax.swing.JPanel();
        titleLabel2 = new javax.swing.JLabel();
        container2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        exitButton3 = new javax.swing.JButton();
        salesReportLabel = new javax.swing.JLabel();
        container4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(520, 470));
        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel.setText("PRODUCT MAINTENANCE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        displayTransactionsButton.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(displayTransactionsButton);
        displayTransactionsButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        displayTransactionsButton.setForeground(new java.awt.Color(255, 153, 153));
        displayTransactionsButton.setText("Display Transactions");
        jPanel1.add(displayTransactionsButton);

        displaySalesButton.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(displaySalesButton);
        displaySalesButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        displaySalesButton.setForeground(new java.awt.Color(255, 153, 153));
        displaySalesButton.setText("Display Sales Report");
        displaySalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySalesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displaySalesButton);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        exitButton1.setBackground(new java.awt.Color(255, 153, 153));
        exitButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        maintenanceSelectButton.setBackground(new java.awt.Color(153, 209, 153));
        maintenanceSelectButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        maintenanceSelectButton.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceSelectButton.setText("Select Option");
        maintenanceSelectButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        maintenanceSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceSelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton1))
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(maintenanceSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(maintenanceSelectButton)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        add(jPanel2, "card2");

        displayTransactionsPanel.setBackground(new java.awt.Color(255, 204, 204));

        container1.setBackground(new java.awt.Color(255, 255, 204));

        titleLabel1.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel1.setText("Vending Machine Maintenance");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));

        exitButton2.setBackground(new java.awt.Color(255, 153, 153));
        exitButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton2ActionPerformed(evt);
            }
        });

        transactionsLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        transactionsLabel.setForeground(new java.awt.Color(255, 255, 204));
        transactionsLabel.setText("SPECIAL VENDING MACHINE TRANSACTIONS");

        javax.swing.GroupLayout displayTransactionsPanelLayout = new javax.swing.GroupLayout(displayTransactionsPanel);
        displayTransactionsPanel.setLayout(displayTransactionsPanelLayout);
        displayTransactionsPanelLayout.setHorizontalGroup(
            displayTransactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayTransactionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(displayTransactionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayTransactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayTransactionsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton2))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(displayTransactionsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(transactionsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayTransactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayTransactionsPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        displayTransactionsPanelLayout.setVerticalGroup(
            displayTransactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTransactionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionsLabel)
                .addGap(307, 307, 307)
                .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayTransactionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayTransactionsPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(displayTransactionsPanel, "displayTransactionsPanel");

        displaySalesPanel.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel2.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel2.setText("Vending Machine Maintenance");

        container2.setBackground(new java.awt.Color(255, 255, 204));
        container2.setPreferredSize(new java.awt.Dimension(500, 276));
        container2.setLayout(new java.awt.BorderLayout());

        jSeparator3.setForeground(new java.awt.Color(204, 204, 255));

        exitButton3.setBackground(new java.awt.Color(255, 153, 153));
        exitButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });

        salesReportLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        salesReportLabel.setForeground(new java.awt.Color(255, 255, 204));
        salesReportLabel.setText("SPECIAL VENDING MACHINE SALES REPORT");

        javax.swing.GroupLayout displaySalesPanelLayout = new javax.swing.GroupLayout(displaySalesPanel);
        displaySalesPanel.setLayout(displaySalesPanelLayout);
        displaySalesPanelLayout.setHorizontalGroup(
            displaySalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaySalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displaySalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaySalesPanelLayout.createSequentialGroup()
                        .addGroup(displaySalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaySalesPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exitButton3))
                            .addComponent(container2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaySalesPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(displaySalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaySalesPanelLayout.createSequentialGroup()
                                .addComponent(titleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaySalesPanelLayout.createSequentialGroup()
                                .addComponent(salesReportLabel)
                                .addGap(31, 31, 31))))))
        );
        displaySalesPanelLayout.setVerticalGroup(
            displaySalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaySalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesReportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(exitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(displaySalesPanel, "displaySalesPanel");

        container4.setBackground(new java.awt.Color(255, 255, 204));
        container4.setPreferredSize(new java.awt.Dimension(500, 276));
        container4.setLayout(new java.awt.BorderLayout());
        add(container4, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void displaySalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySalesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaySalesButtonActionPerformed

    private void maintenanceSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceSelectButtonActionPerformed
        if (!displayTransactionsButton.isSelected()
                && !displaySalesButton.isSelected()) {

            JOptionPane.showMessageDialog(this, "Please select an option before proceeding.", "Option Not Selected",
                    JOptionPane.ERROR_MESSAGE);

        }

        if (displayTransactionsButton.isSelected()) {
            CardLayout cardLayout = (CardLayout) getLayout();
            cardLayout.show(this, "displayTransactionsPanel");
            printTransactions();

        } else if (displaySalesButton.isSelected()) {
            CardLayout cardLayout = (CardLayout) getLayout();
            cardLayout.show(this, "displaySalesPanel");
            printSalesReport();
        }

        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_maintenanceSelectButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitButton1ActionPerformed
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        SVMMaintenancePanel maintenancePanel = new SVMMaintenancePanel(special);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(maintenancePanel, "maintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "maintenancePanel");
    }// GEN-LAST:event_exitButton1ActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitButton2ActionPerformed
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        SVMDisplayMaintenancePanel displayMaintenancePanel = new SVMDisplayMaintenancePanel(special);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(displayMaintenancePanel, "displayMaintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "displayMaintenancePanel");
    }// GEN-LAST:event_exitButton2ActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitButton3ActionPerformed
        mainJFrame frame = (mainJFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        SVMDisplayMaintenancePanel displayMaintenancePanel = new SVMDisplayMaintenancePanel(special);

        javax.swing.JLayeredPane jLayeredPane1 = frame.getjLayeredPane1();
        jLayeredPane1.add(displayMaintenancePanel, "displayMaintenancePanel");

        CardLayout cardLayout = (CardLayout) jLayeredPane1.getLayout();
        cardLayout.show(jLayeredPane1, "displayMaintenancePanel");
    }// GEN-LAST:event_exitButton3ActionPerformed

    private void printTransactions() {
        container1.setViewportView(null);
        try {
            ArrayList<Transaction> transactionList = special.getTransactions();
            JPanel transactionPanel = new JPanel();
            transactionPanel.setLayout(new BoxLayout(transactionPanel, BoxLayout.Y_AXIS));
            transactionPanel.setBackground(new Color(255, 255, 204));
            int transactionNum = 1;
            
            for (Transaction transaction : transactionList) {
                ArrayList<Product> products = transaction.getProducts();
                JLabel transactionLabel = new JLabel("Transaction: " + transactionNum);
                transactionPanel.add(transactionLabel);
                JLabel ingredientsLabel = new JLabel("Ingredients in Froyo: ");
                transactionPanel.add(ingredientsLabel);
                
                for (Product product : products) {

                    JLabel productName = new JLabel("- " + product.getName());

                    transactionPanel.add(productName);

                }
                JLabel payment = new JLabel("Payment: " + transaction.getPayment());
                JLabel change = new JLabel("Change: " + transaction.getChange());
                transactionPanel.add(payment);
                transactionPanel.add(change);

                transactionPanel.add(Box.createVerticalStrut(10));
                transactionNum++;
            }

            container1.setViewportView(transactionPanel);

            container1.revalidate();
            container1.repaint();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No transactions made yet.", "Invalid Transactions List", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void printSalesReport() {
        container2.removeAll();
        try {
            ArrayList<String> salesReportArray = special.salesReport();
            int rows = salesReportArray.size();
            container2.setLayout(new GridLayout(rows, 1));

            for (String report : salesReportArray) {
                JLabel salesReport = new JLabel(report);
                container2.add(salesReport);
            }

            JLabel totalSales = new JLabel("Total Sales: P" + special.calculateTotalSales());

            container2.add(totalSales);

            container2.revalidate();
            container2.repaint();
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "No transactions made yet.", "Invalid Transactions List",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane container1;
    private javax.swing.JPanel container2;
    private javax.swing.JPanel container4;
    private javax.swing.JRadioButton displaySalesButton;
    private javax.swing.JPanel displaySalesPanel;
    private javax.swing.JRadioButton displayTransactionsButton;
    private javax.swing.JPanel displayTransactionsPanel;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton maintenanceSelectButton;
    private javax.swing.JLabel salesReportLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel transactionsLabel;
    // End of variables declaration//GEN-END:variables
}
