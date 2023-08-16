package Book4.chapter2;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for(int i : lotto){
            lotto[i] = (int)Math.floor(Math.random() * 10) + 1;
        }

        Arrays.sort(lotto);

        System.out.println("Enter a lucky number between 1 and 10: ");
        int lucky = sc.nextInt();
        int foundAt = Arrays.binarySearch(lotto, lucky);
        if(foundAt < -1){
            System.out.println("My number came up!");
        }else{
            System.out.println("I'm not lucky today.");
        }
    }
}
