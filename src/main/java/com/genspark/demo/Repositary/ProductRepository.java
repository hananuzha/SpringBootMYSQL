package com.genspark.demo.Repositary;

import com.genspark.demo.Entity.Product;
import com.genspark.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


}
