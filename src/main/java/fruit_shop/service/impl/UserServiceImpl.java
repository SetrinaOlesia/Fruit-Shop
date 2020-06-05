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
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
