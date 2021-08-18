package com.telstra.ProdService.controller;
import com.telstra.ProdService.entity.Product;
import com.telstra.ProdService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductService userService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome!!";
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return userService.addProduct(product);
    }

    @GetMapping("/product")
    public List<Product> getAllproducts(){
        return this.userService.getAllProducts();
    }

    @GetMapping("/product/{productid}")
    public Product getproductById(@PathVariable("productid") Long productid){
        return this.userService.getproductById(productid);
    }

    @DeleteMapping("/product/{productid}")
    public String deleteproductById(@PathVariable("productid") Long productid){
        return this.userService.deleteproductById(productid);
    }

    @PutMapping("/product/{productid}")
    public Product updateproduct(@PathVariable("productid") Long productid, @RequestBody Product product){
        return userService.updateproduct(productid, product);
    }

}