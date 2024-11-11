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
        shelterRepo.save(new Shelter("Vida Animal",
                "O Abrigo Vida Animal é um espaço acolhedor e dedicado ao resgate e cuidado de animais abandonados e em situação de vulnerabilidade. Localizado em meio à natureza, o abrigo conta com amplos canis e áreas verdes, onde os animais podem brincar e socializar. Nossa equipe é formada por voluntários apaixonados, que oferecem amor, carinho e atenção a cada um dos nossos hóspedes peludos."));
        shelterRepo.save(new Shelter("Aumigos",
                "O Abrigo Aumigos é um espaço acolhedor e dedicado ao resgate e cuidado de animais abandonados e em situação de vulnerabilidade. Localizado em meio à natureza, o abrigo conta com amplos canis e áreas verdes, onde os animais podem brincar e socializar. Nossa equipe é formada por voluntários apaixonados, que oferecem amor, carinho e atenção a cada um dos nossos hóspedes peludos."));
                shelterRepo.save(new Shelter("Vida Animal 2",
                "O Abrigo Vida Animal é um espaço acolhedor e dedicado ao resgate e cuidado de animais abandonados e em situação de vulnerabilidade. Localizado em meio à natureza, o abrigo conta com amplos canis e áreas verdes, onde os animais podem brincar e socializar. Nossa equipe é formada por voluntários apaixonados, que oferecem amor, carinho e atenção a cada um dos nossos hóspedes peludos."));
        shelterRepo.save(new Shelter("Aumigos 2",
                "O Abrigo Aumigos é um espaço acolhedor e dedicado ao resgate e cuidado de animais abandonados e em situação de vulnerabilidade. Localizado em meio à natureza, o abrigo conta com amplos canis e áreas verdes, onde os animais podem brincar e socializar. Nossa equipe é formada por voluntários apaixonados, que oferecem amor, carinho e atenção a cada um dos nossos hóspedes peludos."));

        Shelter s = shelterRepo.getReferenceById((long) 1);

        petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Jamile", s, PetType.REPTILE));
        petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Coisa", s, PetType.BIRD));
        petRepository.save(new Pet("carlos", "Husky", s, PetType.DOG));
        petRepository.save(new Pet("Siricutico", s, PetType.CAT));
        petRepository.save(new Pet("Caramelo", "Vira Lata", s, PetType.DOG));
        petRepository.save(new Pet("Destruidor", "Shi-tzu", s, PetType.DOG));
        petRepository.save(new Pet("Macarrão", "Dachshaund", s, PetType.DOG));

    }
}
