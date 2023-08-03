package Book2.chapter7;

import java.util.Scanner;

public class GuessingGameMethod2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    static void playARound() {
        int number, guess;
        //Pick a random number
        number = getRandomNumber();

        //Get the guess
        System.out.println("\nI'm thinking of a number between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();

        //Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("Oh man, that's wrong. The right number was " + number);
        }
    }

    static int getRandomNumber() {
        return (int) (Math.random() * 10)+ 1;
    }

    static int getGuess() {
        do {
            int guess = sc.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.print("Guess again: ");
                sc.nextLine();

            } else {
                return guess;
            }
        } while (true);

    }

//    public static boolean askForAnotherRound() {
//        while (true) {
//            String answer;
//            System.out.print("\nPlay again? (Y or N) ");
//            answer = sc.nextLine();
//
//            if (answer.equalsIgnoreCase("Y")) {
//                return true;
//            } else if (answer.equalsIgnoreCase("N")) {
//                return false;
//            }
//        }
//    }

    public static boolean askForAnotherRound() {
            System.out.print("\nPlay again? (Y or N): ");
        do {
            String answer = sc.next();

            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.print("Please answer Yes (Y) or No (N): ");
            }
        } while (true);
    }
}
