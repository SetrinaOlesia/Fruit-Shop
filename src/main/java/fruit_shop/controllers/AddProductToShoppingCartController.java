package fruit_shop.controllers;

import fruit_shop.lib.Inject;
import fruit_shop.model.Product;
import fruit_shop.model.ShoppingCart;
import fruit_shop.service.ShoppingCartService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProductToShoppingCartController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddProductToShoppingCartController.class));

    @Inject
    private static ShoppingCartService shoppingCartService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String productId = req.getParameter("product_id");

        Long userId = (Long) req.getSession(true).getAttribute("productId");

        ShoppingCart shoppingCart = null;

            shoppingCart = shoppingCartService.getByUserId(userId);
            if (shoppingCart.getId() == null) {
                shoppingCart.setUserId(userId);
                shoppingCartService.create(shoppingCart);
            }
            shoppingCartService.addProduct(shoppingCart, Long.valueOf(productId));

//        catch (DataProcessingException e) {
//            LOGGER.error("Can not add item to the bucket", e);
//            req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
//        }

        List<Product> products = shoppingCartService.getAllProducts(shoppingCart);
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/shoppingCart.jsp").forward(req, resp);
    }
}
