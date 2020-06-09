package com.wn.common;

/**
 * @BelongsProject: mallproj
 * @BelongsPackage: com.woniuxy.common
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-9 15:16
 * @Description:
 */
public interface Const {

    /**
     * 后端登录状态码
     */
    interface Mannager{
        Integer LOGIN_STATUS_ERROR = 1; //登陆失败
        Integer LOGIN_STATUS_SUCCESS = 0; //登录成功
        Integer ROLE_LOGIN_STATUS_ERROR = 10;
    }

    /**
     * 公钥私钥地址
     */
    interface RsaPath{
        String PRIVATE_RSA_PATH = "D:\\IDEA\\rsa\\rsa.pri";
        String PUBLIC_RSA_PATH = "D:\\IDEA\\rsa\\rsa.pub";
    }
}
