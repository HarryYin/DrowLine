package com.harry.scm.test;

import com.harry.scm.entity.Emp;
import com.harry.scm.test.service.IEmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by harry on 2017/7/27.
 */
public class TestEmpService {
    @Test
    public void testTrasaction(){
        Emp emp=new Emp();
        emp.setName("123");

        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IEmpService service=ctx.getBean(IEmpService.class);
        service.insertEmp(emp);
    }
}
