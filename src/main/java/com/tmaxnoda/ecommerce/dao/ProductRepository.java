package com.tmaxnoda.ecommerce.dao;

import com.tmaxnoda.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
