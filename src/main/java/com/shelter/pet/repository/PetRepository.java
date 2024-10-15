package com.shelter.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shelter.pet.DTO.SimplePetDTO;
import com.shelter.pet.model.Pet;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    @Query(value = "SELECT new com.shelter.pet.DTO.SimplePetDTO(p.id, p.petName, p.petBreed, p.petType) from Pet as p")
    List<SimplePetDTO> findAllSimple();

}
