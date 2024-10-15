package com.shelter.pet.handler;

public class PetNotFoundException extends IllegalArgumentException {
    public PetNotFoundException(Long id){
        super(String.format("Pet with id %d not found, ", id));
    }
}
