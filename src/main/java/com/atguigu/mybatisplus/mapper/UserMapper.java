package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/18 11:16
 **/
//@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 通过用户名查询用户信息
     * @param name
     * @return List<User>
     */
    List<User> selectAllByName(@Param("name") String name);

    IPage<User> selectPageVo(Page<?> page, Integer age);
}
