package home001;

public class Paper extends Hygiene {
    int layer;

    public Paper(String name, Double price, Integer quantity, String unit, int ppp, int layer) {
        super(name, price, quantity, unit, ppp);
        this.layer = layer;
    }

    @Override
    public String toString() {
        return super.toString() + " " + layer + " layers";
    }
}
