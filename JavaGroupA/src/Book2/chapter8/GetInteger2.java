package Book2.chapter8;
import java.util.*;

public class GetInteger2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = getInteger();
        System.out.println("You entered " + i);
    }

    static int getInteger() {
        while(!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("That is not an integer. Try again: ");
        }
        return sc.nextInt();
    }
}
