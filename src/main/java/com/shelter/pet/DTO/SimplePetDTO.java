package com.shelter.pet.DTO;

import com.shelter.pet.enums.PetType;

public class SimplePetDTO {

    private Long petId;
    private String petName;
    private String petBreed;
    private PetType petType;

    public SimplePetDTO() {
    }

    public SimplePetDTO(Long petId, String petName, String petBreed, PetType petType) {
        this.petId = petId;
        this.petName = petName;
        this.petBreed = petBreed;
        this.petType = petType;
    }
    public Long getPetId() {
        return petId;
    }
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

}
