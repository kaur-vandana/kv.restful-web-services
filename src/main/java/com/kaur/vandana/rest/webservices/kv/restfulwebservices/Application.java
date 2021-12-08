package com.kaur.vandana.rest.webservices.kv.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
A single @SpringBootApplication annotation can be used to enable those three features, that is:
@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism.
@ComponentScan: enable @Component scan on the package where the application is located.
@Configuration: allow to register extra beans in the context or import additional configuration classes.
*/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}