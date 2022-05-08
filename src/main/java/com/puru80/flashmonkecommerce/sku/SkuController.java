package com.puru80.flashmonkecommerce.sku;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/sku")
@AllArgsConstructor
public class SkuController {

    private SkuService skuService;

    @PostMapping("/add")
    public String addSku(@RequestBody SkuRequest skuRequest){
        return skuService.addSku(skuRequest);
    }

    @PostMapping("/update")
    public String updateSku(@RequestBody SkuRequest skuRequest){
        return skuService.updateSku(skuRequest);
    }
}
