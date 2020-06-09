package com.wn.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @BelongsProject: shared_parking_space
 * @BelongsPackage: com.wn.user.pojo
 * @Author: 廖刚
 * @CreateTime: 2020-06-09 11:31
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String account;
    private String password;
    private String realName;
    private String tel;
    private Integer code;
    private Integer roleId;
    private Integer creditValue;
    private Double money;
    private String payAccount;
    private Date createtime;
    private Date updatetime;

}
