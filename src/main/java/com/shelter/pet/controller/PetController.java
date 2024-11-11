package com.shelter.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shelter.pet.model.Pet;
import com.shelter.pet.records.PetRecord;
import com.shelter.pet.service.PetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public String returnPetList(Model model) {
        List<PetRecord> petListing = petService.findAllSimple();
        model.addAttribute("petList", petListing);
        model.addAttribute("pageTitle", "Pet List");
        return "pet-listing";
    }

    @GetMapping("/{id}")
    public String returnSinglePet(@PathVariable("id") Long petId, Model model) {
        Pet p = petService.getPetByID(petId);
        model.addAttribute("pet", p);
        return "pet-page";
    }

}
