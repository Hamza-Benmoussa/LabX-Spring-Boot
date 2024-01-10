package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "technicien")
@PrimaryKeyJoinColumn(name = "utilisateur_id")
public class Technicien extends Utilisateur{

    private String specialiteTechnicien;
    @OneToOne
    private Echantillon echantillon;
}
