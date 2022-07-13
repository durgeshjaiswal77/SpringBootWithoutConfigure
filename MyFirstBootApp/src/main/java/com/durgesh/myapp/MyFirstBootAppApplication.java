package com.durgesh.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyFirstBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(MyFirstBootAppApplication.class, args);
	
		
		Person person=con.getBean(Person.class);
		//person.speak();
		person.eat();
	}

}
