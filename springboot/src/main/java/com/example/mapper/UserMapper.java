package com.example.mapper;

import com.example.controller.request.UserRequest;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


    //@Select("select * from user")
    public List<User> selectAll();

    //@Select("select * from user where id = #{id}")
    public User selectById(Integer id);

   // @Insert("insert into user (name,age,sex,phone,address) values(#{name},#{age},#{sex},#{phone},#{address})")
    public void save(User user);

    //@Select("select * from user where name like concat('%',#{name},'%') and phone like concat('%',#{phone},'%')")
    List<User> selectByPage(UserRequest userRequest);

    public void update(User user);

    public void deleteById(Integer id);
}
