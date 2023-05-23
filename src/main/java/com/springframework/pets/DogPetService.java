package com.springframework.pets;

public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dog Are The Best";
    }
}
