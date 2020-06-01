import db.Storage;
import model.Product;

public class Main {
    public static void main(String[] args) {
        Product mango = new Product("mango", 50);
        Product papaya = new Product("papaya", 100);

        Storage.addProduct(mango);
        Storage.addProduct(papaya);
        Storage.products.forEach(System.out::println);

    }
}
