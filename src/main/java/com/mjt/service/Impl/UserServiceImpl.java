package com.mjt.service.Impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mjt.dao.UserDao;
import com.mjt.entity.User;
import com.mjt.service.intf.UserService;
import com.mjt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * projectName: Kataba
 *
 * @author: 马江涛
 * time:2020/10/19  17:35
 * desription:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public R<List<User>> all() {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        List<User> userList = userDao.selectList(qw);
        return R.ok(userList);
    }
}