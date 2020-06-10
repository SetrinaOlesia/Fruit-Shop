package fruit_shop.dao;

import fruit_shop.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    User create(User user) ;

    Optional<User> get(Long id)  ;

    Optional<User> getByToken(String token) ;

    User update(User user) ;

    boolean delete(Long id) ;
    boolean delete(User user) ;

    Optional<User> findByLogin(String login) ;

    List<User> getAll()  ;
}
