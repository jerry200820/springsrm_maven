package com.example.mapper;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.List;

@Controller
public interface UserMapper {
    //查询所有数据
    List<User> getAll();
    // 根据id查询数据
    List<User> selectById(Integer id);

    List<User> deleteId(Integer id);

  int intersID(String name,String age ,String sex );

    int Updateid();

    int updateName(String name,String age);

}
