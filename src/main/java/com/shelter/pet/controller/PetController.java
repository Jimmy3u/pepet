package com.shelter.pet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shelter.pet.DTO.SimplePetDTO;
import com.shelter.pet.model.Pet;
import com.shelter.pet.service.PetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @ModelAttribute("allPets")
    public List<SimplePetDTO> allPets(){
        return petService.findAllSimple();
    }

    @GetMapping("")
    public String pets(final Pet pet) {
        return "pets";
    }
    
    @GetMapping("/{id}")
    public String getSinglePet(@PathVariable("id") Long petId, Model model) {
        Pet pet= petService.getPetByID(petId);
        model.addAttribute("pet", pet);

        return "pet-page";
    }
    
}
