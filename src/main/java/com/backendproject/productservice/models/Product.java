package com.backendproject.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long id;
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private String categoryName;

}
