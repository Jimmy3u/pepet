package com.shelter.pet.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Dog")
public class Dog extends GenericPet {
    private String breed;

    public Dog(String n, String b, Shelter s){
        super(n, s);
        this.breed = b;
    }
    
}
