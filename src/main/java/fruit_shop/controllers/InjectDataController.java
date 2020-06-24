package fruit_shop.controllers;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Inject;
import fruit_shop.lib.Injector;
import fruit_shop.model.Product;
import fruit_shop.model.User;
import fruit_shop.service.ProductService;
import fruit_shop.service.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class InjectDataController extends HttpServlet {
    private static final Logger lOGGER = Logger.getLogger(InjectDataController.class);

    @Inject
    private static UserService userService;

    @Inject
    private static ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        User user = new User();
        user.setName("Ned");
        user.setLogin("USER");
        user.setPassword("1");
//        try {
//            userService.create(user);
//        } catch (DataProcessingException e) {
//            lOGGER.error("Can't create user", e);
//            req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//        }

        User admin = new User();
        admin.setName("Homer");
        admin.setLogin("ADMIN");
        admin.setPassword("1");
//        try {
//            userService.create(admin);
//        } catch (DataProcessingException e) {
//            lOGGER.error("Can't create admin", e);
//            req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//        }

        Product mango = new Product();
        mango.setName("BigMango");
        mango.setPrice(50);
//        try {
//            productService.create(mango);
//        } catch (DataProcessingException e) {
//            lOGGER.error("Can't create Item", e);
//            req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//        }

        Product banana = new Product();
        banana.setName("LittleBanana");
        banana.setPrice(75);
//        try {
//            productService.create(banana);
//        } catch (DataProcessingException e) {
//            lOGGER.error("Can't create Product", e);
//            req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//        }

        resp.sendRedirect(req.getContextPath() + "/");
    }

//   старая версия работающая
//   private  static final Injector injector = Injector.getInstance("fruit_shop");
//    private UserService userService = (UserService) injector.getInstance(UserService.class);
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        User alex = new User("alex");
//        User max = new User("max");
//        User tim = new User("tim");
//        User vova = new User("vova");
//        userService.create(max);
//        userService.create(tim);
//        userService.create(vova);
//        userService.create(alex);
//
//        req.getRequestDispatcher("/WEB-INF/views/injectData.jsp").forward(req,resp);
//    }
}
