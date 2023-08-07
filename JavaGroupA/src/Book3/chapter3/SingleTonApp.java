package Book3.chapter3;

public class SingleTonApp {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        if (s1 == s2){
            System.out.println("The objects are the same.");
        }else{
            System.out.println("The objects are not the same.");
        }
    }
}
