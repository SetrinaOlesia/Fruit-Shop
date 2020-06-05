//package fruit_shop.lib;
//
//import OrderDao;
//import ProductDao;
//import ShoppingCartDao;
//import UserDao;
//import factory.Factory;
//import fruit_shop.service.OrderService;
//import fruit_shop.service.ProductService;
//import fruit_shop.service.ShoppingCartService;
//import fruit_shop.service.UserService;
//import java.util.HashMap;
//import java.util.Map;
//
//public class AnnotatedClassMap {
//
//    protected static final Map<Class, Object> classMap = new HashMap<>();
//
//    static  {
//
//        classMap.put(ShoppingCartDao.class, Factory.getShoppingCartDao());
//        classMap.put(ProductDao.class, Factory.getProductDao());
//        classMap.put(OrderDao.class, Factory.getOrderDao());
//        classMap.put(UserDao.class, Factory.getUserDao());
//
//        classMap.put(ShoppingCartService.class, Factory.getShoppingCartService());
//        classMap.put(ProductService.class, Factory.getProductService());
//        classMap.put(OrderService.class, Factory.getOrderService());
//        classMap.put(UserService.class, Factory.getUserService());
//    }
//
//    public static Object getImplementation(Class interfaceClass) {
//        return classMap.get(interfaceClass);
//    }
//}
