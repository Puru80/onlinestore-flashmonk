package com.puru80.flashmonkecommerce.sku;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SkuService {

    private SkuRepository skuRepository;

    public String addUpdateSku(Sku sku){
        skuRepository.save(sku);
        return null;
    }

}
