package com.telstra.ProdService.service;

import com.telstra.ProdService.entity.Product;

import java.util.List;

public interface ProductService {


    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getproductById(Long productid);

    String deleteproductById(Long productid);

    Product updateproduct(Long productid, Product product);
}
