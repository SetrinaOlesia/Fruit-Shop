package fruit_shop.service;

import fruit_shop.model.Order;

import java.util.List;

public interface OrderService {

    public Order create(Order order) ;


    Order get(Long id)  ;


    boolean delete(Long id)  ;

    List<Order> getAll();

    List<Order> getUserOrders(Long userId)  ;


}
