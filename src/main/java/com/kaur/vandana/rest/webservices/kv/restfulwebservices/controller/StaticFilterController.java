package com.kaur.vandana.rest.webservices.kv.restfulwebservices.controller;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.FilterFields;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.StaticFilterFieldsWithJsonIgnore;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.StaticFilterFieldsWithJsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFilterController {

    @GetMapping("/nofiltering")
    public  FilterFields filterDemo() {
        return new FilterFields("name","age", "password");
    }

    @GetMapping("/nofiltering-list")
    public List<FilterFields> filterList() {
        return Arrays.asList(new FilterFields("name","age", "password"),
                new FilterFields("name 2","age 2", "password 2"));
    }

    @GetMapping("/staticfilteringwithJsonIgnore")
    public StaticFilterFieldsWithJsonIgnore filterDemo1() {
        return new StaticFilterFieldsWithJsonIgnore("name","age", "password");
    }

    @GetMapping("/staticfilteringwithJsonIgnoreProperties")
    public StaticFilterFieldsWithJsonIgnoreProperties filterDemo2() {
        return new StaticFilterFieldsWithJsonIgnoreProperties("name","age", "password");
    }
}
