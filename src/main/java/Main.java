import db.Storage;
import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        Product mango = new Product("mango", 50);
        Product papaya = new Product("papaya", 100);

//        Storage.addProduct(mango);
//        Storage.addProduct(papaya);
//        Storage.products.forEach(System.out::println);

        ProductService productService = new ProductServiceImpl();
        productService.create(mango);
        System.out.println(productService.getById(1L).orElseGet(() -> new Product("NoFruits", 0)));

    }
}
