package com.shelter.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shelter.pet.enums.PetType;
import com.shelter.pet.model.Pet;
import com.shelter.pet.model.Shelter;
import com.shelter.pet.repository.PetRepository;
import com.shelter.pet.repository.ShelterRepository;

@Component
public class dbInit implements CommandLineRunner {

    @Autowired
    PetRepository petRepository;

    @Autowired
    ShelterRepository shelterRepo;

    @Override
    public void run(String... args) throws Exception {
        shelterRepo.save(new Shelter("Patas", "Sem descrição"));
        Shelter s = shelterRepo.getReferenceById((long) 1);

        petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Jamile", s, PetType.REPTILE));       petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Coisa", s, PetType.BIRD));       petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Siricutico", s, PetType.CAT));
        petRepository.save(new Pet("Caramelo", "Vira Lata", s, PetType.DOG));
        petRepository.save(new Pet("Destruidor", "Shi-tzu", s, PetType.DOG));
        petRepository.save(new Pet("Macarrão", "Dachshaund", s, PetType.DOG));


    }
}
