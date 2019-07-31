package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/sys")
public class LoginController {

    /*@RequestMapping("/login")
    public String login()
    {
        return "login";
    }*/

    @RequestMapping(value="/main")
//    @ResponseBody
    public String main(HttpServletRequest request)
    {
        Map map = new HashMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+" "+password);
        return "redirect:/aa.html";
    }

    @RequestMapping("/list")
    public String list()
    {
        return "user/list";
    }

}
