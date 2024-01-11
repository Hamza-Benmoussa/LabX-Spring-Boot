package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> getUtilisateurs();
    Utilisateur getUtilisateurById(Long id);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateur(Long id);
}
