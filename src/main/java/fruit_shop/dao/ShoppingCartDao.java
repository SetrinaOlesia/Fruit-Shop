package fruit_shop.dao;

import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import java.util.Optional;

public interface ShoppingCartDao {
    ShoppingCart create(ShoppingCart shoppingCart);

    Optional<ShoppingCart> get(Long shoppingCartId);

    ShoppingCart getByUser(Long userId);

    ShoppingCart update(ShoppingCart shoppingCart);

    void delete(Long id);

    boolean delete(ShoppingCart shoppingCart);

    boolean delete(ShoppingCart shoppingCart, Product product);
}
