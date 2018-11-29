package com.keng.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName: LoginController
 * 登陆操作
 * @author: heyanzhu
 * Date:     2018/11/28 14:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Controller
public class LoginController {
    @PostMapping(value = "/login")
    public ModelAndView login(@RequestParam("username") String UserName, @RequestParam("password") String Password,HttpSession session){
        ModelAndView mv  = new ModelAndView();
        if(!StringUtils.isEmpty(UserName) && "admin".equals(UserName) && "admin".equals(Password)) {
            session.setAttribute("loginUser",UserName);
            mv.setViewName("redirect:/main.html");
            //return "redirect:/main.html";
        }else{
            mv.setViewName("login");
            mv.addObject("msg","用户密码错误");
            //map.put("msg","用户密码错误");
            //return "redirect:/index.html";
        }
        return mv;
    }

    @GetMapping("/personIndex")
    public String index(){
        return "personIndex";
    }
}
