package com.bahlegaji01.chapter05;

public class Exercise5_2 {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        // Declare and initialize the items String array
        String[] items = new String[4];
        items[0] = "Shirt";
        items[1] = "Jacket";
        items[2] = "Blazer";
        items[3] = "Hat";

        // Change message to show the number of items purchased.
        message = custName + " wants to purchase " + items.length + " items.";

        System.out.println(message);
        // Print an element from the items array.
        System.out.println(items[2]);

    }

}