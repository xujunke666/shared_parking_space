package com.wn.user.back.service.impl;

import com.wn.common.pojo.User;
import com.wn.user.back.mapper.UserMapper;
import com.wn.user.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.service.impl
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 11:47
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //后台用户登录
    @Override
    public User login(User user) {
        User login = userMapper.login(user);
        return login;
    }
}
