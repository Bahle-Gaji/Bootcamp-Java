package Book3.chapter5;

public class BallFactory {
    public static Ball getBall(String b) {
        if (b.equalsIgnoreCase("baseball")) {
            return new Baseball();
        }
        if (b.equalsIgnoreCase("softball")) {
            return new Softball();
        }
        return null;
    }
}
