package dao.impl;

import dao.OrderDao;
import exception.DataProcessingException;
import model.Order;
import java.util.Optional;

public class OrderDaoImpl implements OrderDao {
    @Override
    public Order create(Order order) throws DataProcessingException {
        return null;
    }

    @Override
    public Optional<Order> get(Long id) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public Order update(Order order) throws DataProcessingException {
        return null;
    }

    @Override
    public void delete(Long id) throws DataProcessingException {

    }

    @Override
    public void delete(Order order) throws DataProcessingException {

    }
}
