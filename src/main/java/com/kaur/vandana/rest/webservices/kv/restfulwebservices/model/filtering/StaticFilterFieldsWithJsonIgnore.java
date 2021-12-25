package com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StaticFilterFieldsWithJsonIgnore {
    private String name;

    private String age;

    @JsonIgnore
    private String password;

    public StaticFilterFieldsWithJsonIgnore(String field1, String field2, String field3) {
        this.name = field1;
        this.age = field2;
        this.password = field3;
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
