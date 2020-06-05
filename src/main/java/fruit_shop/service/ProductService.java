package fruit_shop.service;

import fruit_shop.model.Product;
import java.util.List;
import java.util.Optional;


public interface ProductService {
    Product create(Product product);

    Optional<Product> getById(Long productId);

    List<Product> getAllProducts();

    Product update(Product product);

    boolean deleteById(Long productId);

    boolean delete(Long product);


}
