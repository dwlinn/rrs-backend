package com.example.service.impl;

import com.example.controller.dto.LoginDTO;
import com.example.controller.request.LoginRequest;
import com.example.entity.Admin;
import com.example.mapper.AdminMapper;
import com.example.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminServiceimpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;


    @Override
    public LoginDTO login(LoginRequest request) {
       Admin admin =  adminMapper.selectByUsernameAndPassword(request.getUsername(),request.getPassword());
        if (admin == null) {
            System.out.println("用户名或密码错误");
            return null;
        }else{
            LoginDTO loginDTO = new LoginDTO();
            BeanUtils.copyProperties(admin, loginDTO);
//            String token = TokenUtils.genToken(String.valueOf(admin.getId()), admin.getPassword());
//            loginDTO.setToken(token);
            return loginDTO;
        }

    }

    @Override
    public Admin selectById(Integer id) {
        return adminMapper.selectById(id);
    }

    @Override
    public Admin selectUsername(Integer id) {
        return null;
    }


}
