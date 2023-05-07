package com.losca.restserver.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Rest {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String begin;
    private String end;
}
