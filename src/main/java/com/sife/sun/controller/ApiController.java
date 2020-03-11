package com.sife.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class ApiController {

    @RequestMapping("hello")
    public String sayHello() {
        return "hello sun";
    }

}
