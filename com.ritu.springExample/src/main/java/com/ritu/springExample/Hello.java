package com.ritu.springExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Hello {
public static void main(String[] args) {
	ApplicationContext Ritu=new ClassPathXmlApplicationContext("applicationContext.xml");
 HelloService sc=(HelloService) Ritu.getBean("name");
 sc.hii();
}
}
