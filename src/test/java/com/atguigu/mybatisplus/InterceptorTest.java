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
    
    @Test
    void testConcurrentUpdate(){
        //小李取数据
        Product p1 = productMapper.selectById(1L);
        //小王取数据
        Product p2 = productMapper.selectById(1L);
        //小李修改 + 50
        p1.setPrice(p1.getPrice()+50);
        int result = productMapper.updateById(p1);
        System.out.println("小李修改的结果:"+result);
        //小王修改 - 30
        p2.setPrice(p2.getPrice()-30);
        int result1 = productMapper.updateById(p2);
        if (result1 == 0){
            p2 = productMapper.selectById(1L);
            p2.setPrice(p2.getPrice() - 30);
            result1 = productMapper.updateById(p2);
        }
        System.out.println("小王修改的结果:"+result1);
        //老板看价格
        System.out.println("老板看到的价格:"+productMapper.selectById(1L).getPrice());

    }


}
