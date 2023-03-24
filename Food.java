package home001;

public class Food extends Product{
    String expiry;
    
    public Food(String name, Double price, Integer quantity, String unit, String expiry) {
        super(name, price, quantity, unit);
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return super.toString() + " (exp. " + expiry + ")";
    }
}
