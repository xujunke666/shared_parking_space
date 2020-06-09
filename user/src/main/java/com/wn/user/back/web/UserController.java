package com.wn.user.back.web;


import com.wn.common.pojo.User;
import com.wn.user.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.web
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 11:51
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public User login(User user){
        User login = userService.login(user);
        return login;
    }


}
