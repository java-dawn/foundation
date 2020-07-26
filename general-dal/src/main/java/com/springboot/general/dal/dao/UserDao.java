package com.springboot.general.dal.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.general.dal.mapper.UserMapper;
import com.springboot.general.dal.model.User;
import org.springframework.stereotype.Component;

/**
 * @author Liang
 * @date 2020-7-25
 */
@Component
public class UserDao extends ServiceImpl<UserMapper, User> {
}
