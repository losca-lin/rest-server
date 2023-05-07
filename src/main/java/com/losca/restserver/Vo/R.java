package com.losca.restserver.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private Integer code;
    private Object data;

    public static R success(Object data){
        return new R(200, data);
    }

    public static R fail(){
        return new R(-1, "发生错误");
    }
}
