package com.cjj.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping("/test")
@RequestMapping("/test")
public class UserController {

//    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    @RequestMapping("/test")
    public String save(){
        System.out.println("Controller save running!");
        return "success";
    }
    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","jie");
        return "success";
    }
    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","jun");
        return "success";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.setViewName("success");
        modelAndView.addObject("username","chen");
        return modelAndView;
    }
    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","cjj");
        modelAndView.setViewName("success");
        return modelAndView;
    }
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public String test(HttpServletRequest request, HttpServletResponse response, String username){
//        System.out.println("Controller test running!");
//        return "success";
//    }
}
