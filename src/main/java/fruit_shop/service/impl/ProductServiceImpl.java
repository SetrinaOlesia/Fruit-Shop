package fruit_shop.service.impl;
import fruit_shop.dao.ProductDao;

import fruit_shop.db.Storage;
import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.Product;
import fruit_shop.service.ProductService;
import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDao productDao;

    @Override
    public Product create(Product product) {
        product.setName(product.getName().toUpperCase());

        return productDao.create(product);
    }

    @Override
    public Optional<Product> getById(Long productId) {
        return productDao.getById(productId);
    }

    @Override
    public Product get(Long id) {
        return productDao.getById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public Product update(Product product) {
        return  productDao.update(product);
    }

    @Override
    public boolean deleteById(Long productId) {
        return  productDao.delete(productId);
    }

    @Override
    public boolean delete(Long product) {
        return productDao.delete(product);
    }
}
