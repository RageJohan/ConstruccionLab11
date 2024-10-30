package com.tecsup.petclinic.exception;

/**
 *
 * Exception thrown when an owner is not found in the system.
 *
 */
public class OwnerNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public OwnerNotFoundException(String message) {
        super(message);
    }
}

