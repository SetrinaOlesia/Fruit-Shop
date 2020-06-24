package fruit_shop.controllers;

import fruit_shop.lib.Inject;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.ShoppingCartService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

public class ShowShoppingCartController extends HttpServlet {
    @Inject
    private static ShoppingCartService shoppingCartService;

    private static final Logger LOGGER = Logger.getLogger(ShowShoppingCartController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Long userId = (Long) req.getSession(true).getAttribute("userId");
        ShoppingCart shoppingCart = null;
        shoppingCart = shoppingCartService.getByUserId(userId);
        List<Product> products = shoppingCartService.getAllProducts(shoppingCart);

        req.setAttribute("products", products);

        req.getRequestDispatcher("/WEB-INF/views/shoppingCart.jsp").forward(req, resp);
    }
}
