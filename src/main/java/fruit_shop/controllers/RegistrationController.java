package fruit_shop.controllers;

import fruit_shop.db.Storage;
import fruit_shop.lib.Inject;
import fruit_shop.model.User;
import fruit_shop.service.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationController extends HttpServlet {

    @Inject
    private static UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("login");
        String password = req.getParameter("pwd");
        String repeatPassword = req.getParameter("pwd-repeat");
        if (password.equals(repeatPassword)) {
            Storage.users.add((User) userService);
            //come back at home page

//            User newUser = new User(getServletName());
//
//            newUser.setPassword(req.getParameter("user_password"));
//            newUser.setName(req.getParameter("user_name"));
//            User user = null;
//            try {
//                user = userService.create(newUser);
//            } catch (Exception e) {
//                System.out.println("Can not create new user");
//                req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//            }
//            HttpSession session = req.getSession(true);
//            session.setAttribute("userId", user.getUserId());
            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            req.setAttribute("message",   "Your password are not the same");

            req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req,resp);
        }
    }
}
