package home001;
/* 1. Название
2. Цена
3. Количество
4. Единица измерения */
public class Product {
    String name;
    Double price;
    Integer quantity;
    String unit;

    public Product(String name, Double price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    

    @Override
    public String toString() {
        return name + " costs " + price + "$ per " + quantity + unit;
    }
}
