package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Analyse;
import com.example.labxspringboot.repository.IAnalyseRepository;
import com.example.labxspringboot.service.IAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyseServiceImpl implements IAnalyseService {
    @Autowired
    private IAnalyseRepository iAnalyseRepository;
    @Override
    public Analyse saveAnalyse(Analyse analyse) {
        return iAnalyseRepository.save(analyse);
    }

    @Override
    public List<Analyse> getAllAnalyse() {
        return iAnalyseRepository.findAll();
    }

    @Override
    public Analyse getAnalyseById(Long id) {
        return iAnalyseRepository.findById(id).orElse(null);
    }

    @Override
    public Analyse updateAnalyse(Analyse analyse, Long id) {
        return iAnalyseRepository.save(analyse);
    }

    @Override
    public void deleteAnalyse(Long id) {
        iAnalyseRepository.deleteById(id);
    }
}
