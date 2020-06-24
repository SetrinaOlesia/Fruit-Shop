package fruit_shop.controllers;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Inject;
import fruit_shop.model.Order;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.OrderService;
import fruit_shop.service.ShoppingCartService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ShowProductsInOrderController extends HttpServlet {

    @Inject
    private static ShoppingCartService shoppingCartService;

    @Inject
    private static OrderService orderService;

    private static final Logger LOGGER = Logger.getLogger(ShowProductsInOrderController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Order order = new Order();
        Long userId = (Long) req.getSession(true).getAttribute("userId");
        List<Product> products = new ArrayList<>();
        ShoppingCart shoppingCart = shoppingCartService.getByUserId(userId);
        products = shoppingCartService.getAllProducts(shoppingCart);
        order.setProducts(products);
        order.setUserId(userId);
        orderService.create(order);

        req.setAttribute("products", products);
        req.getRequestDispatcher("/order.jsp").forward(req, resp);
    }
}
