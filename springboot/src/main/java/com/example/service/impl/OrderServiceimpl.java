package com.example.service.impl;

import com.example.controller.request.OrderRequest;
import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import com.example.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public Order selectById(Integer id) {
        return orderMapper.selectById(id);
    }

    @Override
    public Object selectByPage(OrderRequest orderRequest) {
        PageHelper.startPage(orderRequest.getPagenum(),orderRequest.getPagesize());
        List<Order> res = orderMapper.selectByPage(orderRequest);
        return new PageInfo<>(res);
    }

    @Override
    public void save(Order user) {
        orderMapper.save(user);
    }
    @Override
    public void update(Order user){
        orderMapper.update(user);
    }

    @Override
    public void deleteById(Integer id) {
        orderMapper.deleteById(id);
    }

}
