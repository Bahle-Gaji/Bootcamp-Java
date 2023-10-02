package com.bahlegaji01.chapter11.Exercise4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings. Print and test
        // your code.
        ArrayList <String> items = new ArrayList();
        items.add("Shirt");
        items.add("Pants");
        items.add("Shoes");
        System.out.println(items);

        // add (insert) another element at a specific index
        items.add(2, "Jacket");
        System.out.println(items);


        // Check for the existence of a specific String element.
        // If it exists, remove it.
        if(items.contains("Jacket")){
            items.remove("Jacket");
        }

        System.out.println(items);

    }

}
