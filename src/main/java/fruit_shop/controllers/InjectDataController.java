package fruit_shop.controllers;

import fruit_shop.lib.Injector;
import fruit_shop.model.User;
import fruit_shop.service.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InjectDataController extends HttpServlet {

    private  static final Injector injector = Injector.getInstance("fruit_shop");
    private UserService userService = (UserService) injector.getInstance(UserService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        User alex = new User("alex");
        User max = new User("max");
        User tim = new User("tim");
        User vova = new User("vova");
        userService.create(max);
        userService.create(tim);
        userService.create(vova);
        userService.create(alex);

        req.getRequestDispatcher("/WEB-INF/views/injectData.jsp").forward(req,resp);
    }
}
