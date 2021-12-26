package com.kaur.vandana.rest.webservices.kv.restfulwebservices.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;

    //configuring many-to-one relationship
    //unless you won't Post it won't try to fetch the user details
    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
