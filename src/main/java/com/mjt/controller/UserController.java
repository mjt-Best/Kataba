package com.mjt.controller;

import com.mjt.service.intf.UserService;
import com.mjt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: Kataba
 *
 * @author: 马江涛
 * time:2020/10/19  17:11
 * desription:用户总之层
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("all.do")
    public R all(){
        return userService.all();
    }
}