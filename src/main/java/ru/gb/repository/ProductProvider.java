package ru.gb.repository;

import ru.gb.model.Product;

import java.util.List;

public interface ProductProvider {
    List<Product> getProduct();
}