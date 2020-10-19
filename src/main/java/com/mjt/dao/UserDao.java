package com.mjt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.mjt.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName:Kataba
 *
 * @author:马江涛
 * @Time: 2020/10/19  17:22
 * description:
 */
@Repository
public interface UserDao extends BaseMapper<User> {

}
