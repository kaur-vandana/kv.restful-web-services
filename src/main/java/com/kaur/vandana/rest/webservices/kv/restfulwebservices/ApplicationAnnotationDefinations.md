
# @SpringBootApplication

Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define 
extra configuration on their "application class". 
A single @SpringBootApplication annotation can be used to enable those three features, that is:

1. @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism.
2. @ComponentScan: enable @Component scan on the package where the application is located.
3. @Configuration: allow to register extra beans in the context or import additional configuration classes.

# AutoConfiguration

Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies
that you have added. For example, if HSQLDB is on your classpath, and you have not manually configured any database 
connection beans, then Spring Boot auto-configures an in-memory database.

You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to
one of your @Configuration classes.

[Tip]
You should only ever add one @SpringBootApplication or @EnableAutoConfiguration annotation. 









