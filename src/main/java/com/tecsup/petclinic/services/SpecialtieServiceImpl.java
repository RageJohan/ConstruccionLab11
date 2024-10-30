package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Specialtie;
import com.tecsup.petclinic.repositories.SpecialtieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtieServiceImpl implements SpecialtieService{

    @Autowired
    SpecialtieRepository specialtieRepository;

    @Override
    public Specialtie getSpecialtieById(int id) {
        return specialtieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Specialtie> getAllSpecialties() {
        return specialtieRepository.findAll();
    }

    @Override
    public Specialtie saveSpecialtie(Specialtie specialtie) {
        specialtieRepository.save(specialtie);
        return specialtie;
    }

    @Override
    public void deleteSpecialtie(int id) {
        specialtieRepository.deleteById(id);
    }
}
