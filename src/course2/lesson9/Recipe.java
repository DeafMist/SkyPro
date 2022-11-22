package course2.lesson9;

import course2.lesson9.Product;

import java.util.*;

public class Recipe {
    private final String name;

    private final Map<Product, Integer> products = new HashMap<>();

    private int totalPrice;

    public Recipe(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Дайте имя рецепту!");
        }

        this.name = name;
    }

    public void addProduct(Product product, Integer amount) {
        if (!products.containsKey(product)) {
            if (amount == null || amount < 1) {
                products.put(product, 1);
                amount = 1;
            }
            else {
                products.put(product, amount);
            }

            totalPrice += product.getPrice() * amount;
        }
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
