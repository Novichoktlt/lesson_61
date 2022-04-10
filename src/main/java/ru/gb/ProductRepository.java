package ru.gb;

import lombok.Getter;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class ProductRepository implements ProductProvider{

    @Override
    public List<Product> getProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Tea", "45.20"));
        products.add(new Product("2", "Coffee", "52.20"));
        products.add(new Product("3", "Cocoa", "85.50"));
        products.add(new Product("4", "Tomato", "52.20"));
        products.add(new Product("5", "Onion", "41.40"));
        return products;
    }
}
