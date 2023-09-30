
package com.bahlegaji01.chapter11.Exercise2;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.

        // Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
            System.out.println("Please enter name and surname.");
        } else {
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println("Name: " + name + " Age: " + age);
        }

        

    }
}
