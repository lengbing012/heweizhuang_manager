package com.heweizhuang.pojo;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-20 8:38
 * @Description: com.heweizhuang.pojo
 * @Version: 1.0
 */

//用户实体
public class Users {

    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
