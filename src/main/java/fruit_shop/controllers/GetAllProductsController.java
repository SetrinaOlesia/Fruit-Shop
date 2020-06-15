package fruit_shop.controllers;

import fruit_shop.lib.Injector;
import fruit_shop.model.Product;
import fruit_shop.service.ProductService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAllProductsController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("fruit_shop");
    private ProductService productService = (ProductService) injector.getInstance(ProductService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Product> products = new ArrayList();
        products.addAll(productService.getAllProducts());
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/purchasing.jsp").forward(req, resp);
    }
}
