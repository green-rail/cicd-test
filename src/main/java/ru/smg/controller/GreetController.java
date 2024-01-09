package ru.smg.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/hello")
    public String greet(ModelMap model) {
        return "commit 1";
    }
}
