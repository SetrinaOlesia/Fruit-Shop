package fruit_shop.service.impl;

import fruit_shop.dao.ShoppingCartDao;
import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Inject
    private ShoppingCartDao shoppingCartDao;

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
