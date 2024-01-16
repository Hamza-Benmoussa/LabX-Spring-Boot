package com.example.labxspringboot.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.labxspringboot.entity.Reactif}
 */
@Value
public class ReactifDto implements Serializable {
    Long id;
    String nom;
    String description;
    int quantiteStock;
    String dateExpiration;
    String fournisseurNom;
    Long testAnalyseId;
}