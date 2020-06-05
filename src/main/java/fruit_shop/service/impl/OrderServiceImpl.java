package fruit_shop.service.impl;

import fruit_shop.dao.OrderDao;
import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.Order;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.OrderService;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Inject
    private OrderDao orderDao;

    @Override
    public Order completeOrder(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public List<Order> getUserOrders(Long userId) {
        return null;
    }

    @Override
    public Order get(Long id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
