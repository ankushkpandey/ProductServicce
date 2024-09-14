package com.backendproject.productservice.dtos;

import com.backendproject.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductResponseDto {

    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private Double price;

    public static CreateProductResponseDto fromProduct(Product product) {
        CreateProductResponseDto responseDto = new CreateProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setTitle(product.getTitle());
        responseDto.setDescription(product.getDescription());
        responseDto.setImageUrl(product.getImageUrl());
        responseDto.setPrice(product.getPrice());
        return responseDto;
    }


}
