package home001;

public class Bread extends Food {
    String flour;

    public Bread(String name, Double price, Integer quantity, String unit, String expiry, String flour) {
        super(name, price, quantity, unit, expiry);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() + " " + flour + " flour";
    }
}
