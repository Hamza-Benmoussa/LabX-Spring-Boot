package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fournisseur")

public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;

    private String nom;

    private String adresse;

    @OneToMany(mappedBy = "fournisseur")
    private List<Reactif> reactifs;

    @OneToMany(mappedBy = "fournisseur")
    private List<MaterielEchan> materielEchans;

}
