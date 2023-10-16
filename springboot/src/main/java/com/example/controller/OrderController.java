package com.example.controller;

import com.example.common.Result;
import com.example.controller.request.OrderRequest;
import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public Result selectAll() {
        Result result = Result.success(orderService.selectAll());
        return result;
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        return Result.success(orderService.selectById(id));
    }

    @GetMapping("/page")
    public Object getByPage(OrderRequest orderRequest){
        return Result.success(orderService.selectByPage(orderRequest));
    }

    @PostMapping("/save")
    public Result save(@RequestBody Order order) {
        orderService.save(order);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody Order order){
        orderService.update(order);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        orderService.deleteById(id);
        return Result.success();
    }

}
