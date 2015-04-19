package com.mobox.service;

import com.mobox.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl {
    @Autowired
    ProductRepository productRepository;

    public List<Product> showAllFromDB(){
        List<Product> all = productRepository.getAll();
        return all;
    }
}
