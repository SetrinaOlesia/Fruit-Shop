package fruit_shop.dao.impl;

import fruit_shop.dao.UserDao;
import fruit_shop.db.Storage;

import fruit_shop.lib.Dao;
import fruit_shop.model.User;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Dao
public class UserDaoImpl implements UserDao {

    @Override
    public User create(User user)  {
//        Storage.users.add(user);
//        return user;
        Storage.addId(user);
        return user;
    }

    @Override
    public Optional<User> get(Long id)  {
        return Storage.users.stream()
                .filter(u -> u.getUserId().equals(id)).findFirst();
    }

    @Override
    public Optional<User> getByToken(String token)   {
        return Optional.empty();
    }

    @Override
    public User update(User user)  {
        User updatedUser = get(user.getUserId())
                .orElseThrow(() -> new NoSuchElementException("Can't find user to update"));
        updatedUser.setName(user.getName());
        updatedUser.setShoppingCart(user.getShoppingCart());
        updatedUser.setOrderList(user.getOrderList());
        return updatedUser;
    }

    @Override
    public boolean delete(Long id)  {

        return Storage.users.remove(Storage.users
                .stream()
                .filter(u -> u.getUserId().equals(id))
                .findFirst()
                .get());

    }

    @Override
    public boolean delete(User user) {
        return Storage.users.remove(Storage.users
                .stream()
                .peek(System.out::println)
                .filter(u -> u.getName().equals(user.getName()))
                .peek(System.out::println)
                .findFirst()
                .get());
    }

    @Override
    public Optional<User> findByLogin(String login)   {
        return Storage.users.stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst();
    }


    @Override
    public List<User> getAll() {
        return Storage.users;
    }
}