package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Specialtie;

import java.util.List;

public interface SpecialtieService{

    Specialtie getSpecialtieById(int id);
    List<Specialtie> getAllSpecialties();
    Specialtie saveSpecialtie(Specialtie specialtie);
    void deleteSpecialtie(int id);

}

