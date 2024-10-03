package com.shelter.pet.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {
    @Id
    private long id;
    private String name;
    @OneToMany
    public Set<GenericPet> pets;

    public Set<GenericPet> getPets(){
        return pets;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
