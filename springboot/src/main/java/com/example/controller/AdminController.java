package com.example.controller;


import com.example.common.Result;
import com.example.controller.dto.LoginDTO;
import com.example.controller.request.LoginRequest;
import com.example.service.impl.AdminServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminServiceimpl adminService;

    @PostMapping ("/login")
    public Result login(@RequestBody LoginRequest req) {
        LoginDTO login = adminService.login(req);
        if(login == null){
              return Result.failed();
            //return Result.success(login);
        }else{
            return Result.success(login);
        }
    }


}
