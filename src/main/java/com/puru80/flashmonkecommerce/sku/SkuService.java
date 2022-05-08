package com.puru80.flashmonkecommerce.sku;

import com.puru80.flashmonkecommerce.product.Product;
import com.puru80.flashmonkecommerce.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SkuService {

    private SkuRepository skuRepository;
    private ProductService productService;

    public String addSku(SkuRequest skuRequest){

        Long productId = skuRequest.getProductId();
        Product product = productService.getProduct(productId);

        if(product != null){
            Sku sku = new Sku(product, skuRequest.getQuantity());

            skuRepository.save(new Sku(product, sku.getQuantity()));

            return "Success";
        }

        return "Fail";
    }

}
