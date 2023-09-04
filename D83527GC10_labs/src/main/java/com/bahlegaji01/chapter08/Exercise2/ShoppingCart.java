package com.bahlegaji01.chapter08.Exercise2;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shirt", 1, 14);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        int code = item1.setItemFields("Pants", 4, 15, ' ');
        if (code < 0) {
            System.out.println("Invalid color code");
        } else {
            item1.displayItem();
        }

    }

}
