package com.kaur.vandana.rest.webservices.kv.restfulwebservices.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.filtering.FilterFields;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.filtering.StaticFilterFieldsWithJsonIgnore;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.filtering.StaticFilterFieldsWithJsonIgnoreProperties;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilterController {

    @GetMapping("/nofiltering")
    public  FilterFields noFilterDemo() {
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

    //send only name and age
    @GetMapping("/dynamicfilter")
    public MappingJacksonValue filterDemo() {
        FilterFields filterFields = new FilterFields("name","age", "password");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","age");
        FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicFilterId",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(filterFields);
        mapping.setFilters(filters);
        return mapping;
    }

    @GetMapping("/dynamicfilter-list")
    public MappingJacksonValue filterListDemo() {
        List<FilterFields> filterFields = Arrays.asList(new FilterFields("name","age", "password"),
                new FilterFields("name 1","age 1", "password 1"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","age");
        FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicFilterId",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(filterFields);
        mapping.setFilters(filters);
        return mapping;
    }

    //send only password
    @GetMapping("/dynamicfilter-2")
    public MappingJacksonValue dynamicFilterDemo() {
        FilterFields filterFields = new FilterFields("name","age", "password");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("password");
        FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicFilterId",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(filterFields);
        mapping.setFilters(filters);
        return mapping;
    }
}
