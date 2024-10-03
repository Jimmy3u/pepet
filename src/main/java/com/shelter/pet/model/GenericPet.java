package com.shelter.pet.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance
@DiscriminatorColumn(name="pet_type", discriminatorType=DiscriminatorType.STRING, length=20)
public class GenericPet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long petId;
    @Nonnull
    private String petName;
    
    @CreationTimestamp
    private Timestamp registeredAt;
    
    @ManyToOne
    private Shelter shelter;

    public GenericPet(String n, Shelter s){
        this.petName = n;
        this.shelter = s;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
