package home001;

public class Egg extends Food {
    int ppp;

    public Egg(String name, Double price, Integer quantity, String unit, String expiry, int ppp) {
        super(name, price, quantity, unit, expiry);
        this.ppp = ppp;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ppp + " pieces per pack";
    }
    
}
