package Book3.chapter1;
import java.text.NumberFormat;

public class OrderApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setQuantityOrdered(60);
        order1.setUnitPrice(6.99);
        double total = order1.getOrderTotal();
        System.out.println("Total for order: " + cf.format(total));

    }
}
