package com.keng.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * FileName: EmployeeController
 * 员工控制器
 * @author: heyanzhu
 * Date:     2018/11/30 15:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EmployeeController {
    /**
     * 功能描述: <br>
     * 〈〉
     * 查询员工列表，返回列表页面
     * @return:
     * @since: 1.0.0
     * @Author:heyanzhu
     * @Date: 2018/11/30 15:27
     */
    @GetMapping("/emps1")
    public String list(){
        return "emp/list";
    }
}
