package com.wn.auth;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.auth
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 16:00
 * @Description:
 */
public class CookieUtil {

    public static void responseCookie(String key, String value, Integer time, HttpServletResponse response){
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(time);
        cookie.setDomain("bajin.com");
        cookie.setPath("/");
        response.addCookie(cookie);
    }
}
