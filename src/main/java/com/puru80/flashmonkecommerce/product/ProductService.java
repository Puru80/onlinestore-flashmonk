package com.puru80.flashmonkecommerce.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public Product getProduct(Long id){
        if(productRepository.findById(id).isPresent())
            return productRepository.findById(id).get();

        return null;
    }

    @Transactional
    public void updateProduct(Product product){
        productRepository.findById(product.getProductId()).map(target -> {
            target.setName(product.getName());
            target.setCompany(product.getCompany());
            target.setPrice(product.getPrice());
            return target;
        });
    }

}
