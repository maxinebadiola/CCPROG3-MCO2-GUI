/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ERICA
 */
public class RVMPrintCurrencyPanel extends javax.swing.JPanel {

    private Machine machine;
    HashMap<Currency, Integer> selectedCurrency = new HashMap<>();

    /**
     * Creates new form ProductsPanel
     *
     * @param machine
     */
    public RVMPrintCurrencyPanel(Machine machine) {
        this.machine = machine;
        initComponents();
        generatePaymentButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void generatePaymentButtons() {
        ArrayList<Currency> currencyStock = machine.getCurrencyStock();

        removeAll();
        JPanel productPanel = new JPanel();

        int y = 10;

        productPanel.setBackground(new Color(255, 255, 204));

        for (Currency currency : currencyStock) {

            JLabel nameLabel = new JLabel("PHP" + currency.getValue());
            JLabel quantity = new JLabel("Stock: " + currency.getQuantity());

            nameLabel.setBounds(10, y, 150, 20);
            quantity.setBounds(200, y, 100, 20);

            y += 40;

            add(nameLabel);
            add(quantity);

        }

        jPanel1.add(productPanel);

        revalidate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
