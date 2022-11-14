package course2.lesson8;

import java.util.HashSet;
import java.util.Set;

public class ProductsList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Продукт с таким именем уже есть в списке!");
        }

        products.add(product);
    }

    public void buyProduct(Product product) {
        product.setBought(true);
    }

    public void removeProduct(Product product) {
        products.removeIf(product::equals);
    }

    public Set<Product> getProducts() {
        return products;
    }
}
