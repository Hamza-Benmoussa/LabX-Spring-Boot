package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "analyses")
public class Analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private Echantillon echantillon;

//    @ManyToOne
//    private Utilisateur technicienResponsable;
//
//    @OneToMany(mappedBy = "analyse")
//    private List<Test> tests;
//
//    @Enumerated(EnumType.STRING)
//    private TypeAnalyse typeAnalyse; // Ajout de l'attribut typeAnalyse

    private String dateDebutAnalyse;

    private String dateFinAnalyse;

    private String resultats;

    private String commentaires;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Analyse() {
    }

    public Analyse(String dateDebutAnalyse, String dateFinAnalyse, String resultats, String commentaires) {
        this.dateDebutAnalyse = dateDebutAnalyse;
        this.dateFinAnalyse = dateFinAnalyse;
        this.resultats = resultats;
        this.commentaires = commentaires;
    }

    public String getDateDebutAnalyse() {
        return dateDebutAnalyse;
    }

    public void setDateDebutAnalyse(String dateDebutAnalyse) {
        this.dateDebutAnalyse = dateDebutAnalyse;
    }

    public String getDateFinAnalyse() {
        return dateFinAnalyse;
    }

    public void setDateFinAnalyse(String dateFinAnalyse) {
        this.dateFinAnalyse = dateFinAnalyse;
    }

    public String getResultats() {
        return resultats;
    }

    public void setResultats(String resultats) {
        this.resultats = resultats;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
    //    @OneToOne(mappedBy = "analyse")
//    private Planification planification;
}
