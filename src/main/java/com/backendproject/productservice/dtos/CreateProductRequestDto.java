package com.backendproject.productservice.dtos;

import com.backendproject.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {

    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private String categoryName;

    public Product toProduct(){
        Product product = new Product();
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setImageUrl(this.imageUrl);
        product.setPrice(this.price);
        product.setCategoryName(this.categoryName);
        return product;

    }
}
