package com.bahlegaji01.chapter06;

/**
 * 
 * @author Bahle
 * 
 */

// Exercise 6-2
public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        item1.desc = "Shirt";

        Item item2 = new Item();
        item2.desc = "Trousers";

        // Print both item descriptions and run code.
        System.out.println("Item1 : " + item1.desc);
        System.out.println("Item2 : " + item2.desc);

        // Assign one item to another and run it again.
        item2 = item1;


    }

}
