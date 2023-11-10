/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author ERICA
 */
public class RVMCurrencyOptionsPanel extends javax.swing.JPanel {
    private Machine machine;
    HashMap<Currency, Integer> selectedCurrency = new HashMap<>();

    /**
     * Creates new form ProductsPanel
     * 
     * @param machine
     */

    public RVMCurrencyOptionsPanel(Machine machine) {
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
        buttonGroup1 = new ButtonGroup();

        removeAll();

        int y = 10;

        for (Currency currency : currencyStock) {

            JRadioButton radioButton = new JRadioButton("Value: PHP" + String.valueOf(currency.getValue()));
            radioButton.setActionCommand(String.valueOf(currency.getValue()));
            buttonGroup1.add(radioButton);

            radioButton.setBackground(null);

            JLabel quantity = new JLabel("Quantity: " + currency.getQuantity());

            radioButton.setBounds(10, y, 150, 20);
            quantity.setBounds(200, y, 100, 20);

            y += 30;

            add(radioButton);
            add(quantity);

        }

        int preferredHeight = y + 10;
        setPreferredSize(new Dimension(getPreferredSize().width, preferredHeight));

        revalidate();
        repaint();
    }

    public String getSelectedCurrency() {
        ButtonModel selectedButton = buttonGroup1.getSelection();

        if (selectedButton != null) {
            return selectedButton.getActionCommand();
        }

        return null;
    }

    public void clearSelection() {
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
