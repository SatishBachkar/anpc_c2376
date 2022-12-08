package com.spring.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.spring.SpringEx.entity.Company;

public class App {
	@SuppressWarnings({"resource","deprecation"})
	
    public static void main( String[] args ){
		
      ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Resource resource = ClassPathResource("appplicationContext.xml");
       Company com = (Company)c.getBean("comp");
       com.display1();
    }
}
