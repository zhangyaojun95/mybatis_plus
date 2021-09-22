package com.atguigu.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/22 10:19
 **/
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert filling ...");
        //实现填充业务逻辑
        this.strictInsertFill(metaObject,"createTime", LocalDateTime.class,LocalDateTime.now());
        this.strictUpdateFill(metaObject,"updateTime", LocalDateTime.class,LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update filling ...");
        //实现填充业务逻辑
        this.strictUpdateFill(metaObject,"updateTime", LocalDateTime.class,LocalDateTime.now());
    }
}
