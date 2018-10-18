package com.study.springbean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		assertEquals("testStr", bean.getTestStr());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testApplicationLoad() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		MyTestBean bean = (MyTestBean) ac.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		assertEquals("testStr", bean.getTestStr());
	}
}
