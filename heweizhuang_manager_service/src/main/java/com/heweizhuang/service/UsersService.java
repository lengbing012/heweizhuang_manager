package com.heweizhuang.service;

import com.heweizhuang.pojo.Users;

import java.util.List;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-21 14:15
 * @Description: com.heweizhuang.service
 * @Version: 1.0
 */
public interface UsersService {

    void addUser(Users users);

    List<Users> selectUserAll();

    Users getUserById(Integer userid);
}
