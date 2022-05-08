package com.puru80.flashmonkecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashmonkEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashmonkEcommerceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(SkuService skuService){
        return args -> {

            for(int i=1;i<=20;i++) {
                Random r = new Random();

                SkuRequest req = new SkuRequest(r.nextLong(5) + 1, (long) (25 * i));

                skuService.addSku(req);
            }



        };
    }*/
}
