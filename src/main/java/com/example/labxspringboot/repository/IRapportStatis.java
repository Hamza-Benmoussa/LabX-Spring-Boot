package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.RapportStatis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRapportStatis extends JpaRepository<RapportStatis,Long> {
}
