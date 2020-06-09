package com.wn.auth;

import com.wn.common.RsaUtils;
import com.wn.common.pojo.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.joda.time.DateTime;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.auth
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-09 15:06
 * @Description:
 */
public class JWTUtil {
    //生成token
     public static String generateToken(User user,Integer time,String rsaPath){

         System.out.println(user+".......................");

         String token = "";
         try {
             token = Jwts.builder().claim("id", user.getId()).claim("account", user.getAccount()).claim("role", user.getRoleId())
                     .setExpiration(DateTime.now().plusMinutes(time).toDate())
                     .signWith(SignatureAlgorithm.RS256, RsaUtils.getPrivateKey(rsaPath))
                     .compact();
         }catch (Exception e){
             System.out.println("token生成失败");
         }
         return token;
     }

/*     //解析token
    public static User ParseToken(String rsaPath, String token){
        User user = null;
        try {
             Jws<Claims> claimsJws = Jwts.parser().setSigningKey(RsaUtils.getPublicKey(rsaPath)).parseClaimsJws(token);
            Claims body = claimsJws.getBody();
             //从荷载中通过键获取数据
             int id = Integer.parseInt(body.get("id").toString());
             String username = body.get("username").toString();
             int role = Integer.parseInt(body.get("role").toString());
             user = new User(id, username, role);
         }catch (Exception e){
            System.out.println("token解析失败");
         }
        return user;
    }*/

    public static void ParseToken(Integer loginStatusSuccess) {
    }
}
