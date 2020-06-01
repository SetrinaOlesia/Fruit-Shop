package service.impl;
import dao.ProductDao;
import factory.Factory;
import lib.Inject;
import lib.Service;
import model.Product;
import service.ProductService;
import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDao productDao = Factory.getProductDao();

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Optional<Product> getById(Long productId) {
        return productDao.getById(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
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
    public boolean delete(Long product) {
        return false;
    }
}
