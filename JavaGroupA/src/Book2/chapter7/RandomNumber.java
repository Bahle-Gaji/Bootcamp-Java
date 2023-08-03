package Book2.chapter7;

public class RandomNumber {
    public static void main(String[] args) {
        int num = getRandomNumber();
        System.out.println("Random number is: " + num);

    }

//    public static int getRandomNumber(){
//        return (int) (Math.random() * 10) + 1;
//    }

    public static int getRandomNumber(){
        int num = (int)(Math.random() * 20) + 1;
        if(num != 12){
            return num;
        }
        else{
            return 0;
        }
    }
}
