package com.itheima.ssm.service;

import com.itheima.ssm.domain.Order;

import java.util.List;

public interface OrderService {

    public List<Order> findAll(Integer page, Integer size);

    public Order findById(String id);
}
