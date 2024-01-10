package com.example.labxspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "materielechan")
public class MaterielEchan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomechan;

    private String descriptionechan;

    private int quantiteStockEhcna;

    private String dateExpirationEchan;

    @ManyToOne
    private Fournisseur fournisseur;

    @OneToOne(mappedBy = "materielEchan")
    private Echantillon echantillon;

}
