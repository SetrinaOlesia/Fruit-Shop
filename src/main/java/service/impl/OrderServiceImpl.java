package service.impl;

import model.Order;
import model.ShoppingCart;
import service.OrderService;
import java.util.List;

public class OrderServiceImpl implements OrderService {
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