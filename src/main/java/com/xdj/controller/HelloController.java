package com.xdj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xia
 * @date: 2024-08-17  12:43
 * @description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        String url = "欢迎光临我的个人博客：https://www.xdj666.top";
        return url;
    }
}
