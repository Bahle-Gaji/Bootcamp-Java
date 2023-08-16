package Book4.chapter1;

import java.util.Scanner;

public class StringBuilderApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int vowelCount = 0;

        for(int i = 0; i < s.length(); i++){
//            char c = s.toLowerCase().charAt(i);
            char c = Character.toLowerCase(sb.charAt(i));
            if(

                    (c == 'a') || (c == 'e') ||

                    (c == 'i') || (c == 'o') || (c == 'u')
            ){
                vowelCount++;
                sb.setCharAt(i, '*');
            }
        }

        System.out.println("There are " + vowelCount + " vowels changed.");
        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());


    }
}
