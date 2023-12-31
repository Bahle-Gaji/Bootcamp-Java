package com.bahlegaji01.chapter05;

public class Exercise5_3 {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total = tax * price * quantity;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");

        for(String item : items){
            System.out.println("\t" + item);
        }

        System.out.println("Total: R" + total);
    }

}
