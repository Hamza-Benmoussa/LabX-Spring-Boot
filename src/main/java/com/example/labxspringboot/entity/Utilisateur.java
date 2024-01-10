package com.example.labxspringboot.entity;

import com.example.labxspringboot.entity.enume.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomUtilisateur;

    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private RoleUser role;
    @OneToMany(mappedBy = "utilisateur")
    private List<RapportStatis> generateursRapports;

}
