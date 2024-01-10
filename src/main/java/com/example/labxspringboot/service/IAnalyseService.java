package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Analyse;

import java.util.List;

public interface IAnalyseService {
    Analyse saveAnalyse(Analyse analyse);
    List<Analyse> getAllAnalyse();
    Analyse getAnalyseById(Long id);
    Analyse updateAnalyse(Analyse analyse,Long id);
    void deleteAnalyse(Long id);
}
