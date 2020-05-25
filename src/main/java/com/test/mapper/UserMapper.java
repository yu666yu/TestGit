package com.test.mapper;
import com.test.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(int userid);
    int insertUser(User user);
}
