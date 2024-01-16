package com.example.labxspringboot.dto;

import com.example.labxspringboot.entity.ResponsableLabo;
import com.example.labxspringboot.entity.enume.RoleUser;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link ResponsableLabo}
 */
@Value
public class ResponsableLaboDto implements Serializable {
    Long id;
    String nomUtilisateur;
    String motDePasse;
    RoleUser role;
    String fonctionResponsable;
    List<Long> testAnalysisIds;
    List<Long> analysisIds;
}