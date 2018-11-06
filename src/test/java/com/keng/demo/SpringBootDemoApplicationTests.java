package com.keng.demo;

import com.keng.demo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot 单元测试
 * @RunWith(SpringRunner.class) 表示用spring boot的单元测试器去进行测试，而不用junit
 * 可以在测试期间很方便的类似编码一样进行自动注入容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Autowired
    Person person;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        System.out.print(person);
    }

    public void logTest(){
        // 日志的级别，由低到高
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
    }
}
