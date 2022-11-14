package course2.lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Recipe {
    private static final Set<String> BUZY_NAMES = new HashSet<>();

    private final String name;

    private final Product[] products;

    private int totalPrice;

    public Recipe(String name, Product... products) {
        if (name == null || products.length == 0) {
            throw new IllegalArgumentException("Заполните карточку рецепта полностью!");
        }

        if (!BUZY_NAMES.contains(name)) {
            BUZY_NAMES.add(name);
        }
        else {
            throw new IllegalArgumentException("Рецепт с таким именем уже есть!");
        }

        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
