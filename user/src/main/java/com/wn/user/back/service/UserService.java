package com.wn.user.back.service;

import com.wn.common.pojo.User;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.service
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 11:46
 * @Description:
 */
public interface UserService {

    //用户后台登录
    public User login(User user);

}
