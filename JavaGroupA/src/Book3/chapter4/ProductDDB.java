package Book3.chapter4;

public class ProductDDB {
    public static Product getProduct(String code) {
        Product p;
        try {
            p = new Product("h");
            return p;
        } catch (ProductDataException error) {
            System.out.println(error);
            return new Product();
        }

    }

    public static void main(String[] args) throws ProductDataException {
        Product p = ProductDDB.getProduct("z");
        System.out.println(p);
    }
}

class Product {
    String code;

    public Product() {
        this.code = "a";
    }

    public Product(String code) throws ProductDataException{
        if (code.equalsIgnoreCase("z")) {
            throw new ProductDataException("\"z\" is not accepted anymore");
        }
        this.code = code;
    }

    public String toString(){
        return "Code is: " + this.code;
    }
}