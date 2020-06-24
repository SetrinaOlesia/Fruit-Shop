package fruit_shop.controllers;



import fruit_shop.exception.AuthenticationException;
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

public class LoginController extends HttpServlet {

    @Inject
    private static UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            User user = userService.login(req.getParameter("user_login"),
                    req.getParameter("user_password"));

            HttpSession session = req.getSession(true);
            session.setAttribute("userId", user.getUserId());

            Cookie cookie = new Cookie("FRUITSHOP", user.getToken());
            resp.addCookie(cookie);
            req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
        } catch (AuthenticationException | DataProcessingException e) {
            req.setAttribute("error", "Incorrect login or password");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        }
    }
}