package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.OrdersDao;
import com.itheima.ssm.domain.Order;
import com.itheima.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrdersDao ordersDao;
    @Override
    public List<Order> findAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<Order> orders = ordersDao.findAll();
        return orders;
    }

    @Override
    public Order findById(String id) {
        Order order = ordersDao.findById(id);
        return order;
    }
}
