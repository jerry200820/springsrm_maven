package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class Test1 {
    @Autowired
    private UserMapper userMapper;

    //查询所有数据
 /*   @Test
    public void getAll(){
        List<User> all = userMapper.getAll();
        for (User user:all){
            System.out.println(user);
        }
    }*/
   /* @Test
    public  void  selectById(){
        List<User>  users = userMapper.selectById(1);
        for (User user: users){
            System.out.println("查询id为1");
            System.out.println(user);
        }
    }*/
    /*@Test
    public  void  deleteId(){
        List<User>  list = userMapper.deleteId(2);
        System.out.println("删除id为2");
        System.out.println(list);
    }*/

    @Test
    public  void  intersID(){

 userMapper.intersID("sada","32","男");

    }
/*@Test
    public void  Updateid(){

   int i= userMapper.Updateid();
   if ( i >0){
       System.out.println("成功");
   }else {
       System.out.println("失败");
   }
}*/


}
