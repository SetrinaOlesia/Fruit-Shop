package dao;

import exception.DataProcessingException;
import model.Product;
import model.ShoppingCart;
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
