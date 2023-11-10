package javaproject9;

public class Currency {

   private int value; //denominations/value of currency (ex. 100, 50, 20, 10, 5, 1)
   private int quantity; //amount of currency in stock, AKA machine has 10 P1 coins etc...

   public Currency(int value, int quantity) {
      this.value = value;
      this.quantity = quantity;
   }

   //Getters
   public int getValue() {
      return value;
   }

   public int getQuantity() {
      return quantity;
   }
   //Setters
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

}
