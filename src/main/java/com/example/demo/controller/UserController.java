package com.example.demo.controller;

import com.example.demo.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    String main() {
        return "main";
    }

    @PostMapping("/add")
    @ResponseBody
    void addUser(UserForm userForm) {
        System.out.println(userForm);
    }
}
