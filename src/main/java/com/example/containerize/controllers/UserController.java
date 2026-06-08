package com.example.containerize.controllers;

import com.example.containerize.User;
import com.example.containerize.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;
    @GetMapping("/get-user-name")
    public List<User> getUserName(@RequestParam(required = false, defaultValue = "Sri") String name){
       return userRepo.findAll();
    }
}
