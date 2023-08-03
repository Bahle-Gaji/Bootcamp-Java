package Book2.chapter6;

import java.util.Scanner;

public class CarWashApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Kyoto spa!");
        System.out.print("Please enter your spa day package code: ");

        String s = sc.nextLine();
        s = s.toLowerCase();
        char code = s.charAt(0);
        String details = "";

        switch (code) {
            case 'a':
                details += "\tDay pass, including meals, face masks plus... \n";
            case 'b':
                details += "\tSauna, plus... \n";
            case 'c':
                details += "\tMassage, plus... \n";
            case 'd':
                details += "\tPedicure, plus... \n";
            case 'e':
                details += "\tManicure. \n";
                break;
            default:
                details = "That's not a valid code.";
                break;
        }
        System.out.println("\nYour spa day package includes: ");
        System.out.println(details);
        System.out.println("We hope you enjoy your stay! :)");


    }
}
