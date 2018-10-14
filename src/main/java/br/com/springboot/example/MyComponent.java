package br.com.springboot.example;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@PostConstruct
	public void init() {
		hello();
	}

	public void hello() {
		System.out.println("hello my friend");
	}
	
}
