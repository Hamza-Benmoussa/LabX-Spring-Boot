package com.example.labxspringboot.dto;

import com.example.labxspringboot.entity.enume.StatusAnalyse;
import com.example.labxspringboot.entity.enume.StatusResultat;
import com.example.labxspringboot.entity.enume.TypeAnalyse;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.example.labxspringboot.entity.Analyse}
 */
@Value
public class AnalyseDto implements Serializable {
    Long id;
    Long echantillonId;
    Long responsableLaboAnalyseId;
    List<Long> testAnalysisIds;
    TypeAnalyse typeAnalyse;
    String dateDebutAnalyse;
    String dateFinAnalyse;
    StatusResultat status;
    StatusAnalyse statusAnalyse;
    String commentaires;
}