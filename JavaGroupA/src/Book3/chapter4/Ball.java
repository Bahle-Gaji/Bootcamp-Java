package Book3.chapter4;

public class Ball {
    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public void hit(){
        System.out.println("You hit it a mile!");
    }
}


