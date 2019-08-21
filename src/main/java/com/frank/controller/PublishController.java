package com.frank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author:ZHIANGRONGCHUAN
 * @time：2019/8/1 0:07
 * @description:
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}
