package dao.impl;

import dao.ProductDao;
import db.Storage;
import lib.Dao;
import model.Product;
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
        return null;
    }

    @Override
    public boolean deleteById(Long productId) {
        return false;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }


}
