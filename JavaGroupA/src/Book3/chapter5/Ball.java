package Book3.chapter5;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    public static void main(String[] args) {
        Ball b = new Baseball();
        System.out.println(b.hit(50));
    }
}

class Baseball extends Ball {
    public int hit(int batSpeed){
        return batSpeed * 100;
    }
}