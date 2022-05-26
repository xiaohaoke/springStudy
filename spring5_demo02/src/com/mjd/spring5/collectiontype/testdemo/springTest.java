package com.mjd.spring5.collectiontype.testdemo;

import com.mjd.spring5.collectiontype.Stu;
import com.mjd.spring5.collectiontype.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class springTest {

    @Test
    public  void testController()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }


    @Test
    public  void testController2()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        book book = context.getBean("book", book.class);
        book.test();
    }
}
