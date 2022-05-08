package com.puru80.flashmonkecommerce.product;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/available")
    public List<Product> getAvailableProducts(){
        return productService.getAvailableProducts();
    }
}
