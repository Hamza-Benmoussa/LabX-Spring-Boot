package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
