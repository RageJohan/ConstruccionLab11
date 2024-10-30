package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;

@Entity(name = "specialties")
@Data
public class Specialtie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String office;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "h_open")
    private String hOpen;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "h_close")
    private String hClose;

    public Specialtie() {
    }

    public Specialtie(Integer id, String name, String office, String hOpen, String hClose) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.hOpen = hOpen;
        this.hClose = hClose;
    }

    public Specialtie(String name, String office, String hOpen, String hClose) {
        this.name = name;
        this.office = office;
        this.hOpen = hOpen;
        this.hClose = hClose;
    }

    public Specialtie(String speName) {
        this.name = speName;
    }
}
