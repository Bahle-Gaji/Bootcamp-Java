package Book3.chapter1;

public class Order {
    private double unitPrice;
    private double quantityOrdered;

//    public Order(double u, double p){
//        unitPrice = u;
//        quantityOrdered = p;
//    }
//
//    public Order(){
//        unitPrice = u;
//        quantityOrdered = 0;
//    }

    public double getOrderTotal() {
        return unitPrice * quantityOrdered;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

}
