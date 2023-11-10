/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject9;

/**
 *
 * @author ERICA
 */
public class Main {
        public static void main(String args[]) {
        Machine machine = new Machine();
        machine.initializeCurrencies();
        
        Special special = new Special();
        special.initializeCurrencies();

        
        // #1 Intialize Products
        Product yogurt = new Product("Yogurt", 50, 500);
        Product apple = new Product("Apple", 10, 50);
        Product banana = new Product("Banana", 8, 80);
        Product orange = new Product("Orange", 12, 60);
        Product strawberry = new Product("Strawberry", 15, 40);
        Product pineapple = new Product("Pineapple", 20, 70);
        Product watermelon = new Product("Watermelon", 18, 30);
        Product mango = new Product("Mango", 25, 90);
        Product kiwi = new Product("Kiwi", 13, 55);

        // #2 Assign Products to Slot in Regular Vending Machine
        machine.addProduct(apple, 5);
        machine.addProduct(banana, 3);
        machine.addProduct(orange, 4);
        machine.addProduct(strawberry, 2);
        machine.addProduct(pineapple, 6);
        machine.addProduct(watermelon, 1);
        machine.addProduct(mango, 3);
        machine.addProduct(kiwi, 4);
        
        // #3 Assign Products to Slot in Special Vending Machine
        special.addProduct(yogurt, 10);
        special.addProduct(apple, 5);
        special.addProduct(banana, 3);
        special.addProduct(orange, 4);
        special.addProduct(strawberry, 2);
        special.addProduct(pineapple, 6);
        special.addProduct(watermelon, 1);
        special.addProduct(mango, 3);
        special.addProduct(kiwi, 4);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame(machine, special).setVisible(true);
            }
        });
    
        }    
}
