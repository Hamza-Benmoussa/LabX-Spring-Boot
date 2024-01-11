package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "technicien")
public class Technicien extends Utilisateur {

    @OneToMany(mappedBy = "technicienTest")
    private List<Test> tests;

    private String specialiteTechnicien;

    @OneToMany(mappedBy = "technicienEch" )
    private List<Echantillon> echantillon;
}
