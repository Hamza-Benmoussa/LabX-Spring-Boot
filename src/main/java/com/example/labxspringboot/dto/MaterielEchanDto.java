package com.example.labxspringboot.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.labxspringboot.entity.MaterielEchan}
 */
@Value
public class MaterielEchanDto implements Serializable {
    Long id;
    String nomechan;
    int quantiteStockEhcna;
    String dateExpirationEchan;
    String fournisseurNom;
    Long echantillonId;
}