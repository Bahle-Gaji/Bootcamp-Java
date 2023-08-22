
package com.bahlegaji01.chapter04;

public class Exercise4_2 {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double price = 19.99;
        double tax = 1.2;
        int quantity = 1;
        double total;
        
        // Modify message to include quantity 
        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price * tax * quantity;
        
        System.out.println("The total is: " + total);
    }    
}
