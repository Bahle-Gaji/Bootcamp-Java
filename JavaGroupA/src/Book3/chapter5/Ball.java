package Book3.chapter5;
public abstract class Ball {
    public abstract void hit(int batSpeed);

    public static void main(String[] args) {
        BallFactory bf = new BallFactory();
        Ball b1 = bf.getBall("softball");
        Ball b2 = bf.getBall("baseball");
        b1.hit(50);
        b2.hit(30);
    }
}

class Baseball extends Ball {
    public void hit(int batSpeed){
        System.out.println("Baseball is going at speed of: " + batSpeed);
    }
}

class Softball extends Ball {
    public void hit(int batSpeed){
        System.out.println("Softball is going at speed of: " + batSpeed);
    }
}