package com.kaur.vandana.rest.webservices.kv.restfulwebservices.model;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("DynamicFilterId")
public class FilterFields {
    private String name;
    private String age;
    private String password;

    public FilterFields(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
