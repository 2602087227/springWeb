package com.cjj.controller;

import com.cjj.domain.User;
import com.cjj.domain.Vo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @RequestMapping("/quick23")
    @ResponseBody
    public void save23(@CookieValue(value = "JSESSIONID")String jse){
        System.out.println(jse);
    }
    @RequestMapping("/quick22")
    @ResponseBody
    public void save22(@RequestHeader(value = "Cookie")String userAgent){
        System.out.println(userAgent);
    }

    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }
    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(Date date) throws IOException{
        System.out.println(date);
    }

    @RequestMapping("/quick19/{username}")
    @ResponseBody
    public void save19(@PathVariable(value = "username",required = true)String name){
        System.out.println(name);
    }
    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(@RequestParam(value = "username",required = false,defaultValue = "chenjunjie")String name){
        System.out.println(name);
    }

    @RequestMapping("/quick17")
    @ResponseBody
    public void save17(@RequestBody List<User> userList){
        System.out.println(userList);
    }
    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(Vo vo){
        System.out.println(vo);
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public List<String> save12(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.get(2));
        return list;
    }

    @RequestMapping("/quick11")
    @ResponseBody
    public List<String> save11(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.get(2));
        return list;
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10(){
        User user = new User();
        user.setName("wangwu");
        user.setAge(18);
        return user;
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setName("lisi");
        user.setAge(18);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8(){
        return "{\"username\":\"zzz\",\"age\":18}";
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public String save7(){
        return "hao!";
    }

    @RequestMapping("/quick6")
        public void save6(HttpServletResponse response) throws IOException {
            response.getWriter().println("ni");
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
