package de.jivy.sfgpetclinic.bootstrap;

import de.jivy.sfgpetclinic.model.Owner;
import de.jivy.sfgpetclinic.model.Vet;
import de.jivy.sfgpetclinic.services.OwnerService;
import de.jivy.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Set Owner
        System.out.println("Lade default Besitzer");
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Oliver");
        owner.setLastName("Sharif Mohammadi");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Iryna");
        owner2.setLastName("Tsarova");

        // Save it in the ownerService
        ownerService.save(owner);
        ownerService.save(owner2);

        System.out.println("Speicher default Besitzer");

        // Set Vet
        System.out.println("Lade default Tierärzte");
        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sascha");
        vet.setLastName("Sharif Mohammadi");

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Fee");
        vet2.setLastName("Sharif Mohammadi");

        // Save it in the vetService
        vetService.save(vet);
        vetService.save(vet2);

        System.out.println("Speichere default Tierärzte");
    }
}
