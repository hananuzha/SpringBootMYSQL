package com.genspark.demo.ServiceInterface;

import com.genspark.demo.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(int id);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    String deleteProduct(int id);
}
