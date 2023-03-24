package home001;

public class Beverage extends Product {
    double volume;
    
    public Beverage(String name, Double price, Integer quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volume + "l";
    }
}
