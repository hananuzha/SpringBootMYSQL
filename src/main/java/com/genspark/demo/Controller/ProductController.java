package com.genspark.demo.Controller;

import com.genspark.demo.Entity.Product;
import com.genspark.demo.ServiceInterface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public List<Product> getProduct(){return this.productService.getAllProduct();}
    @GetMapping("/Product/{ProductId}")
    public Product getProduct(@PathVariable("ProductId") int id){
        return this.productService.getProductById(id);
    }
    @PostMapping("/Product")
    public Product addProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }
    @PutMapping("/Product")
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }
    @DeleteMapping(path="/Product/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        return this.productService.deleteProduct(id);
    }

}
