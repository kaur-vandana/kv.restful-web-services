package com.kaur.vandana.rest.webservices.kv.restfulwebservices.controller;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.dao.UserDaoService;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.exception.UserNotFoundException;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    //spring creates an instance of UserDaoService and autowires it
    @Autowired
    private UserDaoService service;

//    GET      /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

/*//   GET       /users/{id}
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findUserById(id);
        if(user == null)
            throw new UserNotFoundException("id" + id);
        return user;
    }*/

    //   GET       /users/{id}
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {
        User user = service.findUserById(id);
        if(user == null)
            throw new UserNotFoundException("id" + id);

        EntityModel<User> model = EntityModel.of(user);
        WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));
        return model;
    }

    //   DELETE       /users/{id}
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id) {
        User user = service.deleteUserById(id);
        if(user == null)
            throw new UserNotFoundException("id" + id);
        return user;
    }

//    input - details of user
//    output - CREATED & Return the created URI
//    @RequestBody maps the body of the request to the User user
//    @Valid - Marks a property, method parameter or method return type for validation cascading.
//    binding validation to method argument
    @PostMapping("/users")
    public  ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);
//        return status code - 201 created

//        adding /{id} to /users ----/users/{id}
//        fetching id from the savedUser
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
