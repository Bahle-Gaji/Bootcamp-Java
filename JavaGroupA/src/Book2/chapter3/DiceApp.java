package Book2.chapter3;

public class DiceApp {
    public static void main(String[] args) {
        int roll;
        String msg = "Here are 100 random rolls of a dice";
        System.out.println(msg);
        for(int i = 0; i < 100; i++){
            roll = randomInt(1,6);
            System.out.print(roll + " ");
        }
    }

    public static int randomInt(int low, int high){
        return (int)(Math.random() * (high - low + 1)) + low;
    }
}
