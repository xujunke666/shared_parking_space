package com.wn.user.back.web;


import com.wn.auth.CookieUtil;
import com.wn.auth.JWTUtil;
import com.wn.common.Const;
import com.wn.common.ServerResopnse;
import com.wn.common.pojo.User;
import com.wn.user.back.service.UserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.web
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 11:51
 * @Description:
 */
@RestController
public class UserController extends ServerResopnse {

    @Autowired
    private UserService userService;

    //后台用户登录
    @RequestMapping("login")
    public ServerResopnse login(User user, HttpServletResponse response){
        //对用户输入的密码进行加密处理
        Md5Hash md5Hash = new Md5Hash(user.getPassword(),"wn",5);
        String newPassword = md5Hash.toString();
        //将加密后的密码存到实体类中
        user.setPassword(newPassword);
        User login = userService.login(user);

        System.out.println(login+"~~~~~~~~~~~~~`");

        //判断login的值，如果是null表示数据库没查到，就是没有注册或是账号密码错误
        if (login == null){
            //给前端响应未登录的状态码
            return ServerResopnse.setResultError(Const.Mannager.LOGIN_STATUS_ERROR);
        }else {  //登录成功
            //把登录的信息存到token
            String token = JWTUtil.generateToken(login, 30,Const.RsaPath.PRIVATE_RSA_PATH);
            //将生产的token存到cookie中
              CookieUtil.responseCookie("token",token,1800,response);
            //登陆成功，给前端响应成功状态码,并且把角色信息响应给前端，在前端判断是哪个角色登录
            return setRestltSuccess(Const.Mannager.LOGIN_STATUS_SUCCESS,user);
        }
    }
}
