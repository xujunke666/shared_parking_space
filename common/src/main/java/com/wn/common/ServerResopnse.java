package com.wn.common;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: mallproj
 * @BelongsPackage: com.woniuxy.common
 * @Author: 徐俊柯
 * @CreateTime: 2020-06-9 15:08
 * @Description:
 */

@Data
public class ServerResopnse<T> {
    private Integer status;
    private T data;

    public ServerResopnse(Integer status) {
        this.status = status;
    }

    public ServerResopnse(T data) {
        this.data = data;
    }


    public ServerResopnse(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public ServerResopnse() {
    }

    public static ServerResopnse setResultError(Integer status){
        return new ServerResopnse(status);
    }

    public ServerResopnse setRestltSuccess(Integer status){
        return new ServerResopnse(status);
    }

    public ServerResopnse setRestltSuccess(Integer status,T data){
        return new ServerResopnse<T>(status,data);
    }

}
