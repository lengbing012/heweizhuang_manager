package com.heweizhuang.service.impl;

import com.heweizhuang.mapper.UsersMapper;
import com.heweizhuang.pojo.Users;
import com.heweizhuang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-21 14:17
 * @Description: com.heweizhuang.service.impl
 * @Version: 1.0
 */

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }

    @Override
    public List<Users> selectUserAll() {
        List<Users> usersList=  this.usersMapper.selectUserAll();
        return usersList;
    }

    @Override
    public Users getUserById(Integer userid) {
        return this.usersMapper.getUserById(userid);
    }
}
