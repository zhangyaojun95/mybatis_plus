package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description
 * @author: ZYJ
 * @Date: create in 2021/9/18 11:11
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "user")
public class User  implements Comparable<User>{

    @TableId(type = IdType.ASSIGN_ID,value = "id")
    private Long id;
    private String loginId;
    private String password;
    private String userName;
    private String email;
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @TableLogic
    @TableField(value = "is_deleted")
    private Integer deleted;

    @Override
    public int compareTo(User user) {
        return id.compareTo(user.getId());
    }
}
