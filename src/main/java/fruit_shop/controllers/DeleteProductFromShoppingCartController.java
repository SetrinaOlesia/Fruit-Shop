package fruit_shop.controllers;

import fruit_shop.exception.DataProcessingException;
import fruit_shop.lib.Inject;
import fruit_shop.service.ProductService;
import fruit_shop.service.ShoppingCartService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class DeleteProductFromShoppingCartController  extends HttpServlet {
    @Inject
    private static ShoppingCartService shoppingCartService;

    @Inject
    private static ProductService productService;

    private static final Logger LOGGER = Logger.getLogger(DeleteProductFromShoppingCartController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Long  userId  = (Long) req.getSession(true).getAttribute("userId");
        String productId = req.getParameter("product_id");
//        try {
//            shoppingCartService.deleteProduct(shoppingCartService.getByUserId(userId),
//                    productService.get(Long.valueOf(productId)));
//        } catch (DataProcessingException e) {
//            LOGGER.error("Can not delete item from bucket", e);
//            req.getRequestDispatcher("/error.jsp").forward(req, resp);
//        }
        resp.sendRedirect(req.getContextPath() + "/showShoppingCart");
    }
}
