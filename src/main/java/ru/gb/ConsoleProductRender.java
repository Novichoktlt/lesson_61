package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ConsoleProductRender implements ProductRender {

    private ProductProvider productProvider;
    private ProductCart productCart;
    private boolean noProduct = false;

    @Override
    public void render() {
        for (Product p : productProvider.getProduct()) {
            if (Render.id.equals("exit")) {
                System.out.println("Досвидание!");
                noProduct = true;
                break;
            } else if (Render.id.equals("list")) {
                System.out.println(p.getId() + ". " + p.getTitle() + " - " + p.getPrice());
                noProduct = true;
            } else if (p.getId().equals(Render.id)) {
                noProduct = true;
            }
        }
        
        if (Render.id.equals("new")) {
            noProduct = true;
            System.out.println("Создана новая корзина");
            Render.cart = new ArrayList<>();
        }

        if (!noProduct) {
            System.out.println("Нет продукта с таким номером.");
        }
        if (!Render.id.equals("exit")) {
            System.out.println("Продуты в корзине:");
            for (Product p : productCart.getCart()) {
                System.out.println(p.getId() + ". " + p.getTitle() + " - " + p.getPrice());
            }
        }
    }

    @Override
    @Autowired
    public void setProductProvider(ProductProvider provider) {
        this.productProvider = provider;
    }

    @Override
    @Autowired
    public void setProductCart(ProductCart provider) {
        this.productCart = provider;
    }

    @Override
    public ProductProvider getProductProvider() {
        return this.productProvider;
    }

    @Override
    public ProductCart getProductCart() {
        return this.productCart;
    }
}
