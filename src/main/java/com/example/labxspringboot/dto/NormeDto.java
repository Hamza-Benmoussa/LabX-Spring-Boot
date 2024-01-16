package com.example.labxspringboot.dto;

import com.example.labxspringboot.entity.Norme;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Norme}
 */
@Value
public class NormeDto implements Serializable {
    Long id;
    String description;
    double min;
    double max;
    String unite;
    Long testAnalyseId;
}