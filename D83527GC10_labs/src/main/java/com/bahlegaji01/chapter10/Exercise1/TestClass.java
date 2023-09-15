
package com.bahlegaji01.chapter10.Exercise1;


public class TestClass {

    public static void main(String args[]) {
        int x = 4, y = 9;
//        if (y / x < 3) {
//            x += y;
//        } else {
//            x *= y;
//        }
        
        
         // Use a ternary operator to perform the same logic as above.
         x = (y / x < 3) ? +y : x * y;
         System.out.println("After if stmt, x = " + x);
    }
}
