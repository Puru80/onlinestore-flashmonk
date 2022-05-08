package com.puru80.flashmonkecommerce.sku;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SkuRequest {
    private Long skuId;
    private Long productId;
    private Long quantity;
}