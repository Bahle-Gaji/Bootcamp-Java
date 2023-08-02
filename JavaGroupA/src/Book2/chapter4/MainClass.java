package Book2.chapter4;

public class MainClass {
    public static void main(String[] args) {
        int appleCount = 1;
        String msg = "You have " + appleCount + " apple" + ((appleCount > 1 ) ? "s.": "." );
//        System.out.println(msg);
        String ans = "Yes";
        if(ans == "Yes"){
            System.out.println("They are equal");
        }

    }
}
