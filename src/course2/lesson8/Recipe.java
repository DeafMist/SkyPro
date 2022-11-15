package course2.lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;

    private final Set<Product> products = new HashSet<>();

    private int totalPrice;

    public Recipe(String name, Product... products) {
        if (name == null || products.length == 0) {
            throw new IllegalArgumentException("Заполните карточку рецепта полностью!");
        }

        for (Product product : products) {
            totalPrice += product.getPrice();
            this.products.add(product);
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
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
}
