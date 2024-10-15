package com.shelter.pet.model;

import org.springframework.util.StringUtils;

import com.shelter.pet.enums.PetType;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance
@Table(name = "pets")
public class Pet extends AbstractEntity {

    @Nonnull
    private String petName;

    @ManyToOne
    private Shelter shelter;

    private String petBreed = "N/D";

    @Enumerated(EnumType.STRING)
    private PetType petType;

    public Pet() {
    }

    public Pet(String name, Shelter shelter, PetType type) {
        this.petName = StringUtils.capitalize(name);
        this.shelter = shelter;
        this.petType = type;
    }

    public Pet(String name, String breed, Shelter shelter, PetType type) {
        this.petName = StringUtils.capitalize(name);
        this.petBreed = breed;
        this.shelter = shelter;
        this.petType = type;
    }

    public String getPetName() {
        return StringUtils.capitalize(petName);
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setPetBreed(String breed) {
        this.petBreed = breed;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public PetType getPetType() {
        return petType;
    }
}
