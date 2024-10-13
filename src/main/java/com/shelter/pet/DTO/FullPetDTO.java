package com.shelter.pet.DTO;

import com.shelter.pet.model.Shelter;

public class FullPetDTO {
    
     private String petName;
     private String petBreed;
     private String petType;
     private Shelter shelter;
    
    public String getPetName() {
        return petName;
    }
    public String getPetBreed() {
        return petBreed;
    }
    public String getPetType() {
        return petType;
    }
    public Shelter getShelter() {
        return shelter;
    }
}
