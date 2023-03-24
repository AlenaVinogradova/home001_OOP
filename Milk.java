package home001;

public class Milk extends Beverage{
    String expiry;
    double fat;

    public Milk(String name, Double price, Integer quantity, String unit, Double volume, String expiry, double fat) {
        super(name, price, quantity, unit, volume);
        this.expiry = expiry;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + " " + fat + "% fat"+ " (exp. " + expiry + ")";
    }
}
