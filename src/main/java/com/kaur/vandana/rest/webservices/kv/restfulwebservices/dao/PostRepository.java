package com.kaur.vandana.rest.webservices.kv.restfulwebservices.dao;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    //JpaRepository<EntityName, primary Key is of Integer type>
}
