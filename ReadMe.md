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

- Rest Api - Get, Post, Delete
- Exception handling
- HATEOAS
- Internationalization
- content Negotiation
- Api Documentation (Swagger)
- Actuator
- HAL Explorer
- Filtering - Static and dynamic
- Versioning - using - URI, query parameter, headers and produces
- Basic Authentication
- JPA 

------------------------------------------------------------------------------------------------------------------------
Hibernate: create table user (id integer not null, birth_date timestamp, name varchar(255), primary key (id))
------------------------------------------------------------------------------------------------------------------------