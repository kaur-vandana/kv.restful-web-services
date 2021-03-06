package com.kaur.vandana.rest.webservices.kv.restfulwebservices.controller;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//you need to tell spring that this is a controller
@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

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

    //hello-world/path-variable/Vandana
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message", null, "i am default message", locale);
    }
}
