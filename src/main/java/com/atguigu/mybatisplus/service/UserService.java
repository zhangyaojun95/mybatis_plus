package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/18 14:39
 **/
public interface UserService extends IService<User> {

    void test();

    List<User> selectAllByName(String name);
}
