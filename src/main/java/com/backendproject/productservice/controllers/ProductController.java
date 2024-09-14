package com.backendproject.productservice.controllers;

import com.backendproject.productservice.dtos.CreateProductRequestDto;
import com.backendproject.productservice.dtos.CreateProductResponseDto;
import com.backendproject.productservice.dtos.GetProductResponseDto;
import com.backendproject.productservice.models.Product;
import com.backendproject.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public CreateProductResponseDto createProduct(@RequestBody CreateProductRequestDto createProductRequestDto){
        Product product = productService.createProduct(createProductRequestDto.toProduct());


        return CreateProductResponseDto.fromProduct(product);
       // return "This Product is priced at " + createProductRequestDto.getPrice();
    }

    @GetMapping("")
    public List<GetProductResponseDto> getALlProducts(){
        //return "This is your all Product API" ;
        return null;
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id){
        return "Your Product ID is  " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        return "Your Product ID is " + id + " Deleted";
    }
    @RequestMapping(name = "AKP", value = "")
    public String someRandomFunction(){
        return "Magic";
    }

    public void replaceProduct(Product product){

    }

    public void updateProduct(Product product){

    }
}
