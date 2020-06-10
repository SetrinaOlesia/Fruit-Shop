package fruit_shop.db;

import fruit_shop.model.Order;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.model.User;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static long productId = 0L;
    private static long userId = 0;
    public static final List<Product> products = new ArrayList<>();
    public static final List<ShoppingCart> shoppingCarts = new ArrayList<>();
    public static final List<Order> orders = new ArrayList<>();
    public static final List<User> users = new ArrayList<>();

    public static void addProduct(Product product) {
          product.setId(++productId);
        products.add(product);

    }
    public static void addId(User user) {
        user.setUserId(++userId);
        users.add(user);
    }
}
