package com.example.mapper;

import com.example.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {




    Admin selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    Admin selectById(Integer id);

    Admin selectByUsername(Integer id);

}
