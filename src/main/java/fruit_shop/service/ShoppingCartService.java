package fruit_shop.service;

import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import java.util.List;

public interface ShoppingCartService {
    ShoppingCart create(ShoppingCart shoppingCart);

    ShoppingCart addProduct(ShoppingCart shoppingCart, Long productId);

    boolean deleteProduct(ShoppingCart shoppingCart, Product product);

    List<Product> clearAllProducts(ShoppingCart shoppingCart); //remove all products from the shoppingCart

    ShoppingCart getByUserId(Long userId);

    boolean delete(ShoppingCart shoppingCart);

    List<Product> getAllProducts(ShoppingCart shoppingCart);

}
