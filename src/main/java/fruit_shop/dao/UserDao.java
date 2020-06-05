package fruit_shop.dao;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    User create(User user) throws DataProcessingException;

    Optional<User> get(Long id) throws DataProcessingException;

    Optional<User> getByToken(String token) throws DataProcessingException;

    User update(User user) throws DataProcessingException;

    void delete(Long id) throws DataProcessingException;

    Optional<User> findByLogin(String login) throws DataProcessingException;

    List<User> getAll() throws DataProcessingException;
}
