package com.shelter.pet.model;

import com.shelter.pet.enums.PetType;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance
@Table
public class Pet extends AbstractEntity {

    @Nonnull
    private String petName;

    @ManyToOne
    private Shelter shelter;

    @Column(columnDefinition = "varchar(64) default 'N/D'")
    private String breed = "N/D";

    @Enumerated(EnumType.STRING)
    private PetType petType;

    public Pet(String name, Shelter shelter, PetType type) {
        this.petName = name;
        this.shelter = shelter;
        this.petType = type;
    }

    public Pet(String name, String breed, Shelter shelter, PetType type) {
        this.petName = name;
        this.breed = breed;
        this.shelter = shelter;
        this.petType = type;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
