package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("employee.xml");
		SBU sbu= (SBU) factory.getBean("sbu");
		System.out.println("SBU details");
		System.out.println("........................");
		System.out.println(sbu);
	
  
	}

}
