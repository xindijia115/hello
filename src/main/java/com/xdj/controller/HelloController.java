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
        // 为什么没有触发构建
        String url = "https://www.xdj666.top";
        int a = 1;
        int b = 2;
        int sum = a + b;
        return url + sum;
    }
}
