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

        LinkedList<String> officers2 = (LinkedList<String>) officers.clone();
        officers2.remove(2);
        System.out.println("Shawn should be removed: ");
        System.out.println(officers2);

        officers.clear();
        officers2.clear();

        System.out.println("Now there should be no lists:");
        System.out.println(officers);
        System.out.println(officers2);
    }

}
