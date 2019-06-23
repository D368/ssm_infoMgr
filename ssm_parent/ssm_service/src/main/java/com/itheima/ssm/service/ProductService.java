package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface ProductService {

    public void save(Product product);

    public List<Product> findAll();
}
