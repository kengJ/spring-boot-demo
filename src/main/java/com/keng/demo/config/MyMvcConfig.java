package com.keng.demo.config;

import com.keng.demo.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * FileName: MyMvcConfig
 *
 * @author: keng
 * Date:     2018/11/15 22:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/testsuccess").setViewName("success");
        registry.addViewController("/index.html").setViewName("login1");
    }

   /**@Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }**/
}
