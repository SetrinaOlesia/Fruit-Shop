package fruit_shop.dao;

import fruit_shop.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductDao {
    Product create(Product product);

    Optional<Product> getById(Long id);

    Product update(Product product);

    boolean delete(Long id);

    boolean delete(Product product);

    List<Product> getAllProducts();
}
