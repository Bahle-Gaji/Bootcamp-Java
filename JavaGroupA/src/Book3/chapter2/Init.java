package Book3.chapter2;

import java.util.Scanner;

public class Init {

    private Scanner sc = new Scanner(System.in);

//    public int x = getX();
    public int x;

    {
        System.out.print("Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("You entered: " + x);
    }

    public Init(){
        System.out.println("in the default");
    }
}
