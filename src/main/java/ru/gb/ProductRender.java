package ru.gb;

public interface ProductRender {
    void render();
    void setProductProvider(ProductProvider provider);
    void setProductCart(ProductCart provider);
    ProductProvider getProductProvider();
    ProductCart getProductCart();
}
