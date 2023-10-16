package com.example.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.example.controller.request.UserRequest;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public Object selectByPage(UserRequest userRequest) {
//        String name = userRequest.getName();
//        String phone = userRequest.getPhone();
        PageHelper.startPage(userRequest.getPagenum(),userRequest.getPagesize());
        List<User> res = userMapper.selectByPage(userRequest);
        return new PageInfo<>(res);

    }

    @Override
    public void save(User user) {
        Date date =new Date();
        user.setUsername(DateUtil.format(date,"yyyyMMdd")+Math.abs(IdUtil.fastSimpleUUID().hashCode()));
        userMapper.save(user);
    }
    @Override
    public void update(User user){
        user.setUpdatetime(new Date());
        userMapper.update(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

}
