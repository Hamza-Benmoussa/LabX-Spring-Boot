package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Echantillon;
import com.example.labxspringboot.repository.IEchantillonRepository;
import com.example.labxspringboot.service.IEchantillonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchantillonServiceImpl implements IEchantillonService {

    @Autowired
    private IEchantillonRepository echantillonRepository;

    @Override
    public Echantillon saveEchantillon(Echantillon echantillon) {
        return echantillonRepository.save(echantillon);
    }

    @Override
    public List<Echantillon> getEchantillons() {
        return echantillonRepository.findAll();
    }

    @Override
    public Echantillon getEchantillonById(Long id) {
        return echantillonRepository.findById(id).orElse(null);
    }

    @Override
    public Echantillon updateEchantillon(Echantillon echantillon, Long id) {
        return echantillonRepository.save(echantillon);
    }

    @Override
    public void deleteEchantillon(Long id) {
        echantillonRepository.deleteById(id);
    }
}
