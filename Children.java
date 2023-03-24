package home001;

public class Children extends Product {
    int age;
    boolean hypoallergenic;

    public Children(String name, Double price, Integer quantity, String unit, int age, boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.age = age;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        if (hypoallergenic == true)
        return super.toString() + " " + age + "+ hypoallergenic";
        return super.toString() + " " + age + "+ not hypoallergenic";
        
    }
}
