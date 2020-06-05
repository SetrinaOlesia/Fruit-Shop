package fruit_shop.dao;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.model.Order;
import java.util.Optional;

public interface OrderDao {

    Order create(Order order) throws DataProcessingException;

    Optional<Order> get(Long id) throws DataProcessingException;

    Order update(Order order) throws DataProcessingException;

    void delete(Long id) throws DataProcessingException;

    void delete(Order order) throws DataProcessingException;
}
