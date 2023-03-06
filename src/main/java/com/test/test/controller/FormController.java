package com.test.test.controller;

import com.test.test.entity.Users;
import com.test.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String userList(Model model){
        model.addAttribute("user", userService.getAllUser());
        return "users";
    }

    @GetMapping("/users/create")
    public String createUser(Model model){
        Users users = new Users();
        model.addAttribute("user", users);
        return "form";
    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") Users users){
        userService.saveUser(users);
        return "redirect:/users";
    }
    
}
