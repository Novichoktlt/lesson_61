//package ru.gb;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import ru.gb.model.Product;
//
//import java.util.List;
//
//@Component
//public class Cart implements ProductCart, ProductRenderCart {
//
//    private ConsoleProductRender.ProductProvider productProvider;
//    private boolean isEmpty = true;
//
//    @Override
//    public List<Product> getCart() {
//        List<Product> cart = Render.cart;
//        for (Product c: cart){
//            if(c.getId().equals(Render.id)){
//                System.out.println("Продукт " + c.getTitle() + " удален из корзины" );
//                cart.remove(c);
//                isEmpty = false;
//                break;
//            }
//        }
//        if (isEmpty) {
//            for (Product p : productProvider.getProduct()) {
//                if (p.getId().equals(Render.id)) {
//                    System.out.println("Продукт " + p.getTitle() + " добавлен в корзину");
//                    cart.add(p);
//                }
//            }
//        }
//        return cart;
//    }
//
//    @Override
//    @Autowired
//    public void setProductProvider(ConsoleProductRender.ProductProvider provider) {
//        this.productProvider = provider;
//    }
//
//    @Override
//    public ConsoleProductRender.ProductProvider getProductProvider() {
//        return this.productProvider;
//    }
//}
