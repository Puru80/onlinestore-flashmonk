package com.puru80.flashmonkecommerce.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    public List<Product> getAvailableProducts(){
        List<Product> productList = productRepository.getAvailableProduct();

        if(productList.isEmpty())
            throw new NullPointerException("No Products Available");
        return productList;
    }

}
