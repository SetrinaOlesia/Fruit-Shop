package fruit_shop.dao.impl;

import fruit_shop.dao.ShoppingCartDao;
import fruit_shop.db.Storage;
import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Dao;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import java.util.Optional;
@Dao
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) throws DataProcessingException {
        Storage.shoppingCarts.add(shoppingCart);
        return shoppingCart;
    }

    @Override
    public Optional<ShoppingCart> get( Long shoppingCartId) throws DataProcessingException {
        return Storage.shoppingCarts.stream()
                .filter(b -> b.getUserId().equals(shoppingCartId))
                .findFirst();
    }

    @Override
    public ShoppingCart getByUser(Long userId) throws DataProcessingException {
        return Storage.users.stream()
                .filter(u -> u.getUserId().equals(userId))
                .findFirst().get().getShoppingCart();
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) throws DataProcessingException {
        ShoppingCart updatedShoppingCart = get(shoppingCart.getId()).get();
        updatedShoppingCart.setProduct(shoppingCart.getProduct());
        return updatedShoppingCart;
    }

    @Override
    public void delete(Long id) throws DataProcessingException {
        Storage.shoppingCarts.remove(Storage.shoppingCarts
                .stream()
                .filter(b -> b.getId().equals(id))
                .findFirst());
    }

    @Override
    public void delete(ShoppingCart shoppingCart) throws DataProcessingException {

            Storage.shoppingCarts.remove(shoppingCart);

    }

    @Override
    public void delete(ShoppingCart shoppingCart, Product product) throws DataProcessingException {
        shoppingCart.getProduct().remove(product);
    }
}
