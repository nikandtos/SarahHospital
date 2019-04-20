package com.rtlabs.hackaton.sarah_hospital.services;

import com.rtlabs.hackaton.sarah_hospital.dao.UserDao;
import com.rtlabs.hackaton.sarah_hospital.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return new ArrayList<>(userDao.getAllUsers());
    }

}
