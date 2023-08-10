package Book3.chapter5;

public class TestBalls implements PlayableBall {

    public static void main(String[] args) {
        TestBalls t = new TestBalls();
        t.throwBall();
        t.kickBall();
        t.catchBall();
        t.dropBall();
    }

    @Override
    public void throwBall() {
        System.out.println("Throwing ball");
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking ball");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching ball");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping ball");
    }
}
