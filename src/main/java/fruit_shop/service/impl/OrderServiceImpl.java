package fruit_shop.service.impl;

import fruit_shop.dao.OrderDao;
import fruit_shop.db.Storage;

import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.Order;

import fruit_shop.service.OrderService;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Inject
    private OrderDao orderDao;

    @Override
    public Order create(Order order)   {
        return orderDao.create(order);
    }


    @Override
    public Order get(Long id)   {
        return orderDao.get(id).get();
    }


    @Override
    public boolean delete(Long id)   {
        return orderDao.delete(id);
    }

        @Override
    public List<Order> getUserOrders(Long userId)   {
//        return (List<Order>) get(userId);
            return (List<Order>) Storage.orders.get(Math.toIntExact(userId));
    }


    //
    @Override
    public List<Order> getAll() {
        return Storage.orders;
    }
}
