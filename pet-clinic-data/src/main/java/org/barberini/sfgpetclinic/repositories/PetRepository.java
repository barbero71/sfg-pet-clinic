package org.barberini.sfgpetclinic.repositories;

import org.barberini.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
