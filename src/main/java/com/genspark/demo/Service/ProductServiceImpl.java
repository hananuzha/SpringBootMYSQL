package com.genspark.demo.Service;

import com.genspark.demo.Entity.Product;
import com.genspark.demo.Entity.Product;
import com.genspark.demo.Repositary.ProductRepository;
import com.genspark.demo.ServiceInterface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository  productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product =this.productRepository.findById(id);
        if(product.isPresent())
            return product.get();
        else {
            throw new IllegalStateException("product with id " + id + "does  not exist");
        }
    }

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public String deleteProduct(int id) {
        this.productRepository.deleteById(id);
        return "deleted Successfully";    }


}
