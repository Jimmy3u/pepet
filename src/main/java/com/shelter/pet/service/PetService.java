package com.shelter.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shelter.pet.DTO.SimplePetDTO;
import com.shelter.pet.handler.PetNotFoundException;
import com.shelter.pet.model.Pet;
import com.shelter.pet.repository.PetRepository;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public List<Pet> findAll() {
        return this.petRepository.findAll();
    }

    public void addPet(Pet p) {
        this.petRepository.save(p);
    }

    public List<SimplePetDTO> findAllSimple() {
        return this.petRepository.findAllSimple();
    }

    public Pet getPetByID(Long id) {
        return petRepository.findById(id).orElseThrow(() -> new PetNotFoundException(id));
    }
}
