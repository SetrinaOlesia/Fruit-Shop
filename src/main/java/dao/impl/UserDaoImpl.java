package dao.impl;

import dao.UserDao;
import exception.DataProcessingException;
import model.User;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public User create(User user) throws DataProcessingException {
        return null;
    }

    @Override
    public Optional<User> get(Long id) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public Optional<User> getByToken(String token) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public User update(User user) throws DataProcessingException {
        return null;
    }

    @Override
    public void delete(Long id) throws DataProcessingException {

    }

    @Override
    public Optional<User> findByLogin(String login) throws DataProcessingException {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() throws DataProcessingException {
        return null;
    }
}
