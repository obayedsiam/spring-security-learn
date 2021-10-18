package com.learn.springsecuritylearn.controller;

import com.learn.springsecuritylearn.model.User;
import com.learn.springsecuritylearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
   private UserService userService;

@GetMapping("/")
public List<User> getAll(){
    return this.userService.getAllUser();
}

@GetMapping("/{username}")
public User getUser(@PathVariable("username") String username){
    return this.userService.getUser(username);
}

@PostMapping("/")
public User add(@RequestBody User user){
    return this.userService.add(user);
}

}
