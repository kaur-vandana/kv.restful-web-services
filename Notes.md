# AutoConfiguration

Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies
that you have added. For example, if HSQLDB is on your classpath, and you have not manually configured any database
connection beans, then Spring Boot auto-configures an in-memory database.

You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to
one of your @Configuration classes.

[Tip]
You should only ever add one @SpringBootApplication or @EnableAutoConfiguration annotation.

# @RestController


# @Component
@Component is an annotation that allows Spring to automatically detect our custom beans.

In other words, without having to write any explicit code, Spring will:

Scan our application for classes annotated with @Component
Instantiate them and inject any specified dependencies into them
Inject them wherever needed

# @Valid
Marks a property, method parameter or method return type for validation cascading.
Constraints defined on the object and its properties are be validated when the property, 
method parameter or method return type is validated.
