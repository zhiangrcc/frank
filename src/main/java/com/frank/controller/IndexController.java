package com.frank.controller;

import com.frank.mapper.UserMapper;
import com.frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/")
    public String index(HttpServletRequest request){
        System.out.println("Welcome");
        Cookie[] cookies = request.getCookies();
        String token = null;
        for(Cookie cookie : cookies){
            if("token".equals(cookie.getName())){
                token = cookie.getValue();
                break;
            }
        }
        User user =userMapper.findUserByToken(token);
        if (user!= null){
            request.getSession().setAttribute("user",user);
        }
        return "index";
    }
}
