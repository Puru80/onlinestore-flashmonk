package com.puru80.flashmonkecommerce.sku;

import com.puru80.flashmonkecommerce.product.Product;
import com.puru80.flashmonkecommerce.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.concurrent.atomic.AtomicReference;

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

    /*@Transactional
    public void updateProduct(Product product){
        productRepository.findById(product.getProductId()).map(target -> {
            target.setName(product.getName());
            target.setCompany(product.getCompany());
            target.setPrice(product.getPrice());
            return target;
        });
    }*/

    @Transactional
    public String updateSku(SkuRequest skuRequest){
        AtomicReference<String> status = new AtomicReference<>("Success");

        skuRepository.findById(skuRequest.getSkuId()).map(target -> {
            target.setQuantity(skuRequest.getQuantity());
            Product p = productService.getProduct(skuRequest.getProductId());

            if(p==null) {
                status.set("Fail");
                return null;
            }
            else{
                target.setProduct(p);
                return target;
            }
        });

        return status.get();
    }

}
