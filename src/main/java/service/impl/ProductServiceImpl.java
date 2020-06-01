package service.impl;
import dao.ProductDao;
import lib.Inject;
import lib.Service;
import model.Product;
import service.ProductService;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDao productDao;

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Product getById(Long productId) {
        return null;
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
