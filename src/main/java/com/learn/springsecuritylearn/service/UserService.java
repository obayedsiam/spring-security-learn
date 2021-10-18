package com.learn.springsecuritylearn.service;

import com.learn.springsecuritylearn.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> arrayList = new ArrayList<>();

    public UserService() {
        arrayList.add(new User("Rahim", "123","rahim@gmail.com"));
        arrayList.add(new User("Karim", "abc","karim@gmail.com"));
        arrayList.add(new User("Jamal", "xyz","jamal@gmail.com"));
    }

    public List<User> getAllUser() {
        return this.arrayList;
    }

    public User getUser(String username){
        return this.arrayList.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User add(User user){
        arrayList.add(user);
        return user;
    }
}
