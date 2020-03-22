package de.jivy.sfgpetclinic.services;

import de.jivy.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    // Find Method
    Pet findById(Long Id);

    // Save Method
    Pet save(Pet pet);

    // Set Method
    Set<Pet> findAll();
}
