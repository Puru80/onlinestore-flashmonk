package com.puru80.flashmonkecommerce;

import com.puru80.flashmonkecommerce.product.Product;
import com.puru80.flashmonkecommerce.product.ProductRepository;
import com.puru80.flashmonkecommerce.sku.Sku;
import com.puru80.flashmonkecommerce.sku.SkuRequest;
import com.puru80.flashmonkecommerce.sku.SkuService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashmonkEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashmonkEcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SkuService skuService, ProductRepository productRepository){
        return args -> {

            System.out.println(skuService.addSku(new SkuRequest(1L, 190L)));

            /*productRepository.findById(1L).ifPresentOrElse(s -> {
                Product product = productRepository.findById(1L).get();
                System.out.println(product.getSkuList().isEmpty());
            }, () -> System.out.println("Product Not Found"));*/
        };
    }
}
