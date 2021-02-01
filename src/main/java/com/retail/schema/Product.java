package com.retail.schema;

import lombok.Data;

@Data
public class Product {
    private String id;
    private Price currentPrice;
    private String productDescription;
}
