package fruit_shop.controllers;

import fruit_shop.lib.Inject;
import fruit_shop.service.ProductService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProductController extends HttpServlet {
    @Inject
    private static ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String productId = req.getParameter("product_id");

            productService.delete(Long.parseLong(productId));

        resp.sendRedirect(req.getContextPath() + "/getAllProducts");
    }
}
