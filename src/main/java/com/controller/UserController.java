package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.entiy.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    private String prefix = "user";

    @RequestMapping("getUserList")
    @ResponseBody
    public Map list()
    {
        Map mmap = new HashMap();
        List list = new ArrayList();
        User user1 = new User("1","name1",1);
        User user2 = new User("2","name2",2);
        list.add(user1);
        list.add(user2);
        mmap.put("msg","成功");
        mmap.put("code",0);
        mmap.put("date",JSONObject.parseArray(list.toString()));
        mmap.put("count",1);
        System.out.println(mmap);
        System.out.println("===========");

        return mmap;
    }

}
