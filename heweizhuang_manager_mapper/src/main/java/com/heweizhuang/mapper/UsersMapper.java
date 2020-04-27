package com.heweizhuang.mapper;

import com.heweizhuang.pojo.Users;

import java.util.List;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-20 8:46
 * @Description: com.heweizhuang.mapper
 * @Version: 1.0
 */
public interface UsersMapper {
    //https://blog.csdn.net/yamadeee/article/details/79774638 参考

    void insertUser(Users users);

    List<Users> selectUserAll();

    Users getUserById(Integer userid);  //返回单个实体
}
