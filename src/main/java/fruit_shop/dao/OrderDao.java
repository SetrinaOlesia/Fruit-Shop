package fruit_shop.dao;

import fruit_shop.model.Order;
import java.util.Optional;

public interface OrderDao {

    Order create(Order order);

    Optional<Order> get(Long id);

    Order update(Order order);

    boolean delete(Long id);

    void delete(Order order);
}
