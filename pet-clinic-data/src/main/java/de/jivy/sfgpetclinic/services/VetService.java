package de.jivy.sfgpetclinic.services;

import de.jivy.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    // Find by Lastname
    Vet findByLastName(String name);

    // Find Method
    Vet findById(Long Id);

    // Save Method
    Vet save(Vet vet);

    // Set Method
    Set<Vet> findAll();
}
