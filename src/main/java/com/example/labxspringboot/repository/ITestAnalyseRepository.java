package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.TestAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestAnalyseRepository extends JpaRepository<TestAnalyse,Long> {
}
