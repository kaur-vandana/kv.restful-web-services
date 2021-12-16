package com.kaur.vandana.rest.webservices.kv.restfulwebservices.helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    /*Whitelabel Error Page
    occurs if you forget to getters, setters*/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
