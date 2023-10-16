package com.example.mapper;

import com.example.controller.request.OrderRequest;
import com.example.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

//    @Select("SELECT * FROM order")
    public List<Order> selectAll();

//    @Select("SELECT * FROM order WHERE id = #{id}")
    Order selectById(Integer id);

    //@Update("UPDATE orders SET base_name = #{order.baseName}, order_center_name = #{order.orderCenterName}, product = #{order.product}, brand = #{order.brand}, num = #{order.num}, deadline = #{order.deadline} WHERE id = #{order.id}")
    void update(Order order);

    //@Delete("DELETE FROM orders WHERE id = #{id}")
    void deleteById(Integer id);

    //@Insert("INSERT INTO orders (base_name, order_center_name, product, brand, num, deadline) VALUES (#{order.baseName}, #{order.orderCenterName}, #{order.product}, #{order.brand}, #{order.num}, #{order.deadline})")
    void save(Order order);

    List<Order> selectByPage(OrderRequest orderRequest);
}
