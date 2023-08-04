package Book3.chapter1;

public class PayApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.health = 10;
        System.out.println("Player 1 has " + p1.health + " health.");

        p1.setHealth(4);
        System.out.println("Now Player 1 has " + p1.health + " health.\n");

        Player p2 = new Player();
        p2.health = 7;
        System.out.println("Player 2 has " + p2.health + " health.");

        p2.setHealth(96);
        System.out.println("Now Player 2 has " + p2.health + " health.");

    }
}
