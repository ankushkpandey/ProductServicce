package com.backendproject.productservice.services;

import com.backendproject.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("dbProductService")
public class ProductServiceDBImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
