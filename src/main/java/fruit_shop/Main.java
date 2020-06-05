package fruit_shop;

import fruit_shop.lib.Injector;
import fruit_shop.model.Product;
import fruit_shop.service.ProductService;


public class Main {

    private static final Injector injector = Injector.getInstance("fruit_shop");

    public static void main(String[] args) {
        ProductService productService = (ProductService) injector.getInstance(ProductService.class);
        Product mango = new Product("mango", 50);
        Product papaya = new Product("papaya", 100);

        productService.create(mango);
        productService.create(papaya);
        productService.getAllProducts().forEach(System.out::println);

    }
}
