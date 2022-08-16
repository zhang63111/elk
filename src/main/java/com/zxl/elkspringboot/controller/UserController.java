package com.zxl.elkspringboot.controller;

import cn.hutool.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "getMessage",method= RequestMethod.GET)
    public JSONObject getMessage(){
        JSONObject result=new JSONObject();
        result.putOpt("messge","OK");
        return  result;

    }
}
