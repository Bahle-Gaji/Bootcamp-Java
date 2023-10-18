/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bahlegaji01.chapter14;

/**
 *
 * @author bahle
 */
public class ShoppingCart {
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        
        // Add exception handling to catch ArithmeticException
        try{
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: " + divResult);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }        
    }
}