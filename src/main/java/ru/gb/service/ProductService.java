package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ru.gb.model.Product;
import ru.gb.repository.ProductProvider;
import ru.gb.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product edit(Product product) {
        return productRepository.edit(product);
    }

    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Product product) {
        productRepository.deleteById(product);
    }




}
