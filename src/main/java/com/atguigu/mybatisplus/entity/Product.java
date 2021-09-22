package com.atguigu.mybatisplus.entity;

import lombok.Data;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/22 17:11
 **/

@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer version;

}
