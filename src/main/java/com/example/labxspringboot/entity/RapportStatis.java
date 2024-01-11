package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.TypeRapport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rapportStat")

public class RapportStatis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeRapport typeRapport;

    private String periodeRapport;

    private String donneesStatistiques;

    private String graphiques;

//    @ManyToOne
//    @JoinColumn(name = "utilisateur_id")  // Assuming you have a foreign key column in RapportStatistique
//    private Utilisateur utilisateur;


}
