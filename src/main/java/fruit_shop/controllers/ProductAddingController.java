package fruit_shop.controllers;

import fruit_shop.lib.Injector;
import fruit_shop.model.Product;
import fruit_shop.service.ProductService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductAddingController extends HttpServlet {

    private static final Injector injector = Injector.getInstance("fruit_shop");
    private ProductService productService = (ProductService) injector.getInstance(ProductService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/productAdding.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Product newProduct = new Product();
        newProduct.setName(req.getParameter("product_name"));
        newProduct.setPrice(Integer.valueOf(req.getParameter("product_price")));
       productService.create(newProduct);
        resp.sendRedirect(req.getContextPath() + "/getAllProducts");
    }
}
