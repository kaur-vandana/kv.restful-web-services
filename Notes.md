# AutoConfiguration

Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies
that you have added. For example, if HSQLDB is on your classpath, and you have not manually configured any database
connection beans, then Spring Boot auto-configures an in-memory database.

You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to
one of your @Configuration classes.

[Tip]
You should only ever add one @SpringBootApplication or @EnableAutoConfiguration annotation.

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

# REST
REpresentational State Transfer, REST is a style of software architecture for distributed hypermedia systems
- REST is just a style of how you design your resources and how you expose them using HTTP.
- REST aims to make best use of HTTP

Each resource would have an URI - Uniform Resources Identifier
we can have different representations for each resource.

example :

- POST     /users            -- create a user
- GET      /users            -- retrieves all users
- GET      /users/{id}       -- retrieve a user
- DELETE   /users/{id}       -- delete a user

- GET     /users/{id}/posts               -- retrieve all posts for a user
- POST    /users/{id}/posts               -- create posts for a user
- GET     /users/{id}/posts/{post_id}     -- retrieve details of a post

### @RequestMapping
- example : @RequestMapping(method = RequestMethod.GET, path = "/hello-world")

### @GetMapping
- example :  @GetMapping(path = "/hello-world")

### @RestController




------------------------------------------------------------------------------------------------------------------------
- What is dispatcher servlet?
- Who is configuring dispatcher servlet?
- What does dispatcher servlet do?
- How does the HelloWorldBean object get converted to JSON?


- Mapping servlet: 'dispatcherServlet' to [/]
- Mapped "{[/hello-world],methods=[GET]}" onto HelloWorldBean
- Mapped "{[/error]}" onto
- Mapped "{[/error]},produces=[text/html]" onto
