package javaproject9;

import java.util.ArrayList;
import java.util.HashMap;

public class Machine {

    protected ArrayList<Slot> slotList; //list of slots
    protected ArrayList<Transaction> transactionList; //list of all transactions
    protected ArrayList<Currency> currencyStock; //list of all currency

    public Machine() {
        slotList = new ArrayList<>();
        transactionList = new ArrayList<>();
        currencyStock = new ArrayList<>();
    }

    /**
     * ************************************************************************************
     */
    //TRANSACTION METHODS
    //Converts user input denomination payment -> List of Currency
    public ArrayList<Currency> extractPayment(String paymentString) {
        ArrayList<Integer> paymentQuantities = splitPaymentQuantities(paymentString);
        ArrayList<Currency> paymentDenominations = initializePaymentDenominations(paymentQuantities);
        return paymentDenominations;
    }

    //Splits the int in the String Input (Ex. 0-3-1-5...) -> Returns quantity of each currency inserted
    private ArrayList<Integer> splitPaymentQuantities(String paymentString) {
        String[] paymentArray = paymentString.split("-");
        ArrayList<Integer> paymentQuantities = new ArrayList<>();
        for (String quantity : paymentArray) {
            paymentQuantities.add(Integer.parseInt(quantity));
        }
        return paymentQuantities;
    }

    //Assigns quantities of user input to values of Currency
    private ArrayList<Currency> initializePaymentDenominations(ArrayList<Integer> paymentQuantities) {
        ArrayList<Currency> paymentDenominations = new ArrayList<>();
        for (int i = 0; i < currencyStock.size(); i++) {
            Currency currency = currencyStock.get(i);
            paymentDenominations.add(new Currency(currency.getValue(), 0));
        }
        for (int i = 0; i < paymentQuantities.size(); i++) {
            int quantity = paymentQuantities.get(i);
            paymentDenominations.get(i).setQuantity(quantity);
        }
        return paymentDenominations;
    }

    //Calculates the value of the payment inserted 
    public int calculateTotalPayment(HashMap<Currency, Integer> paymentDenominations) {
        int totalPayment = 0;
        for (Currency currency : paymentDenominations.keySet()) {
            int quantity = paymentDenominations.get(currency);
            totalPayment += currency.getValue() * quantity;
        }
        return totalPayment;
    }

    //Determines if a payment is enough for the price
    public boolean isValidPayment(int price, int totalPayment) {
        boolean result = false;

        if (result = totalPayment >= price) {
            result = true;
        }

        return result;
    }

    //Determines if a payment is enough for the price
    public boolean validCurrency(HashMap<Currency, Integer> selectedCurrencies) {

        boolean nullCount = true;
        for (Integer count : selectedCurrencies.values()) {
            if (count != null && count != 0) {
                nullCount = false;
                break;
            }
        }

        return nullCount;
    }

    //Calculates VALUE the total change 
    public int calculateTotalChange(int productPrice, int totalPayment) {
        int change = 0;
        if (totalPayment - productPrice > 0) //if payment is NOT exact
        {
            change = totalPayment - productPrice;
        }
        return change;
    }

    //Determines if currency stock has enough Currency quantities to dispense change
    public boolean stockHasSufficientChange(int change) {
        int remainingChange = change;
        boolean sufficient = false;
        for (Currency currency : currencyStock) {
            int denomination = currency.getValue();
            int quantity = currency.getQuantity();

            int billsToUse = Math.min(remainingChange / denomination, quantity);
            remainingChange -= billsToUse * denomination;

            if (remainingChange == 0) {
                sufficient = true;
            }
        }
        return sufficient;
    }

    //Dispenses the change -> String
    public String dispenseChange(int totalChange) {
        String result = null;
        if (stockHasSufficientChange(totalChange)) {
            ArrayList<Integer> changeQuantity = calculateChangeQuantity(totalChange);
            result = formatChangeString(changeQuantity);
        }
        return result;
    }

    //Returns an array of the change in denominations
    public ArrayList<Integer> calculateChangeQuantity(int remainingChange) {
        ArrayList<Integer> changeQuantity = new ArrayList<>();
        for (int i = 0; i < currencyStock.size(); i++) {
            Currency currency = currencyStock.get(i);
            int denomination = currency.getValue();
            int quantity = Math.min(remainingChange / denomination, currency.getQuantity());
            changeQuantity.add(quantity);
            remainingChange -= quantity * denomination;
        }
        return changeQuantity;
    }

    //Formats the change into a string
    public String formatChangeString(ArrayList<Integer> changeQuantity) {
        StringBuilder changeString = new StringBuilder();
        for (int i = 0; i < changeQuantity.size(); i++) {
            int quantity = changeQuantity.get(i);
            if (quantity > 0 || changeString.length() > 0) {
                if (changeString.length() > 0) {
                    changeString.append("-");
                }
                changeString.append(quantity);
            } else {
                changeString.append("0");
            }

        }
        return changeString.toString();
    }

    //Perform purchase    
    public boolean performPurchase(Item selectedProduct, int totalPayment) {
        int price = selectedProduct.getPrice();
        boolean result = false;

        
            int change = calculateTotalChange(price, totalPayment);

            // VALIDATION -> CALCULATE IF CURRENCY STOCK IS SUFFICIENT FOR CHANGE
            if (stockHasSufficientChange(change)) {
                generateTransaction(totalPayment, selectedProduct, change); //adds transaction to transaction list
                // DISPENSE PRODUCT -> INPUT TRANSACTION (UPDATES SLOT STOCK ETC.)
                //Loop through LATEST transaction in transaction list and update
                Transaction lastTransaction = transactionList.get(transactionList.size() - 1);
                ArrayList<Product> productList = lastTransaction.getProducts(); //get product list
                for (Product product : productList) {
                    Slot slot = findSlotByProduct(product); // slot product is in
                    slot.dispenseProduct(); //dispense 
                }
                result = true;
            }
        
        return result;
    }

    /**
     * ***********************************************************************************
     */
    //AFTER TRANSACTION -> UPDATE PARAMETERS
    //Subtracts the change denominations from the currency stock
    public void updateCurrencyStockWithChange(ArrayList<Integer> changeQuantity) {
        for (int i = 0; i < currencyStock.size(); i++) {
            Currency currency = currencyStock.get(i);
            int quantity = changeQuantity.get(i);
            currency.setQuantity(currency.getQuantity() - quantity);
        }
    }

    //adds the payment denominations to the currency stock
    public void updateCurrencyStockWithPayment(HashMap<Currency, Integer> paymentDenominations) {
        for (Currency currency : paymentDenominations.keySet()) {
            int quantity = paymentDenominations.get(currency);
            currency.setQuantity(currency.getQuantity() + quantity);
        }
    }

    //UPDATE Product Stock (AFTER SUCESSFUL TRANSACTION)
    /* public void updateStock(int slotIndex) {
      Slot slot = slotList.get(slotIndex);
      slot.dispenseProduct();
   }*/
    //Generate Transaction (AFTER SUCESSFUL TRANSACTION)
    public Transaction generateTransaction(int payment, Item item, int change) {
        Transaction transaction = new Transaction(payment, item, change); //create transaction
        transactionList.add(transaction); //add to list
        return transaction;
    }

    //Clear Transaction List (after restock)
    public void clearTransactionList() {
        transactionList.clear();
    }

    //MAITENANCE METHODS
    //Get total stock in every slot (MAX CAPACITY = 80)
    private int getTotalStock() {
        int totalStock = 0;
        for (Slot slot : slotList) {
            totalStock += slot.getStock();
        }
        return totalStock;
    }

    //If true -> print current stock, update
    //If false -> print error message, do NOT call restockSlot()
    public boolean validRestock(int restockAmount) {
        if (getTotalStock() + restockAmount <= 80) //does not exceed max capacity
        {
            return true;
        }
        return false;
    }
    //Validation for restockAllSlots()
    public boolean validRestockAll(int restockAmount) {
        if (getTotalStock() + (restockAmount * slotList.size()) <= 80) //does not exceed max capacity
        {
            return true;
        }
        return false;
    }

    //Restocking Slots
    public void restockSlot(int slotIndex, int restockAmount) {
        Slot slot = slotList.get(slotIndex); //get slot
        slot.addStock(restockAmount);
    }
    //Restock ALL slots
    public void restockAllSlots(int restockAmount) {
        for (Slot slot : slotList) {
            slot.addStock(restockAmount);
        }
    }

    //Edit product price 
    public void editPrice(int slotIndex, int newPrice) {
        Slot slot = slotList.get(slotIndex);
        slot.editPrice(newPrice);
    }

    //Return all Transactions
    public ArrayList<Transaction> getTransactions() {
        return transactionList;
    }

    //Restock Currency (HAS NO LIMIT)
    public void restockAllCurrency(int restockAmount) {
        for (Currency currency : currencyStock) {
            currency.setQuantity(currency.getQuantity() + restockAmount);
        }
    }
    //Restock specific currency 
    public void restockCurrency(int currencyValue, int restockAmount) {
        for (Currency currency : currencyStock) {
            if (currency.getValue() == currencyValue) {
                currency.setQuantity(currency.getQuantity() + restockAmount);
            }
        }
    }

    // Check if a given currency value is valid
    public boolean isValidCurrencyValue(int currencyValue) {
        int[] validCurrencyValues = {200, 100, 50, 20, 10, 5, 1};
        for (int value : validCurrencyValues) {
            if (currencyValue == value) {
                return true;
            }
        }
        return false;
    }

    //Collect Currency 
    public boolean collectCurrency(int currencyValue, int collectAmount) {
        for (Currency currency : currencyStock) {
            if (currency.getValue() == currencyValue) {
                if (currency.getQuantity() >= collectAmount) {
                    currency.setQuantity(currency.getQuantity() - collectAmount);
                    return true;
                } else {
                    return false; //insufficient quantity
                }
            }
        }
        return false; // Invalid currency value
    }
    //Collect all denominations
    public boolean collectAllCurrency(int collectAmount) {
        for (Currency currency : currencyStock) {
            if (currency.getQuantity() < collectAmount) // check if all currency has enough stock
            {
                return false;
            }
        }
        for (Currency currency : currencyStock) { //update all
            currency.setQuantity(currency.getQuantity() - collectAmount);
        }
        return true;
    }
    //Sales Report, print quantity of each product sold
    //Ex. Yogurt x 5, Mango x 3 etc...
    public ArrayList<String> salesReport() {
        ArrayList<String> salesReport = new ArrayList<>();
        for (Slot slot : slotList) { // loop through all slots
            Product product = slot.getProduct(); // get product in slot
            int quantitySold = 0;
            for (Transaction transaction : transactionList) { // loop through all transactions
                ArrayList<Product> productsInTransaction = transaction.getProducts();
                // Find the quantity of the specific product in the current transaction
                int quantityInTransaction = 0;
                for (Product p : productsInTransaction) {
                    // Compare product names instead of product objects
                    if (p.getName().equals(product.getName())) {
                        quantityInTransaction++;
                    }
                }
                quantitySold += quantityInTransaction; // increment by the quantity in this transaction
            }
            salesReport.add(product.getName() + " x " + quantitySold); // add to sales report
        }
        return salesReport;
    }

    //Calculate TOTAL Sales, Looks at all transactions, [Payment - Change = Profit]
    public int calculateTotalSales() {
        int totalSales = 0;
        for (Transaction transaction : transactionList) {
            totalSales += transaction.getPayment() - transaction.getChange();
        }
        return totalSales;
    }

    //INTIALIZE CURRENCY (Denominations 200 - 1)
    public void initializeCurrencies() {
        int[] values = {200, 100, 50, 20, 10, 5, 1};
        for (int value : values) {
            Currency currency = new Currency(value, 10); //default 10 stock each
            this.currencyStock.add(currency);
        }
    }

    //Return slot
    public Slot getSlot(int slotIndex) {
        return slotList.get(slotIndex);
    }

    //Return All Slots 
    public ArrayList<Slot> getSlotList() {
        return slotList;
    }
    //Return All Currency
    public ArrayList<Currency> getCurrencyStock() {
        return currencyStock;
    }

    //Assign Product to slot
    public void addProduct(Product product, int stock) {
        Slot slot = new Slot(product, stock);
        slotList.add(slot);
    }

    //Find slotIndex by Product name
    public int findSlotIndexByProduct(String name) {
        int slotIndex = -1;
        for (int i = 0; i < getSlotList().size(); i++) {
            Slot slot = getSlotList().get(i);
            if (slot.getProduct().getName().equals(name)) {
                slotIndex = i;
                break;
            }
        }
        return slotIndex;
    }

    //Find slot by Product 
    public Slot findSlotByProduct(Item item) {
        for (Slot slot : slotList) {
            if (slot.getProduct().equals(item)) {
                return slot;
            }
        }
        return null;
    }
}
