package com.tecsup.petclinic.services;

import java.util.List;
import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

/**
 *
 * Interface for Owner service operations.
 *
 */
public interface OwnerService {

    /**
     *
     * @param owner
     * @return the created owner
     */
    Owner create(Owner owner);

    /**
     *
     * @param owner
     * @return the updated owner
     */
    Owner update(Owner owner);

    /**
     *
     * @param id
     * @throws OwnerNotFoundException if the owner is not found
     */
    void delete(Integer id) throws OwnerNotFoundException;

    /**
     *
     * @param id
     * @return the owner found by id
     * @throws OwnerNotFoundException if the owner is not found
     */
    Owner findById(Integer id) throws OwnerNotFoundException;

    /**
     *
     * @param lastName
     * @return the list of owners found by last name
     */
    List<Owner> findByLastName(String lastName);

    /**
     *
     * @param firstName
     * @return the list of owners found by first name
     */
    List<Owner> findByFirstName(String firstName);

    /**
     *
     * @return the list of all owners
     */
    List<Owner> findAll();
}

