package com.puru80.flashmonkecommerce.product;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId", nullable = false)
    private Long productId;

    @NotNull(message = "Product name cannot be null")
    @Column(name = "productName")
    @Basic(optional = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "company", nullable = false)
    private String company;

}
