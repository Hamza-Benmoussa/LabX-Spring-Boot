package com.example.labxspringboot.dto;

import com.example.labxspringboot.entity.Echantillon;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Echantillon}
 */
@Value
public class EchantillonDto implements Serializable {
    Long id;
    Long patientId;
    Long materielEchanId;
    List<Long> analysisIds;
    Long technicienEchId;
    String datePrelevement;
}