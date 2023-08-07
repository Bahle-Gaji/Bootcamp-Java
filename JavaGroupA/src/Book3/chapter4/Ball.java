package Book3.chapter4;

public class Ball {
    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public void hit() {
        System.out.println("You hit it a mile!");
    }
    public static void main(String[] args) {
        BaseBall b1 = new BaseBall();
        b1.hit();
    }

}

class BaseBall extends Ball {


    public BaseBall() {
        setWeight(5.125);
    }

    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}


