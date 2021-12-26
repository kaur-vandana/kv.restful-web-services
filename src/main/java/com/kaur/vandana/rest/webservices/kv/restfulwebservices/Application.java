package com.kaur.vandana.rest.webservices.kv.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication as our primary application configuration class. Behind the scenes,
that's equivalent to @Configuration, @EnableAutoConfiguration, and @ComponentScan together.

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