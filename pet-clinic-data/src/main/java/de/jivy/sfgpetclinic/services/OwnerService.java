package de.jivy.sfgpetclinic.services;

import de.jivy.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    // Find by Lastname
    Owner findByLastName(String name);

    // Find Method
    Owner findById(Long Id);

    // Save Method
    Owner save(Owner o);

    // Set Method
    Set<Owner> findAll();

}
