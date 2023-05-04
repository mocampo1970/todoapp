package com.mauricio.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Notas: para quitar el no usages que sale en muchos metodos y campos se va por
//		  setting - edito - inlay hints - code vision y usages no deschuleo

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

}
