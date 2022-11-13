package course2.lesson8;

import java.util.Objects;

public class Product {
    private final String name;

    private final Double price;

    private final Double amount;

    private boolean isBought = false;

    public Product(String name, Double price, Double amount) {
        if (name == null || price == null || amount == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }

        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return amount;
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
        return isBought == product.isBought && name.equals(product.name) && price.equals(product.price) && amount.equals(product.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount, isBought);
    }

    @Override
    public String toString() {
        return "Product{" + name + ", isBought=" + isBought + "}";
    }
}
