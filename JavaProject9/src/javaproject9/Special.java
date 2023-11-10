package javaproject9;

import java.util.ArrayList;

public class Special extends Machine {
    public Special() {
        super();
    }

    //Generate Combo based on inputted ingredients
    public Combo generateCombo(ArrayList<Product> ingredients) {
        return new Combo(ingredients);
    }
    // Customize the preparation process for Combo

    public String preparingCombo(Combo combo) {

        StringBuilder preparationSteps = new StringBuilder();
        // ALWAYS PRINT, EACH COMBO MUST HAVE YOGURT
        preparationSteps.append("Preparing Cup...\n");
        preparationSteps.append("Dispensing Yogurt...\n");

        //ArrayList<Product> comboIngredients = combo.getIngredients();
        preparationSteps.append("Topping with ").append(combo.getName().substring(12)).append("...\n");
        preparationSteps.append("Serving ").append(combo.getName()).append("...\n");

        preparationSteps.append("Total Calories: ").append(combo.getCalories()).append("\n");
        preparationSteps.append("Total Price: ").append(combo.getPrice()).append("\n");

        preparationSteps.append("Order Complete!");

        return preparationSteps.toString();
    }

    //Ovveride Machine generateTransaction
    //Generate Transaction (AFTER SUCESSFUL TRANSACTION)
    public Transaction generateTransaction(int payment, Combo combo, int change) {
        //Convert Combo to Product 
        Transaction transaction = new Transaction(payment, combo, change); //create transaction
        transactionList.add(transaction); //add to list
        return transaction;
    }
    public boolean yogurtAvailability() {
        return slotList.get(0).getAvailability();
    }
}
