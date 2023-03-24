package home001;

public class Hygiene extends Product {
    int ppp;

    public Hygiene(String name, Double price, Integer quantity, String unit, int ppp) {
        super(name, price, quantity, unit);
        this.ppp = ppp;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ppp + " pieces per pack";
    }
}
