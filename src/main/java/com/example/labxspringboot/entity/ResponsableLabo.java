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
@Table(name = "responsable_labo")
//@PrimaryKeyJoinColumn(name = "utilisateur_id")
public class ResponsableLabo extends Utilisateur {
    private String fonctionResponsable;

    @OneToMany(mappedBy = "responsableLabo")
    private List<Analyse> analyses;

}
