package com.example.service;

import com.example.controller.request.UserRequest;
import com.example.entity.User;

import java.util.List;

public interface UserService {

    public List<User> selectAll();

    public User selectById(Integer id);

    public Object selectByPage(UserRequest userRequest);

    public void save(User user);
    public void update(User user);

    public void deleteById(Integer id);
}
