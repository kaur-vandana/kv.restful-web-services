package com.kaur.vandana.rest.webservices.kv.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//you need to tell spring that this is a controller
@RestController
public class HelloWorldController {

    //method - GET
    //URI - /hello-world
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        //return a simple string "Hello World"
        return "Hello World! ";
    }

    //method will return a bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("This is Hello World Bean.");
    }
}
