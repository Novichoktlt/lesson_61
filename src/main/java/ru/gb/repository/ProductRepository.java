package ru.gb.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.gb.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class ProductRepository implements ProductProvider {

    List<Product> products = new ArrayList<>();


    public List<Product> getProduct() {
        products.add(new Product(1, "Tea", "45.20"));
        products.add(new Product(2, "Coffee", "52.20"));
        products.add(new Product(3, "Cocoa", "85.50"));
        products.add(new Product(4, "Tomato", "52.20"));
        products.add(new Product(5, "Onion", "41.40"));

        return products;
    }


    public Product save(Product product) {
        for (Product p : products) {
            if (product.getId().equals(p.getId())) {
                return Product.builder().build();
            }
        }
        products.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .price(product.getPrice())
                .build();
    }

    public Product edit(Product product) {
        for (Product p : products) {

            System.out.println(product.getId() + " id product " + p.getId() + " id  products");
            if (product.getId().equals(p.getId())) {
                deleteById(product);
                products.add(product);
                return Product.builder()
                        .id(product.getId())
                        .title(product.getTitle())
                        .price(product.getPrice())
                        .build();
            }
        }

        return Product.builder().build();
    }

    public Optional<Product> findById(Integer id) {
        if (id < products.size()) {
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }
    }

    public void deleteById(Product product) {
        for (Product p : products) {
            if ((product.getId()).equals(p.getId())) {
                products.remove(p);
                break;
            }
        }
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }
}
