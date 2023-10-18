package Book4.chapter4;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> officers = new LinkedList<String>();

        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        officers.set(2, "Shawn@3rdPlace");
        System.out.println("Houlihan Should be replaced:");
        System.out.println(officers);
//        for(String s : officers){
//            System.out.println(s);
//        }

    }

}
