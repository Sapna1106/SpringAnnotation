package com.spring.skype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.skype.controller.ActionController;

@SpringBootApplication
public class SkypeApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SkypeApplication.class, args);
		ActionController pizzaController = (ActionController)context.getBean("action");
		System.out.println(pizzaController.getAction());
		
			
	}

}
