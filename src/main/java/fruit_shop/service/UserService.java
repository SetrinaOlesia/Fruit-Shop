package fruit_shop.service;


import fruit_shop.model.User;
import java.util.List;

public interface UserService {
    User create(User user) ;

    User get(Long id) ;

    List<User> getAll()  ;

    User update(User user);

    boolean delete(Long id) ;
    boolean delete(User user) ;
}
