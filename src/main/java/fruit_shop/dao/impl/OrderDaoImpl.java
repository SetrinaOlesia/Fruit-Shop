package fruit_shop.dao.impl;

import fruit_shop.dao.OrderDao;
import fruit_shop.db.Storage;

import fruit_shop.lib.Dao;
import fruit_shop.model.Order;
import java.util.NoSuchElementException;
import java.util.Optional;
@Dao
public class OrderDaoImpl implements OrderDao {
    @Override

    public Order create(Order order)   {
        Storage.orders.add(order);
        return order;
    }

    @Override
    public Optional<Order> get(Long id)   {
        return Storage.orders.stream().filter(o -> o.getId().equals(id)).findFirst();
    }

    @Override
    public Order update(Order order)   {
        Order updatedOrder = get(order.getId())
                .orElseThrow(() -> new NoSuchElementException("Can not find order for update"));
        updatedOrder.setUserId(order.getUserId());
        updatedOrder.setProducts(order.getProducts());
        return updatedOrder;
    }

    @Override
    public boolean delete(Long id)   {
        return Storage.orders.remove(Storage.orders
                .stream()
                .filter(o -> o.getId().equals(id))
                .findFirst());

    }

    @Override
    public void delete(Order order) {
        Storage.orders.remove(order);
    }
}

