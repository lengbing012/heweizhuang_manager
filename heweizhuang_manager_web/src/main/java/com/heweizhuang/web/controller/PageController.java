package com.heweizhuang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: heweizhuang
 * @CreateDate: 2020-04-21 14:01
 * @Description: com.heweizhuang.web.controller
 * @Version: 1.0
 */

@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }
}
