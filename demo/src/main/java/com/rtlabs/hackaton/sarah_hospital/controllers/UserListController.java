package com.rtlabs.hackaton.sarah_hospital.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserListController {

    @ResponseBody
    @RequestMapping("/getUsers")
    public Object getAllUsers(){
        return null;
    }

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

}
