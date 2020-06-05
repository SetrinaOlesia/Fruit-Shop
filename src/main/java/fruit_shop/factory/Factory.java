//package factory;
//
//import OrderDao;
//import ProductDao;
//import ShoppingCartDao;
//import UserDao;
//import OrderDaoImpl;
//import ProductDaoImpl;
//import ShoppingCartDaoImpl;
//import UserDaoImpl;
//import fruit_shop.service.OrderService;
//import fruit_shop.service.ProductService;
//import fruit_shop.service.ShoppingCartService;
//import fruit_shop.service.UserService;
//import fruit_shop.service.impl.OrderServiceImpl;
//import fruit_shop.service.impl.ProductServiceImpl;
//import fruit_shop.service.impl.ShoppingCartServiceImpl;
//import fruit_shop.service.impl.UserServiceImpl;
//
//
//public class Factory {
//
//
//    private static ShoppingCartDao instanceShoppingCartDao;
//    private static ProductDao instanceProductDao;
//    private static OrderDao instanceOrderDao;
//    private static UserDao instanceUserDao;
//
//    private static ShoppingCartService instanceShoppingCartService;
//    private static ProductService instanceProductService;
//    private static OrderService instanceOrderService;
//    private static UserService instanceUserService;
//
//    public static ShoppingCartDao getShoppingCartDao() {
//        return instanceShoppingCartDao == null
//                ? instanceShoppingCartDao = new ShoppingCartDaoImpl() : instanceShoppingCartDao;
//    }
//
//    public static ProductDao getProductDao() {
//        return instanceProductDao == null
//                ? instanceProductDao = new ProductDaoImpl() : instanceProductDao;
//    }
//
//    public static OrderDao getOrderDao() {
//        return instanceOrderDao == null
//                ? instanceOrderDao = new OrderDaoImpl(): instanceOrderDao;
//    }
//
//    public static UserDao getUserDao() {
//        return instanceUserDao == null
//                ? instanceUserDao = new UserDaoImpl() : instanceUserDao;
//    }
//
//    public static ShoppingCartService getShoppingCartService() {
//        return instanceShoppingCartService == null
//                ? instanceShoppingCartService = new ShoppingCartServiceImpl() : instanceShoppingCartService;
//    }
//
//    public static ProductService getProductService() {
//        return instanceProductService == null
//                ? instanceProductService = new ProductServiceImpl() : instanceProductService;
//    }
//
//    public static OrderService getOrderService() {
//        return instanceOrderService == null
//                ? instanceOrderService = new OrderServiceImpl() : instanceOrderService;
//    }
//
//    public static UserService getUserService() {
//        return instanceUserService == null
//                ? instanceUserService = new UserServiceImpl() : instanceUserService;
//    }
//}
