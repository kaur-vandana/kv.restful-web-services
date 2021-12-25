package com.kaur.vandana.rest.webservices.kv.restfulwebservices.controller;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.versioning.Name;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.versioning.PersonV1;
import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.versioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

    //Versioning using URI
    @GetMapping("/v1/person")
    public PersonV1 versioningWithV1() {
        PersonV1 personV1 = new PersonV1("Jelly fish");
        return personV1;
    }

    /*@GetMapping("/v2/person")
    public PersonV2 sample2() {
        Name name = new Name("James","Bond");
        PersonV2 personV2 = new PersonV2(name);
        return personV2;
    }*/

    @GetMapping("/v2/person")
    public PersonV2 versioningWithV2() {
        PersonV2 personV2 = new PersonV2(new Name("James","Bond"));
        return personV2;
    }

    //Versioning using query parameters
    @GetMapping(value ="/person", params = "version=1")
    public PersonV1 versioningWithParam1() {
        PersonV1 personV1 = new PersonV1("Star fish");
        return personV1;
    }

    //Versioning using query parameters
    @GetMapping(value ="/person", params = "version=2")
    public PersonV2 versioningWithParam2() {
        PersonV2 personV2 = new PersonV2(new Name("Ravi","Kamaal"));
        return personV2;
    }

    //Versioning using headers
    @GetMapping(value ="/person", headers = "X-VERSION=1")
    public PersonV1 versioningWithHeader1() {
        PersonV1 personV1 = new PersonV1("Ria Khan");
        return personV1;
    }

    //Versioning using headers
    @GetMapping(value ="/person", headers = "X-VERSION=2")
    public PersonV2 versioningWithHeader2() {
        PersonV2 personV2 = new PersonV2(new Name("Vandana","Kaur"));
        return personV2;
    }

    //Versioning using produces
    @GetMapping(value = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 versioningWithProduces1() {
        PersonV1 personV1 = new PersonV1("Sushita gupta");
        return personV1;
    }

    //Versioning using produces
    @GetMapping(value ="/person",produces = "application/vnd.company.app-v2+json")
    public PersonV2 versioningWithProduces2() {
        PersonV2 personV2 = new PersonV2(new Name("Salmaan","Khan"));
        return personV2;
    }
}
