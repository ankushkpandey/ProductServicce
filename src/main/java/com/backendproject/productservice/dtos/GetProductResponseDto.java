package com.backendproject.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetProductResponseDto {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private Double price;

}
