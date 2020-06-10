package fruit_shop.service.impl;

import fruit_shop.dao.ProductDao;
import fruit_shop.dao.ShoppingCartDao;

import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.ShoppingCartService;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Inject
    private ShoppingCartDao shoppingCartDao;
    @Inject
    private static ProductDao productDao;

    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) {
        return shoppingCartDao.create(shoppingCart);
    }

    @Override
    public ShoppingCart addProduct(ShoppingCart shoppingCart, Long productId) {
        Product product = productDao.getById(productId).get();
        shoppingCart.getProduct().add(product);
        return shoppingCartDao.update(shoppingCart);
    }

    @Override
    public boolean deleteProduct(ShoppingCart shoppingCart, Product product) {
        return shoppingCartDao.delete(shoppingCart, product);


    }

    @Override
    public List<Product> clearAllProducts(ShoppingCart shoppingCart) {
        return shoppingCart.getProduct();
    }

    @Override
    public ShoppingCart getByUserId(Long userId) {
        return shoppingCartDao.getByUser(userId);
    }

    @Override
    public boolean delete(ShoppingCart shoppingCart) {
        return shoppingCartDao.delete(shoppingCart);
    }
}
