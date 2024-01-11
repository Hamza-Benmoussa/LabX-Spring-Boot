package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Echantillon;

import java.util.List;

public interface IEchantillonService {
    Echantillon saveEchantillon(Echantillon echantillon);
    List<Echantillon> getEchantillons();
    Echantillon getEchantillonById(Long id);
    Echantillon updateEchantillon(Echantillon echantillon, Long id);
    void deleteEchantillon(Long id);
}
