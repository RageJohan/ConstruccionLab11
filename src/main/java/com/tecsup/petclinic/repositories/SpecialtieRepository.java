package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Specialtie;

public interface SpecialtieRepository
        extends JpaRepository<Specialtie, Integer> {

}
