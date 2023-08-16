package Book4.chapter2;

import java.util.Scanner;

public class Arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //    String names[];
        //    String[] names = new String[10];  //proper array declaration variations
        System.out.print("How many players? ");

        int count = sc.nextInt();
        String[] players = new String[count];
        System.out.println("There are " + players.length + " players.");

    }
}


