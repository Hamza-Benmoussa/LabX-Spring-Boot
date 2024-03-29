package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.StatusResultat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test")
public class TestAnalyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToOne
    private ResponsableLabo responsableLaboTest;

    @Enumerated(EnumType.STRING)
    private StatusResultat statusResultat;

    private float resultatNmbr;

    @ManyToOne
    private Analyse analyse;

    @OneToOne
    private Reactif reactif;

    @OneToOne
    private Norme norme;
}
