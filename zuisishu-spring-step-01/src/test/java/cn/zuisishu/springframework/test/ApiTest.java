package cn.zuisishu.springframework.test;

import cn.zuisishu.springframework.BeanDefinition;
import cn.zuisishu.springframework.MyBeanContainer;
import cn.zuisishu.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 作者：GuruYu https://github.com/1060460048/zuisishu-spring

https://github.com/1060460048/zuisishu-spring
https://github.com/code4craft/tiny-spring
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        MyBeanContainer beanFactory = new MyBeanContainer();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.register("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.print(userService);
        userService.queryUserInfo();
    }

}
