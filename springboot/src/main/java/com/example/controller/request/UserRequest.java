package com.example.controller.request;


import lombok.Data;

@Data
public class UserRequest extends BaseRequest{

    private String name;
    private Integer id;
}
