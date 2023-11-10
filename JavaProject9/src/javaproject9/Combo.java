package javaproject9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Combo extends Product {
   private ArrayList<Product> ingredients; //ingredients of combo
   
   public Combo(ArrayList<Product> ingredients) {
      super("", 0, 0); //NULL for name, price, calories
      this.ingredients = new ArrayList<>(ingredients);
      this.name = initializeComboName();
      this.price = calculateComboPrice();
      this.calories = calculateComboCalories();
   }
   
   //Initialize name of Combo based on ingredients (Ex. Yogurt with 1 Mango etc...)
      private String initializeComboName() {
      StringBuilder comboName = new StringBuilder("Yogurt with ");
      int numIngredients = ingredients.size();
      Set<String> addedIngredients = new HashSet<>();

      for (int i = 1; i < numIngredients; i++) {
         Product Product = ingredients.get(i);
         String ProductName = Product.getName();
         if (!addedIngredients.contains(ProductName)) 
         {
            int numInstances = getProductInstances(ProductName);
            comboName.append(getProductString(ProductName, numInstances));
            addedIngredients.add(ProductName);
            if (i < numIngredients - 1) 
               comboName.append(", ");
         }
      }

         return comboName.toString();
      }  

   //HELPER FUNCTION: Deals with adding proper pluralization to ingredients
   //Ex. 2 Mangoes, 3 Strawberries etc...
   private String getProductString(String ProductName, int numInstances) {
      if (numInstances > 1) {
         if (ProductName.endsWith("o")) 
            ProductName += "es"; // Ex. Mangoes
         else if (ProductName.endsWith("y")) 
             ProductName = ProductName.substring(0, ProductName.length() - 1) + "ies"; // Strawberries
         else 
            ProductName += "s"; // Ex. Bananas
      }
      return numInstances + " " + ProductName;
   }

   //HELPER FUNCTIONS: Counting Ingredients in Combo
   private int getProductInstances(String ProductName) {
      int numInstances = 0;
      for (Product Product : ingredients) {  
         if (Product.getName().equals(ProductName)) {
               numInstances++;
         }
      }
      return numInstances;
   }
   
   //HELPER FUNCTIONS: Calculate Price of Combo = Sum of all ingredients
   private int calculateComboPrice() {
      int totalPrice = 0;
      for (Product Product : ingredients) {
         totalPrice += Product.getPrice();
      }
      return totalPrice;
   }
   //HELPER FUNCTIONS: Calculate Calories of Combo = Sum of all ingredients
   private int calculateComboCalories() {
      int totalCalories = 0;
      for (Product Product : ingredients) {
         totalCalories += Product.getCalories();
      }
      return totalCalories;
   }
   //Return ingredients of Combo
   public ArrayList<Product> getIngredients() {
      return ingredients;
   }

}