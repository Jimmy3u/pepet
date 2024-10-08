package com.shelter.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shelter.pet.model.Shelter;

public interface ShelterRepository extends JpaRepository<Shelter, Long>{
    
}