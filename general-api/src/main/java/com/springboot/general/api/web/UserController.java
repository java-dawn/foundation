package com.springboot.general.api.web;

import com.springboot.general.biz.UserService;
import com.springboot.general.dal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang
 * @date 2020-7-25
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public User add(User user) {
        userService.add(user);
        return user;
    }
}
