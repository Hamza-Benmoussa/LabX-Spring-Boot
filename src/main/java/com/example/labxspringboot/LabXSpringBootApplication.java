package com.example.labxspringboot;

import com.example.labxspringboot.entity.Utilisateur;
import com.example.labxspringboot.entity.enume.RoleUser;
import com.example.labxspringboot.service.impl.UtilisateurServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabXSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabXSpringBootApplication.class, args);
    }



}
