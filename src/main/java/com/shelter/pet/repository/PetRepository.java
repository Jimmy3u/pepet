package com.shelter.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shelter.pet.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
    
}
