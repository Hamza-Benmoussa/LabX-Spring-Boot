package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Norme;
import com.example.labxspringboot.repository.INormeRepository;
import com.example.labxspringboot.service.INormeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NormeServiceImpl implements INormeService {

    @Autowired
    private INormeRepository normeRepository;

    @Override
    public Norme saveNorme(Norme norme) {
        return normeRepository.save(norme);
    }

    @Override
    public List<Norme> getNormes() {
        return normeRepository.findAll();
    }

    @Override
    public Norme getNormeById(Long id) {
        return normeRepository.findById(id).orElse(null);
    }

    @Override
    public Norme updateNorme(Norme norme, Long id) {
        return normeRepository.save(norme);
    }

    @Override
    public void deleteNorme(Long id) {
        normeRepository.deleteById(id);
    }
}
