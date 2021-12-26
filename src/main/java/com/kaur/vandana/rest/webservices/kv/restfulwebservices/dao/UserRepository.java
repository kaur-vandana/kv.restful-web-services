package com.kaur.vandana.rest.webservices.kv.restfulwebservices.dao;

import com.kaur.vandana.rest.webservices.kv.restfulwebservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //JpaRepository<EntityName, primary Key is of Integer type>
}
