package com.shelter.pet.records;

import com.shelter.pet.enums.PetType;

public record PetRecord(
        Long id,
        String petName,
        String petBreed,
        PetType petType) {

}
