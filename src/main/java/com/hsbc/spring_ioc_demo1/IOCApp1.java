package com.hsbc.spring_ioc_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// Create the application context (container)-- this is the actuall IoC container
		//for using the ClassPath we nedd the file to be on the classpath, for this we need to create a resource folder
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");	
		
		//create the bean  - inyecting the bean instance
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		org.corporateSlogan();
		
		//close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
