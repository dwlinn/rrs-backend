package com.example.service;

import com.example.controller.request.OrderRequest;
import com.example.entity.Order;

import java.util.List;

public interface OrderService {

    public List<Order> selectAll();

    public Order selectById(Integer id);

    public Object selectByPage(OrderRequest orderRequest);

    public void save(Order order);
    public void update(Order order);

    public void deleteById(Integer id);
}
