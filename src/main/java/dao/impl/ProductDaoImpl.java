package dao.impl;

import dao.ProductDao;
import lib.Dao;
import model.Product;
import java.util.List;
import java.util.Optional;

@Dao
public class ProductDaoImpl implements ProductDao {
    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public Optional<Product> getById(Long productId) {
        return Optional.empty();
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
