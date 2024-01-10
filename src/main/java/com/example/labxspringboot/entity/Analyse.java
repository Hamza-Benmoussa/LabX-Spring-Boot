package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.StatusAnalyse;
import com.example.labxspringboot.entity.enume.StatusResultat;
import com.example.labxspringboot.entity.enume.TypeAnalyse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "analyses")
public class Analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Echantillon echantillon;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private ResponsableLabo responsableLabo;

    @OneToMany(mappedBy = "analyse")
    private List<Test> tests;

    @Enumerated(EnumType.STRING)
    private TypeAnalyse typeAnalyse; // Ajout de l'attribut typeAnalyse

    private String dateDebutAnalyse;

    private String dateFinAnalyse;

    @Enumerated(EnumType.STRING)
    private StatusResultat status;

    @Enumerated(EnumType.STRING)
    private StatusAnalyse statusAnalyse;

    private String commentaires;

    public Analyse(Echantillon echantillon, ResponsableLabo responsableLabo, List<Test> tests, TypeAnalyse typeAnalyse, String dateDebutAnalyse, String dateFinAnalyse, StatusResultat status, StatusAnalyse statusAnalyse, String commentaires) {
        this.echantillon = echantillon;
        this.responsableLabo = responsableLabo;
        this.tests = tests;
        this.typeAnalyse = typeAnalyse;
        this.dateDebutAnalyse = dateDebutAnalyse;
        this.dateFinAnalyse = dateFinAnalyse;
        this.status = status;
        this.statusAnalyse = statusAnalyse;
        this.commentaires = commentaires;
    }
}
