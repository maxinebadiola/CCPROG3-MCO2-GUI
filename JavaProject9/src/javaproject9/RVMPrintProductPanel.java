/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author ERICA
 */
public class RVMPrintProductPanel extends javax.swing.JPanel {

    private Machine machine;

    /**
     * Creates new form ProductsPanel
     *
     * @param machine
     */
    public RVMPrintProductPanel(Machine machine) {
        this.machine = machine;
        initComponents();
        generateProductLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

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
    }// </editor-fold>

    private void generateProductLabels() {
        ArrayList<Slot> slotList = machine.getSlotList();

        removeAll();

        int y = 10;

        for (int i = 0; i < slotList.size(); i++) {

            JLabel nameLabel = new JLabel(slotList.get(i).getProduct().getName());
            JLabel stockLabel = new JLabel("Stock: " + slotList.get(i).getStock());
            JLabel priceLabel = new JLabel("Price: PHP " + slotList.get(i).getProduct().getPrice());
            JLabel caloriesLabel = new JLabel("Calories: " + slotList.get(i).getProduct().getCalories());

            nameLabel.setBounds(10, y, 100, 20);
            stockLabel.setBounds(120, y, 100, 20);
            priceLabel.setBounds(230, y, 150, 20);
            caloriesLabel.setBounds(390, y, 150, 20);

            y += 30;

            add(nameLabel);
            add(stockLabel);
            add(priceLabel);
            add(caloriesLabel);

        }

        int preferredHeight = y + 10;
        setPreferredSize(new Dimension(getPreferredSize().width, preferredHeight));

        revalidate();
        repaint();
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
