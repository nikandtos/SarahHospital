package com.rtlabs.hackaton.sarah_hospital.dao;

import com.rtlabs.hackaton.sarah_hospital.entities.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    private Map<String, User> database;

    public UserDao() {
        this.database = new HashMap<>();
        this.database.put("admin", new User("admin", "admin"));
    }

    public void addUser(User value) {
        database.put(value.getId(), value);
    }

    public User getById(String id) {
        return database.get(id);
    }

    public Collection<User> getAllUsers() {
        return database.values();
    }

}
