package Book2.chapter2;

public class HelloApp {

    public String helloMessage;                 //instance var
    public static String helloMessage2 = "Hi";  //class var

    public static void main(String[] args) {

//        HelloApp h = new HelloApp();            //create instance of class to use instance var
//        h.helloMessage = "Hello Universe!";
//        System.out.println(h.helloMessage);
//
//        helloMessage2 = "Hello World";          //use class var without creating instance
//        System.out.print(helloMessage2);

//        int taxRate = 10;
//        double total = 1000;
//        double subTotal = 100;
//        double taxAmount = 0;
//        if (taxRate > 0){
//            taxAmount = subTotal * taxRate;
//            total = subTotal + total;
//        }
//        System.out.println(taxAmount); //No access, err
//        System.out.println(total);

//        int xInt;
//        long yLong;
//        xInt = 32;
//        yLong = xInt;

        class Ball{
            int speed;
            void setSpeed(int speed){
                this.speed = speed;
            }
        }
        Ball b1 = new Ball();
        Ball b2 = b1;
        b1.setSpeed(50);
        b2.setSpeed(100);
        int speed = b1.speed;
        System.out.println(speed);

        String x = "5";
        int s = Integer.parseInt(x);
        float s1 = Float.parseFloat(x);
        double s2 = Double.parseDouble(x);

        System.out.println(s + " " + s1 + " " + s2);


    }

}
