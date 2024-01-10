package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.MaterielEchan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMaterialRepository extends JpaRepository<MaterielEchan,Long> {
}
