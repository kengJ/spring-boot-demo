package com.keng.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    @PostMapping(value = "/login")
    public Map<String,Object> login(@RequestParam("username") String UserName, @RequestParam("password") String Password, Map<String,Object> map){
        Map<String,Object> resilt = new HashMap<>(2);
        if(!StringUtils.isEmpty(UserName) && "admin".equals(UserName)) {
            resilt.put("code",1);
            resilt.put("data","/personIndex");
        }else{
            resilt.put("code",0);
            resilt.put("data","用户密码错误");
        }
        return resilt;
    }

    @GetMapping("/personIndex")
    public String index(){
        return "personIndex";
    }
}
