package com.telstra.ProdService.service;

import com.telstra.ProdService.entity.Product;
import com.telstra.ProdService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getproductById(Long productid) {
        return productRepository.findById(productid).get();
    }

    @Override
    public String deleteproductById(Long productid) {
        productRepository.deleteById(productid);
        return "User Deleted !!";
    }

    @Override
    public Product updateproduct(Long productid, Product product) {

        Product productdb = productRepository.findById(productid).get();

        if(Objects.nonNull(product.getProductname()) &&
                !"".equalsIgnoreCase(product.getProductname())){
            productdb.setProductname(product.getProductname());
        }

        return productRepository.save(productdb);

    }
}
