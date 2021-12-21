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

# @RequestMapping
- example : @RequestMapping(method = RequestMethod.GET, path = "/hello-world")

# @GetMapping
- example :  @GetMapping(path = "/hello-world") 







