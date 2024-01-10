package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Echantillon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEchantillonRepository extends JpaRepository<Echantillon ,Long> {
}
