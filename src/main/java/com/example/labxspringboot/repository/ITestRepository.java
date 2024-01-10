package com.example.labxspringboot.repository;

import com.example.labxspringboot.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestRepository extends JpaRepository<Test,Long> {
}
