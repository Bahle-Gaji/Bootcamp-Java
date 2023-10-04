package com.bahlegaji01.chapter12.Exercise1;

public class Shirt extends Item {
    private String size;
    private char colorCode;

    public Shirt(double price, String size, char colorCode){
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
}
