package com.wn.user.back.mapper;

import com.wn.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.mapper
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 11:44
 * @Description:
 */

public interface UserMapper {

    //用户后台登录
    public User login(User user);

}
