package com.shelter.pet.records;

import java.util.List;

public record ShelterRecord(
    Long id,
    String name,
    String description,
    List<PetRecord> shelterPets
) {
    
}
