package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kasio
 * @create 2022-01-02 16:11
 */
public class TestAop {

    @Test
    public void testAopAnno() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
