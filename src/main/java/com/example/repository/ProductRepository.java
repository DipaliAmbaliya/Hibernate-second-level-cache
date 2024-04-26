package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable> {

    Optional<Product> findByPname(String productName);
}
