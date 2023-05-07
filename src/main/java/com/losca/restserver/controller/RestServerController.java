package com.losca.restserver.controller;

import com.losca.restserver.Vo.R;
import com.losca.restserver.service.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RestServerController {
    @Resource
    RestService restService;
    @GetMapping("/getRes")
    public R getRes(@RequestParam("data")String data){
        return restService.getRes(data);
    }
}
