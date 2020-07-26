package com.springboot.general.biz;

import com.springboot.general.dal.dao.UserDao;
import com.springboot.general.dal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * @date 2020-7-25
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.save(user);
    }
}
