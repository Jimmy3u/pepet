package com.shelter.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shelter.pet.model.Pet;
import com.shelter.pet.repository.PetRepository;

public class PetService {
    @Autowired
    PetRepository petRepository;

    public List<Pet> findAll(){
       return this.petRepository.findAll();
    }

    public void addPet(Pet p){
        this.petRepository.save(p);
    }
}
