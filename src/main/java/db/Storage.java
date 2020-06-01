package db;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static long productId = 0;
    public static final List<Product> products = new ArrayList<Product>();

    public static void addProduct(Product product) {
        productId++;
        product.setId(productId);
        products.add(product);

    }
}
