package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Reactif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReactifRepository extends JpaRepository<Reactif , Long> {
}
