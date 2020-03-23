package de.jivy.sfgpetclinic.services;

import de.jivy.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    // Find by Lastname
    Vet findByLastName(String name);
}
