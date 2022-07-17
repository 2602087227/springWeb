package com.cjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test")
public class UserController {

    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running!");
        return "success";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request, HttpServletResponse response, String username){
        System.out.println("Controller test running!");
        return "success";
    }
}
