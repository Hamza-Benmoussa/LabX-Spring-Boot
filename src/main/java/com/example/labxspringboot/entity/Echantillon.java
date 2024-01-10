package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.StatusEchantillon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "echantillon")

public class Echantillon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "reactif_id") // Assuming you have a foreign key column in Echantillon
    private Reactif reactif;

    @OneToMany(mappedBy = "echantillon")
    private List<Analyse> analyses;

    @Enumerated(EnumType.STRING)
    private StatusEchantillon statut;

    private String datePrelevement;


}

