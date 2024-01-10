package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnalyseRepository extends JpaRepository<Analyse , Long> {
}
