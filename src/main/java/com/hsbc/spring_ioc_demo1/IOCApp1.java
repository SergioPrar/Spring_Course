package com.hsbc.spring_ioc_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// Create the application context (container)-- this is the actuall IoC container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");	
		
		//create the bean  - inyecting the bean instance
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		org.corporateSlogan();
		
		//close the application context
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
