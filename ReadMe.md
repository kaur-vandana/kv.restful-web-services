# RESTful Web Services with Spring and Spring Boot

### Topics Covered
1. Develop and design RESTful web services with Spring Boot
2. How to design Resources and GET, POST and DELETE operations?
3. How to version your RESTful Web Services
4. How to document RESTful Web Services with Swagger
5. How to use Postman to execute RESTful Service Requests?
6. How to monitor RESTful Services with Spring Boot Actuator
7. IMPLEMENT Exception Handling
8. IMPLEMENT Validation 
9. IMPLEMENT HATEOAS 
10. IMPLEMENT filtering for RESTful Web Services.
11. How to implement basic authentication with Spring Security? 
12. How to connect RESTful Services to a backend with JPA?
13. The best practices in designing RESTful web services

------------------------------------------------------------------------------------------------------------------------
# Useful Links

### Swagger UI :  
http://localhost:8080/swagger-ui/index.html

### OpenAPI definition :  
http://localhost:8080/v3/api-docs

### Actuator
http://localhost:8080/actuator 

### HAL Explorer
http://localhost:8080/explorer/index.html#
- example :
  - http://localhost:8080/explorer/index.html#uri=/actuator
  - http://localhost:8080/explorer/index.html#uri=/users 

### h2 console
http://localhost:8080/h2-console
verify & connect
- jdbc url =jdbc:h2:mem:testdb
- username=sa
- password=password
type query & Run
- "select * from user"
- "select * from post"

### Postman
- Download and install latest postman :  http://www.getpostman.com and 
- import the postman collection given in the repo

------------------------------------------------------------------------------------------------------------------------
### reference

- Learn Spring Boot
  - https://www.baeldung.com/spring-boot

- Rest Api - Get, Post, Delete
  - https://www.baeldung.com/exception-handling-for-rest-with-spring
  
- Jackson Ignore Properties on Marshalling : 
  - https://www.baeldung.com/jackson-ignore-properties-on-serialization

- Exception handling
  - https://www.baeldung.com/exception-handling-for-rest-with-spring

- Validation in Spring Boot
  - https://www.baeldung.com/spring-boot-bean-validation

- HATEOAS
  - https://www.baeldung.com/spring-hateoas-tutorial 

- Internationalization
  - https://www.baeldung.com/spring-boot-internationalization

- content Negotiation
  - https://www.baeldung.com/jackson-xml-serialization-and-deserialization 

- Api Documentation (Swagger) - Documenting a Spring REST API Using OpenAPI 3.0
  - https://www.baeldung.com/spring-rest-openapi-documentation
  - https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
  
- Actuator
  - Production-ready Features : https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html
  
- HAL Explorer
  - https://www.baeldung.com/spring-rest-hal

- Filtering - Static and dynamic
  - https://www.baeldung.com/jackson-serialize-field-custom-criteria

- Versioning - using - URI, query parameter, headers and produces
  - https://www.baeldung.com/rest-versioning
  
- Basic Authentication

- JPA, Hibernate
  - Spring Boot With H2 Database : https://www.baeldung.com/spring-boot-h2-database
  - Spring Boot with Hibernate : https://www.baeldung.com/spring-boot-hibernate
  - Spring BeanCreationException : https://www.baeldung.com/spring-beancreationexception

------------------------------------------------------------------------------------------------------------------------
# Hibernate:

### Table Structure

create table user (
id integer not null,
birth_date timestamp,
name varchar(255),
primary key (id)
);

create table post (
id integer not null,
description varchar(255),
user_id integer,
primary key (id)
);

alter table post
add constraint post_to_user_foreign_key
foreign key (user_id) references user;

------------------------------------------------------------------------------------------------------------------------