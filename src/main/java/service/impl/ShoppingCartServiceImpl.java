package service.impl;

import model.Product;
import model.ShoppingCart;
import service.ShoppingCartService;

public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public ShoppingCart addProduct(ShoppingCart shoppingCart, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(ShoppingCart shoppingCart, Product product) {
        return false;
    }

    @Override
    public void clear(ShoppingCart shoppingCart) {

    }

    @Override
    public ShoppingCart getByUserId(Long userId) {
        return null;
    }

    @Override
    public boolean delete(ShoppingCart shoppingCart) {
        return false;
    }
}
