package fruit_shop.dao.impl;

import fruit_shop.dao.ShoppingCartDao;
import fruit_shop.db.Storage;

import fruit_shop.lib.Dao;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import java.util.Optional;
@Dao
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) {
        Storage.shoppingCarts.add(shoppingCart);
        return shoppingCart;
    }

    @Override
    public Optional<ShoppingCart> get( Long shoppingCartId)   {
        return Storage.shoppingCarts.stream()
                .filter(b -> b.getUserId().equals(shoppingCartId))
                .findFirst();
    }

    @Override
    public ShoppingCart getByUser(Long userId)  {
        return Storage.users.stream()
                .filter(u -> u.getUserId().equals(userId))
                .findFirst().get().getShoppingCart();
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart)   {
        ShoppingCart updatedShoppingCart = get(shoppingCart.getId()).get();
        updatedShoppingCart.setProduct(shoppingCart.getProduct());
        return updatedShoppingCart;
    }

    @Override
    public void delete(Long id)   {
        Storage.shoppingCarts.remove(Storage.shoppingCarts
                .stream()
                .filter(b -> b.getId().equals(id))
                .findFirst());
    }

    @Override
    public boolean delete(ShoppingCart shoppingCart)  {

            Storage.shoppingCarts.remove(shoppingCart);

        return false;
    }

    @Override
    public boolean delete(ShoppingCart shoppingCart, Product product)  {
        shoppingCart.getProduct().remove(product);
        return false;
    }
}
