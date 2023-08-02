package Book2.chapter3;

import java.text.NumberFormat;

public class NumberFormatClassApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 100;
        System.out.println("My allowance: " + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 54.99;
        System.out.println("Paint Ball Gun: " + cf.format(costOfPaintBallGun));
    }
}
