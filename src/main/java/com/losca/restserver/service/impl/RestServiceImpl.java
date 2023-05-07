package com.losca.restserver.service.impl;

import cn.hutool.core.util.StrUtil;
import com.losca.restserver.Vo.R;
import com.losca.restserver.mapper.RestMapper;
import com.losca.restserver.pojo.Rest;
import com.losca.restserver.service.RestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestServiceImpl implements RestService{
    @Resource
    RestMapper restMapper;
    @Override
    public R getRes(String data) {
        String[] split = data.split(",");
        List<String> collect = Arrays.stream(split).sorted().collect(Collectors.toList());
        String join = StrUtil.join(",", collect);
        Rest rest = new Rest();
        rest.setBegin(data);
        rest.setEnd(join);
        restMapper.insert(rest);
        return R.success(join);
    }

}
