package com.springboot.general.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Liang
 * @date 2020-7-25
 */
@Data
@TableName("t_user")
public class User {

    @TableId(type = IdType.AUTO)
    public int id;

    private String name;
}
