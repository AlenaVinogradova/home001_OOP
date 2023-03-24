package home001;

public class Diapers extends Children{
    int size;
    int minWeight;
    int maxWeight;
    String type;

    public Diapers(String name, Double price, Integer quantity, String unit, int age, boolean hypoallergenic, 
        int size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, age, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + type + " size: " + size + " (" + minWeight + "-" + maxWeight + "kg)";
    }
}
