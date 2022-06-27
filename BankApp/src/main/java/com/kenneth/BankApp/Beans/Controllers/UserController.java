package com.kenneth.BankApp.Beans.Controllers;

import com.kenneth.BankApp.Beans.Service.UserService;
import com.kenneth.BankApp.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

}
