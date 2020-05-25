package com.test.service.serviceImpl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;
    @Override
    public User getUser(int userid) {
        return this.userDao.getUser(userid);
    }

    @Override
    public int insertUser(User user) {
        return this.userDao.insertUser(user);
    }
}
