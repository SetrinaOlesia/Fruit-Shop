package fruit_shop.controllers;

import fruit_shop.db.Storage;
import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Inject;
import fruit_shop.model.User;
import fruit_shop.service.UserService;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;

public class RegistrationController extends HttpServlet {

    @Inject
    private static UserService userService;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RegistrationController.class));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
    }

//    @Override - на этапе академии правильно решение без логгера
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        String login = req.getParameter("login");
//        String password = req.getParameter("pwd");
//        String repeatPassword = req.getParameter("pwd-repeat");
//        if (password.equals(repeatPassword)) {
//            Storage.users.add((User) userService);
//
//                resp.sendRedirect(req.getContextPath() + "/");
//        } else {
//            req.setAttribute("message",   "Your password are not the same");
//
//            req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req,resp);
//        }
//    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        User newUser = new User();
        newUser.setLogin(req.getParameter("login"));
        newUser.setPassword(req.getParameter("pwd"));
               newUser.setName(req.getParameter("name"));
        User user = null;
        user = userService.create(newUser);

        HttpSession session = req.getSession(true);
        session.setAttribute("userId", user.getUserId());
        String token = user.getToken();
        user.setToken(token);

        Cookie cookie = new Cookie("FRUITSHOP", token);
        resp.addCookie(cookie);
        resp.sendRedirect(req.getContextPath() + "/users/all");
    }
}
