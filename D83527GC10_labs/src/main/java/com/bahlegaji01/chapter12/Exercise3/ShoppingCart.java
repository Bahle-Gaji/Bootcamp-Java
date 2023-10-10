package com.bahlegaji01.chapter12.Exercise3;

public class ShoppingCart {
    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        Item item = new Shirt(25.00, 'M', 'G');

        // Item item = new Item();

        // call the display method on the object, then the getColor method
        item.display();

        if(item instanceof Shirt){
            String colorName = ((Shirt) item).getColor();
            System.out.println("Item color: " + colorName);
        }
        else{
            System.out.println("This item is not a shirt");
        }

    }
}
