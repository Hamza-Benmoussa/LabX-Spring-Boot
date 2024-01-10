package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.StatusResultat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test")

public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToOne
    private Analyse analyse;

    @Enumerated(EnumType.STRING)
    private StatusResultat statusResultat;

    private float resultatNmbr;

    @OneToOne
    private Reactif reactif;

    @OneToOne
    @JoinColumn(name = "norme_id")
    private Norme norme;
}
