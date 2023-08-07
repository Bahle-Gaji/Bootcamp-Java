package Book3.chapter4;

public class BaseBall extends Ball {

    public static void main(String[] args) {
        BaseBall b1 = new BaseBall();
        b1.hit();
    }
    public BaseBall() {
        setWeight(5.125);
    }

    public void hit(){
        System.out.println("You tore the cover off!");
        super.hit();
    }
}
