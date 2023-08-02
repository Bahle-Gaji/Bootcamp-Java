package Book2.chapter3;

import java.text.NumberFormat;

public class MainClass {
    public static void main(String[] args) {
//        int a = 21, b = 6;
//        double answer = (double)a / b; //answer 3.0
//        System.out.println(answer);

//        double x = 29.4, y = 93.5, z = -19.3;
//        System.out.println("round(x) " + Math.round(x));
//        System.out.println("round(y) " + Math.round(y));
//        System.out.println("round(z) " + Math.round(z));
//
//        System.out.println("ceil(x) " + Math.ceil(x));
//        System.out.println("ceil(y) " + Math.ceil(y));
//        System.out.println("ceil(z) " + Math.ceil(z));
//
//        System.out.println("floor(x) " + Math.floor(x));
//        System.out.println("floor(y) " + Math.floor(y));
//        System.out.println("floor(z) " + Math.floor(z));
//
//        System.out.println("rint(x) " + Math.rint(x));
//        System.out.println("rint(y) " + Math.rint(y));
//        System.out.println("rint(z) " + Math.rint(z));

//        double salesTax = 2.425;
//        NumberFormat cf = NumberFormat.getCurrencyInstance();
//        System.out.println(cf.format(salesTax));

        double x = 19923.3288;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        nf.setMinimumFractionDigits(3);
        System.out.println(nf.format(x));

    }
}
