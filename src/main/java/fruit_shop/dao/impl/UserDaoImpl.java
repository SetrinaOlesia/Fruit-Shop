package fruit_shop.dao.impl;

import fruit_shop.dao.UserDao;
import fruit_shop.db.Storage;
import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Dao;
import fruit_shop.model.User;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Dao
public class UserDaoImpl implements UserDao {

    @Override
    public User create(User user) throws DataProcessingException {
        Storage.users.add(user);
        return user;
    }

    @Override
    public Optional<User> get(Long id) throws DataProcessingException {
        return Storage.users.stream()
                .filter(u -> u.getUserId().equals(id)).findFirst();
    }

    @Override
    public Optional<User> getByToken(String token) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public User update(User user) throws DataProcessingException {
        User updatedUser = get(user.getUserId())
                .orElseThrow(() -> new NoSuchElementException("Can't find user to update"));
        updatedUser.setName(user.getName());
        updatedUser.setShoppingCart(user.getShoppingCart());
        updatedUser.setOrderList(user.getOrderList());
        return updatedUser;
    }

    @Override
    public void delete(Long id) throws DataProcessingException {

        Storage.users.remove(Storage.users
                .stream()
                .peek(System.out::println)
                .filter(u -> u.getUserId().equals(id))
                .peek(System.out::println)
                .findFirst()
                .get());
    }

    @Override
    public Optional<User> findByLogin(String login) throws DataProcessingException {
        return Storage.users.stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst();
    }


    @Override
    public List<User> getAll() {
        return Storage.users;
    }
}