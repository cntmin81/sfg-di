package com.springframework.pet;

import com.springframework.pet.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"cat"})
@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
