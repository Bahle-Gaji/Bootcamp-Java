package Book3.chapter4;

public class Ball2 {
    public double weight;
    public double diameter;
    public Ball2(double weight) {
        this.weight = weight;
        this.diameter = 6;
        System.out.println("Hello from the Ball2 constructor 1.");
    }
    public Ball2(double weight, double diameter) {
        this.weight = weight;
        this.diameter = diameter;
        System.out.println("Hello from the Ball2 constructor 2.");
    }

    public Ball2() {
        this.weight = 5;
        this.diameter = 5;
        System.out.println("Hello from Ball2 constructor 3.");
    }

    public String toString(){
        return "Baseball weight: " + weight + " and diameter: " + diameter + "\n";
    }

    public static void main(String[] args) {
        BaseBall2  b1 = new BaseBall2(7.65);
        System.out.println(b1);

        SoftBall b2 = new SoftBall(5.7, 8.6);
        System.out.println(b2);
    }
}

class BaseBall2 extends Ball2 {
    public BaseBall2(double weight){
        super(weight);
        System.out.println("I am in the BaseBall2 constructor 1.");
    }

    public BaseBall2(double weight, double diameter){
        super(weight, diameter);
        System.out.println("I am in the BaseBall2 constructor 2.");
    }

    public BaseBall2(){
        super();
        System.out.println("I am in the BaseBall2 constructor 3.");
    }
}

class SoftBall extends Ball2 {
    public SoftBall(double weight){
        super(weight);
        System.out.println("I am in the SoftBall constructor 1.");
    }

    public SoftBall(double weight, double diameter){
        super(weight, diameter);
        System.out.println("I am in the SoftBall constructor 2.");
    }

    public SoftBall(){
        super();
        System.out.println("I am in the SoftBall constructor 3.");
    }
}
