package com.mjt.service.intf;

import com.mjt.entity.User;
import com.mjt.vo.R;


import java.util.List;

/**
 * projectName:Kataba
 *
 * @author:马江涛
 * @Time: 2020/10/19  17:35
 * description:
 */
public interface UserService  {
    R<List<User>> all();
}
