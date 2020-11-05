package com.technosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstBootAppApplication.class, args);
		
		Student s=context.getBean(Student.class);
		System.out.println(s.hashCode());
		
		s.show();
		
		Student s1=context.getBean(Student.class);
		System.out.println(s1.hashCode());
		s1.show();
	
	}

}
