package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.ProductMapper;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TimeZone;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;
    @Resource
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mapperTest() {
//        System.out.println(userMapper.selectById(1));
        userMapper.selectList(null).stream().forEach(System.out::println);

    }



    @Test
    void serviceTest() {
        System.out.println(userService.getById(1));
        System.out.println(userService.count());

    }

    @Test
    void testInsert(){
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));

        User user = new User();
        user.setUserName("智障3");
        user.setLoginId("zhizhang3");
        user.setPassword("123456");
        user.setEmail("test.email");
//        user.setCreateTime(LocalDateTime.now());
//        user.setUpdateTime(LocalDateTime.now());
        userMapper.insert(user);
    }

    @Test
    void testDeleted(){
        userMapper.deleteById("1440503799037927426");
    }

    @Test
    void testConcurrentUpdate(){
        //小李取数据

        //小王取数据

        //小李修改 + 50

        //小王修改 - 30

        //老板看价格

    }

}
