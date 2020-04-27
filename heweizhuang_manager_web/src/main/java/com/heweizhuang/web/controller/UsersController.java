package com.heweizhuang.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heweizhuang.pojo.Users;
import com.heweizhuang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-21 14:06
 * @Description: com.heweizhuang.web.controller
 * @Version: 1.0
 */

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }

    //正常情况下，会返回视图解析器，而 json 需要返回的是一个字符串：jackson 或是 fastjson
    //@ResponseBody 将服务器返回的对象转换为 json 对象响应回去
    @RequestMapping("/selectUserAll")
    @ResponseBody
    public List<Users> selectUserAll(){
        List<Users> usersList = this.usersService.selectUserAll();
        System.out.println(usersList);
        return usersList;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public Users getUserById() throws JsonProcessingException {
        //需要一个 jackson 的对象映射器，就是一个类，使用它可以直接将对象转换为 json 字符串
        //ObjectMapper mapper = new ObjectMapper();
        Users users = this.usersService.getUserById(7);
        System.out.println(users);
        //将 Java 对象转换为 Json 字符串
        //String str = mapper.writeValueAsString(users);
        //System.out.println(str);
        return users;
    }


    @RequestMapping("/getUserstr")
    @ResponseBody
    public String getUserstr() throws JsonProcessingException {
        //需要一个 jackson 的对象映射器，就是一个类，使用它可以直接将对象转换为 json 字符串
        ObjectMapper mapper = new ObjectMapper();
        Users users = this.usersService.getUserById(7);
        System.out.println(users);
        //将 Java 对象转换为 Json 字符串
        String str = mapper.writeValueAsString(users);
        System.out.println(str);
        //由于使用了 @ResponseBody 注解，这里会将 str 以 json 格式的字符串返回，十分方便
        return str;
    }

    @RequestMapping(value = "/getUserstr2", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getUserstr2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Users users = this.usersService.getUserById(7);
        String str = mapper.writeValueAsString(users);
        System.out.println(str);
        return str;
    }

    @RequestMapping(value = "/getUserstr3", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getUserstr3() throws JsonProcessingException {
        Users users = this.usersService.getUserById(7);
        String str = users.getUsername();
        System.out.println(str);
        return str;
    }
}
