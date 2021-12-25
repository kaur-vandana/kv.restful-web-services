package com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.filtering;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"password","field2"})
public class StaticFilterFieldsWithJsonIgnoreProperties {
    private String name;

    private String field2;

    private String password;

    public StaticFilterFieldsWithJsonIgnoreProperties(String field1, String field2, String password) {
        this.name = field1;
        this.field2 = field2;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
