package com.puru80.flashmonkecommerce.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    @Transactional
    public Optional<Product> updateProduct(Product product){
        return productRepository.findById(product.getProductId()).map(target -> {
            target.setName(product.getName());
            target.setCompany(product.getCompany());
            target.setPrice(product.getPrice());

            return target;
        });
    }


}
