package com.shelter.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model m){
        m.addAttribute("pageTitle", "Home");
        return "home";
    }

}
