package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Users;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Users> users = userService.findAll();
        mv.addObject("userList",users);
        mv.setViewName("user-list");

        return mv;

    }
    @RequestMapping("/save.do")
    public String save(Users users){
        userService.save(users);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();
        Users users = userService.findById(id);
      //  System.out.println("-==-=-=-=-==-+_+_+_+_+_+_+_+_+_"+users);
        mv.setViewName("user-show1");
        mv.addObject("user",users);
        return mv;

    }

}
