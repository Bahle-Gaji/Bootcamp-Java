package Book2.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = getInteger();
        System.out.println("You entered " + i);
    }

    static int getInteger() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("That is not an integer. Try again: ");
            }
        }
    }
}
