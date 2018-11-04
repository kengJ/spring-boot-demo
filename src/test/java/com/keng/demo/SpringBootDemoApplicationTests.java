package com.keng.demo;

import com.keng.demo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Test
    public void contextLoads() {
        System.out.print(person);
    }

}
