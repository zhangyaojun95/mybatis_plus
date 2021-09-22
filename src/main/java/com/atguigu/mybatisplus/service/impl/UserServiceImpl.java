package com.atguigu.mybatisplus.service.impl;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/18 14:42
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

//    @Resource
//    private UserMapper userMapper;

    @Override
    public void test() {

    }

    @Override
    public List<User> selectAllByName(String name) {
        return baseMapper.selectAllByName(name);
    }
}
