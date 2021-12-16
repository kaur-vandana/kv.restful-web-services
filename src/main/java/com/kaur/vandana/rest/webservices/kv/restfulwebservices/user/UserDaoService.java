package com.kaur.vandana.rest.webservices.kv.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// we can also use @Repository , as it is talking to the repository
@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount =3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Smith", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    // return list of users
    public List<User> findAll() {
        return users;
    }

    //save the user to database
    public void save(User user) {
        if(user.getId()==null) {
            user.setId(++usersCount);
        }
        users.add(user);
    }

    //find User if its id is present in the list
    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
