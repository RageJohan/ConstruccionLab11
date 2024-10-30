package com.tecsup.petclinic.exception;

/**
 * Excepción personalizada para cuando una especialidad (Specialtie) no es encontrada.
 *
 */
public class SpecialtieNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public SpecialtieNotFoundException(String message) {
        super(message);
    }
}
