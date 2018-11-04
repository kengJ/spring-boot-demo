package com.keng.demo.config;

import com.keng.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: MyAppConfig
 * 自定义配置类
 * @Configuration 指明当前类是配置类
 * @author: keng
 * Date:     2018/11/4 21:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        //将方法的返回值添加到容器中，容器中这个组件的id就是方法名
        return new HelloService();
    }
}
