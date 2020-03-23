package de.jivy.sfgpetclinic.services;

import de.jivy.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    // Find by Lastname
    Owner findByLastName(String name);
}
