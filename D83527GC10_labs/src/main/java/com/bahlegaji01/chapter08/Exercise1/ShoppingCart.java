/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bahlegaji01.chapter08.Exercise1;

/**
 *
 * @author bahle
 */
public class ShoppingCart {
    public static void main(String[] args) {

        Item item1 = new Item();

        if (item1.setColor('B')) {
            System.out.println("Color code: " + item1.color);
        }else{
            System.out.println("Invalid color");
        }
    }

}
