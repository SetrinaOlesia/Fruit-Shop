package dao.impl;

import dao.ShoppingCartDao;
import exception.DataProcessingException;
import model.Product;
import model.ShoppingCart;
import java.util.Optional;

public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Override
    public ShoppingCart create(ShoppingCart bucket) throws DataProcessingException {
        return null;
    }

    @Override
    public Optional<ShoppingCart> get(Long bucketId) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public ShoppingCart getByUser(Long userId) throws DataProcessingException {
        return null;
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) throws DataProcessingException {
        return null;
    }

    @Override
    public void delete(Long id) throws DataProcessingException {

    }

    @Override
    public void delete(ShoppingCart shoppingCart) throws DataProcessingException {

    }

    @Override
    public void delete(ShoppingCart shoppingCart, Product product) throws DataProcessingException {

    }
}
