package com.puru80.flashmonkecommerce.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM products u WHERE u.quantity>0", nativeQuery = true)
    List<Product> getAvailableProduct();
}
