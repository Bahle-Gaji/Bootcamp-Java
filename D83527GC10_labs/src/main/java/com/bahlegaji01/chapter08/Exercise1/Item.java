/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bahlegaji01.chapter08.Exercise1;

/**
 *
 * @author bahle
 */
public class Item {

    char color;

    // declare and code the setColor method
    public boolean setColor(char crctr) {
        if (crctr == ' '){
            this.color = crctr;
            return true;
        } else {
            return false;
        }
    }

}
