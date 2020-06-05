package fruit_shop.dao.impl;

import fruit_shop.dao.ProductDao;
import fruit_shop.db.Storage;
import fruit_shop.lib.Dao;
import fruit_shop.model.Product;
import java.util.List;
import java.util.Optional;

@Dao
public class ProductDaoImpl implements ProductDao {

    @Override
    public Product create(Product product) {
        Storage.addProduct(product);
        return product;
    }

    @Override
    public Optional<Product> getById(Long productId) {
        List<Product> list = Storage.products;
        return list.stream().filter(x -> x.getId() == productId).findFirst();
    }

    @Override
    public Product update(Product product) {
         Product  updatedProduct= getById(product.getId()).get();
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        return updatedProduct;
    }

    @Override
    public boolean delete(Long productId) {
        return  Storage.products.remove(Storage.products
                .stream()
                .filter(i -> i.getId().equals(productId))
                .findFirst()
                .get());

    }
    @Override
    public boolean delete(Product product) {
        return   Storage.products.remove(Storage.products
                .stream()
                .filter(i -> i.getId().equals(product))
                .findFirst()
                .get());
    }

    @Override
    public List<Product> getAllProducts() {
        return Storage.products;
    }


}
