package rao.spring;

import java.beans.beancontext.BeanContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import rao.spring.Triangle;

/**
 * 
 * @author Rao
 * 
 */
public class SpringStartUp {

	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		System.out.println(context.getBean("pointC"));
		triangle.draw();
	}
	
	void myMethod(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		System.out.println(context.getBean("pointC"));
		triangle.draw();
	}
}
