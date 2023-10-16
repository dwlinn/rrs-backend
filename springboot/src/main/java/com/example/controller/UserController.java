package com.example.controller;

import com.example.common.Result;
import com.example.controller.request.UserRequest;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Result selectAll() {
        Result result = Result.success(userService.selectAll());
        return result;
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        return Result.success(userService.selectById(id));
    }

    @GetMapping("/page")
    public Object getByPage(UserRequest userRequest){
        return Result.success(userService.selectByPage(userRequest));
    }

    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        userService.save(user);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        userService.deleteById(id);
        return Result.success();
    }
}
