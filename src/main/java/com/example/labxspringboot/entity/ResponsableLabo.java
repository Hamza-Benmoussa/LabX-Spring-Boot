package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "responsable_labo")
@PrimaryKeyJoinColumn(name = "utilisateur_id")
public class ResponsableLabo extends Utilisateur {
    private String fonctionResponsable;

    @OneToMany
    private List<Analyse> analyses;

}
