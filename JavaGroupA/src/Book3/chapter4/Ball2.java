package Book3.chapter4;

public class Ball2 {
    public double weight;
    public double diameter;
    public Ball2(double weight) {
        this.weight = weight;
        this.diameter = 6;
        System.out.println("Hello from the Ball2 constructor 1.\n");
    }
    public Ball2(double weight, double diameter) {
        this.weight = weight;
        this.diameter = diameter;
        System.out.println("Hello from the Ball2 constructor 2.\n");
    }

    public Ball2() {
        this.weight = 5;
        this.diameter = 5;
        System.out.println("Hello from Ball2 default constructor.\n");
    }


    public String toString(){
        return "Baseball weight: " + weight + " and diameter: " + diameter + "\n";
    }

    public static void main(String[] args) {
        BaseBall2  b1 = new BaseBall2(7.65);
        System.out.println(b1);
        b1.hit(b1);

        Ball2 b2 = new BaseBall2();
        b1.hit((BaseBall2) b2);
//
//        SoftBall sft1 = new SoftBall(5.7, 8.6);
//        System.out.println(sft1);
    }
}
class BaseBall2 extends Ball2 {
    public BaseBall2(double weight){
        super(weight);
        System.out.println("I am in the BaseBall2 constructor 1.\n");
    }

    public BaseBall2(double weight, double diameter){
        super(weight, diameter);
        System.out.println("I am in the BaseBall2 constructor 2.\n");
    }

    public BaseBall2(){
        super();
        System.out.println("I am in the BaseBall2 default constructor.\n");
    }

    public void hit(BaseBall2 b){
        System.out.println("I have hit the BaseBall.\n");
    }
}

class SoftBall extends Ball2 {
    public SoftBall(double weight){
        super(weight);
        System.out.println("I am in the SoftBall constructor 1.\n");
    }

    public SoftBall(double weight, double diameter){
        super(weight, diameter);
        System.out.println("I am in the SoftBall constructor 2.\n");
    }

    public SoftBall(){
        super();
        System.out.println("I am in the SoftBall default constructor.\n");
    }
}
