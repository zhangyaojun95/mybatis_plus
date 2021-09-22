package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;


/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/22 14:15
 **/
@SpringBootTest
public class InterceptorTest {

    @Resource
    private UserMapper userMapper;


    @Test
    public void testSelectPage(){
        Page<User> userPage = new Page<>(2,5);
        Page<User> userList = userMapper.selectPage(userPage, null);
        System.out.println(userList);
    }

    @Test
    public void test02(){
        Page<User> userPage = new Page<>(1,5);
        IPage<User> userIPage = userMapper.selectPageVo(userPage, 6);
        System.out.println(userIPage);
    }


}
