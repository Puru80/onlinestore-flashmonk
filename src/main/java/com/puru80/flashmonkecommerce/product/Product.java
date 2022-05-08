package com.puru80.flashmonkecommerce.product;

import com.puru80.flashmonkecommerce.sku.Sku;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long productId;

    @NotNull(message = "Product name cannot be null")
    @Column(name = "product_Name")
    @Basic(optional = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "company", nullable = false)
    private String company;

    public Product(String name, Double price, String company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public Product(Long productId, String name, Double price, String company) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return productId != null && Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
