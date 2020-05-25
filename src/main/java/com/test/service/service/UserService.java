package com.test.service.service;

import com.test.model.User;

public interface UserService {
    User getUser(int userid);
    int insertUser(User user);
}
