package com.puru80.flashmonkecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashmonkEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashmonkEcommerceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(ProductRepository repository){
        return args -> {
            List<Product> pList = new ArrayList<>();

            for(int i=1;i<=20;i++) {
                Random r = new Random();

                pList.add(new Product(
                        "Product" + (i+1),
                        (double)(35 * i + r.nextInt(50)),
                        "Company" + i,
                        (long)(r.nextInt(50) * i)
                ));
            }

            repository.saveAll(pList);

        };
    }*/
}
