package db;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static long productId = 0L;
    public static final List<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        product.setId(++productId);
        products.add(product);

    }
}
