package fruit_shop.controllers;

import fruit_shop.lib.Injector;

import fruit_shop.model.User;
import fruit_shop.service.UserService;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


   public class UsersController extends HttpServlet {
   private  static final Injector injector = Injector.getInstance("fruit_shop");
   private UserService userService = (UserService) injector.getInstance(UserService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<User> allUsers = userService.getAll();
        req.setAttribute("users", allUsers);
        req.getRequestDispatcher("/WEB-INF/views/users/all.jsp").forward(req,resp);
    }

}
