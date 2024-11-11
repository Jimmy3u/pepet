package com.shelter.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shelter.pet.model.Shelter;
import com.shelter.pet.repository.ShelterRepository;

@Service
public class ShelterService {
    @Autowired
    ShelterRepository shelterRepo;

    public List<Shelter> findAll(){
        return this.shelterRepo.findAll();
    }
}
