package Book2.chapter2;

public class EnumTest2 {
    public enum BikeMake {YAMAHA, INDIAN, KAWASAKI, BMW, HONDA}

    public static void main(String[] args) {
        BikeMake bike1;
        bike1 = BikeMake.YAMAHA;
        System.out.println("The bike make is " + bike1);
    }
}
