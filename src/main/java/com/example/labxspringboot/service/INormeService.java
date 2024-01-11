package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Norme;

import java.util.List;

public interface INormeService {
    Norme saveNorme(Norme norme);
    List<Norme> getNormes();
    Norme getNormeById(Long id);
    Norme updateNorme(Norme norme, Long id);
    void deleteNorme(Long id);
}
