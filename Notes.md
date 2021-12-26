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

------------------------------------------------------------------------------------------------------------------------
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


------------------------------------------------------------------------------------------------------------------------
### RESPONSE STATUS

1. 200 - SUCCESS
2. 404 - REQUEST NOT FOUND
3. 400 - BAD REQUEST
4. 201 - CREATED
5. 401 - UNAUTHORIZED
6. 500 - SERVER ERROR

------------------------------------------------------------------------------------------------------------------------
### Richardson Maturity Model

LEVEL 0 - Expose SOAP web services in REST style

- http://server/{action}
- http://server/getPosts
- http://server/deletePosts

LEVEL 1 - Expose RESOURCEs with proper URI

- http://server/accounts
- http://server/accounts/10

LEVEL 2 - LEVEL 1 + proper use of HTTP methods
 
- GET http://server/accounts
- POST http://server/accounts
- DELETE http://server/accounts/10

LEVEL 3 - LEVEL 2 + HATEOAS
DATA + next possible action (example using links)

------------------------------------------------------------------------------------------------------------------------
### BEST PRACTICES

1. Consumer First 
(who your consumer are? is it a web app or mobile app? 
what is the requirement? what is your customers need? 
will they will be understand the resources naming?)
2. API documentation (example with Swagger)
3. Make best use of HTTP, request methods and ensure you are sending a proper response back
4. Ensure there is no secure info in your URI
5. Always use plurals example /users
6. Use nouns for resources (example /users) and for any exceptions define a consistent approach (example /search)

------------------------------------------------------------------------------------------------------------------------

- What is dispatcher servlet?
- Who is configuring dispatcher servlet?
- What does dispatcher servlet do?
- How does the HelloWorldBean object get converted to JSON?


- Mapping servlet: 'dispatcherServlet' to [/]
- Mapped "{[/hello-world],methods=[GET]}" onto HelloWorldBean
- Mapped "{[/error]}" onto
- Mapped "{[/error]},produces=[text/html]" onto

------------------------------------------------------------------------------------------------------------------------