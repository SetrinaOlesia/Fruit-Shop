package fruit_shop.service.impl;

import fruit_shop.dao.UserDao;

import fruit_shop.lib.Inject;
import fruit_shop.lib.Service;
import fruit_shop.model.User;
import fruit_shop.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    @Override
    public User create(User user) {

        return userDao.create(user);
    }

    @Override
    public User get(Long userId) {
        return userDao.get(userId).get();
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(Long userId) {
        return userDao.delete(userId);
    }

    @Override
    public boolean delete(User user) {
        return userDao.delete(user);
    }

}
