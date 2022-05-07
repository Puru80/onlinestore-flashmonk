package com.puru80.flashmonkecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashmonkEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashmonkEcommerceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(ProductRepository productRepository, ProductService productService, SkuService skuService){
        return args -> {
            Product p = new Product(
                    "Product3",
                    480.00,
                    "Company2"
            );

            productService.saveProduct(p);

            skuService.addUpdateSku(new Sku(p, 100L));
            skuService.addUpdateSku(new Sku(p, 120L));
            skuService.addUpdateSku(new Sku(p, 30L));

            productRepository.findById(1L).ifPresentOrElse(s -> {
                Product product = productRepository.findById(1L).get();
                System.out.println(product.getName());
            }, () -> System.out.println("Product Not Found"));
        };
    }*/
}
