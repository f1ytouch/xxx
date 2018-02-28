package com.xxx.service.impl;

import com.xxx.dao.IUserDao;
import com.xxx.model.User;
import com.xxx.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}