package fruit_shop.dao;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import java.util.Optional;

public interface ShoppingCartDao {
    ShoppingCart create(ShoppingCart shoppingCart) throws DataProcessingException;

    Optional<ShoppingCart> get(Long shoppingCartId) throws DataProcessingException;

    ShoppingCart getByUser(Long userId) throws DataProcessingException;

    ShoppingCart update(ShoppingCart shoppingCart) throws DataProcessingException;

    void delete(Long id) throws DataProcessingException;

    void delete(ShoppingCart shoppingCart) throws DataProcessingException;

    void delete(ShoppingCart shoppingCart, Product product) throws DataProcessingException;
}
