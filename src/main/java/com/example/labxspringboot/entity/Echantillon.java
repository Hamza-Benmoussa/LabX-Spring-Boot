package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.StatusAnalyse;
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
    @JoinColumn(name = "material_id") // Assuming you have a foreign key column in Echantillon
    private MaterielEchan materielEchan;//material gghadi nsemih m3a abdsade9

    @OneToMany(mappedBy = "echantillon")
    private List<Analyse> analyses;

    @OneToOne
    @JoinColumn(name = "technicien_id")
    private Technicien technicien;

    private String datePrelevement;

    public Echantillon(Patient patient, MaterielEchan materielEchan, List<Analyse> analyses, Technicien technicien, String datePrelevement) {
        this.patient = patient;
        this.materielEchan = materielEchan;
        this.analyses = analyses;
        this.technicien = technicien;
        this.datePrelevement = datePrelevement;
    }
}

