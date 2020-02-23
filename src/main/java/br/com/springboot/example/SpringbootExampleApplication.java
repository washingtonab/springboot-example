package br.com.springboot.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootExampleApplication implements CommandLineRunner {

	@Autowired
	private MyComponent myComponent;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myComponent.hello();
	}
}
