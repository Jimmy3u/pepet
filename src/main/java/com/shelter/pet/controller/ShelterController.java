package com.shelter.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shelter.pet.service.ShelterService;


@Controller
@RequestMapping("/shelters")
public class ShelterController {
    @Autowired
    ShelterService shelterService;

    @GetMapping
    public String returnShelterList(Model model) {
        model.addAttribute("shelterList", shelterService.findAll());
        return "shelter-list";
    }
    
    @GetMapping("/{id}")
    public String returnSingleShelter(@RequestParam String param) {
        return new String();
    }
    
}
