package com.keng.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * FileName: HelloController
 * hello
 * @author: keng
 * Date:     2018/11/4 15:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String ,Object> map){
        map.put("lion","hello");
        return "success";
    }
}
