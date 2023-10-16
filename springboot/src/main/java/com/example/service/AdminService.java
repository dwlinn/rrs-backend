package com.example.service;

import com.example.controller.dto.LoginDTO;
import com.example.controller.request.LoginRequest;
import com.example.entity.Admin;

public interface AdminService {



    LoginDTO login(LoginRequest request);

    Admin selectById(Integer id);

    Admin selectUsername(Integer id);



}
