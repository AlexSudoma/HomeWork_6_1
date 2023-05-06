package com.example.homework_6_1;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("message")
    public String message(Model model) {
        model.addAttribute("message", "Привет, Thymeleaf!");
        return "x";
    }
}


