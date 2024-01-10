package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Norme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INormeRepository extends JpaRepository<Norme,Long> {
}
