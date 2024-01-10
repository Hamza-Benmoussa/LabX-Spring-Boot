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

    private String datePrelevement;


}

