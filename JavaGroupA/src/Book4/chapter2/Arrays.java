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

        /* Initializing arrays */
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";       //adding elements one at a time

        String[] days2 = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};     //adding all the elements at once

    }
}


