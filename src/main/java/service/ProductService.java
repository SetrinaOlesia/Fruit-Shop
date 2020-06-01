package service;

import model.Product;
import java.util.List;


public interface ProductService {
    Product create(Product product);

    Product getById(Long productId);

    List<Product> getAllProducts();

    Product update(Product product);

    boolean deleteById(Long productId);

    boolean delete(Long product);


}
