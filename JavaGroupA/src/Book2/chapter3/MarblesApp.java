package Book2.chapter3;

import java.util.Scanner;

public class MarblesApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the marble divvy-upper.");

        System.out.println("Number of marbles: ");
        int numMarbles = sc.nextInt();

        System.out.println("Number of children: ");
        int numChildren = sc.nextInt();

        int marblesEach = numMarbles / numChildren;
        int marblesLeft = numMarbles % numChildren;

        System.out.println("Give each child " + marblesEach + " marbles.");
        System.out.println("You will have " + marblesLeft + " marbles left over.");
    }
}
