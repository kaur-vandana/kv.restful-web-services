### Swagger UI :  
http://localhost:8080/swagger-ui/index.html
### OpenAPI definition :  
http://localhost:8080/v3/api-docs

### Actuator
http://localhost:8080/actuator 

### HAL Explorer
http://localhost:8080/explorer/index.html#
example :
http://localhost:8080/explorer/index.html#uri=/actuator
http://localhost:8080/explorer/index.html#uri=/users 

### h2 console
http://localhost:8080/h2-console

verify & connect
jdbc url =jdbc:h2:mem:testdb
username=sa
password=password

type query "select * from user" & Run

------------------------------------------------------------------------------------------------------------------------
### Topics Covered
- Learn Spring Boot
  - https://www.baeldung.com/spring-boot

- Rest Api - Get, Post, Delete
  - https://www.baeldung.com/exception-handling-for-rest-with-spring
  
- Jackson Ignore Properties on Marshalling : 
  - https://www.baeldung.com/jackson-ignore-properties-on-serialization

- Exception handling
  - https://www.baeldung.com/exception-handling-for-rest-with-spring

- HATEOAS

- Internationalization

- content Negotiation

- Api Documentation (Swagger) - Documenting a Spring REST API Using OpenAPI 3.0
  - https://www.baeldung.com/spring-rest-openapi-documentation
  - https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
  
- Actuator
  - Production-ready Features : https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html
  
- HAL Explorer

- Filtering - Static and dynamic

- Versioning - using - URI, query parameter, headers and produces
  - https://www.baeldung.com/rest-versioning
  
- Basic Authentication

- JPA 
  - Spring Boot With H2 Database : https://www.baeldung.com/spring-boot-h2-database
  - Spring Boot with Hibernate : https://www.baeldung.com/spring-boot-hibernate
  - Spring BeanCreationException : https://www.baeldung.com/spring-beancreationexception

------------------------------------------------------------------------------------------------------------------------
Hibernate: create table user (id integer not null, birth_date timestamp, name varchar(255), primary key (id))
------------------------------------------------------------------------------------------------------------------------