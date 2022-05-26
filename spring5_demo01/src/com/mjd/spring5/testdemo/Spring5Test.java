package com.mjd.spring5.testdemo;
import com.mjd.spring5.Book;
import com.mjd.spring5.Orders;
import com.mjd.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author xiaohaoke
 */
public class Spring5Test {

    @Test
    public void testAdd()
    {
        //加载spring配置文件
        BeanFactory context =new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置文件的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }


    @Test
    public void testBook()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }


    @Test
    public void testOrders()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }

}
