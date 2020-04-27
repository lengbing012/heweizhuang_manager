package com.heweizhuang.test;

import com.heweizhuang.mapper.UsersMapper;
import com.heweizhuang.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-20 11:36
 * @Description: com.heweizhuang.test
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void  insertUserTest(){
        Users users = new Users();
        users.setUserage(18);
        users.setUsername("liurushi");
        this.usersMapper.insertUser(users);
    }
}
