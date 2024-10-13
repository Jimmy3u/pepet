package com.shelter.pet.model;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter extends AbstractEntity {

    private String name;
    private String description;

    public Shelter(){}

    public Shelter(String shelterName, String shelterDescription){
        this.name = shelterName;
        this.description = shelterDescription;
    }

    @OneToMany(mappedBy = "shelter")
    public Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
