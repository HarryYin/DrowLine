package com.harry.scm.test.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by harry on 2017/7/27.
 */
public class SpringContext {
    static ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    public static Object getBean(String clazz){
        return ctx.getBean(clazz);
    }
    public static <T> T getBean(Class<T> clazz){
        return ctx.getBean(clazz);
    }
}
