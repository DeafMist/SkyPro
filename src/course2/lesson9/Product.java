package course2.lesson9;

import java.util.Objects;

public class Product {
    private final String name;

    private final Double price;

    private boolean isBought = false;

    public Product(String name, Double price) {
        if (name == null || price == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        if (isBought || !bought) {
            return;
        }

        isBought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
