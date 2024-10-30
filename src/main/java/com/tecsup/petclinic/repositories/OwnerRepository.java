package com.tecsup.petclinic.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecsup.petclinic.entities.Owner;

/**
 *
 * Repository for Owner entity.
 *
 */
@Repository
public interface OwnerRepository
        extends JpaRepository<Owner, Integer> {

    // Fetch owners by last name
    List<Owner> findByLastName(String lastName);

    // Fetch owners by first name
    List<Owner> findByFirstName(String firstName);

    @Override
    List<Owner> findAll();
}

