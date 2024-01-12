package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Norme;
import com.example.labxspringboot.service.INormeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Transactional
class NormeServiceImplTest {
@Autowired
private INormeService iNormeService;

    @ParameterizedTest
    @CsvFileSource(resources = "/listTest.csv", numLinesToSkip = 1)
    void saveNorme(String Name,double Min,double Max,String Unit) {
            Norme norme=new Norme();
            norme.setDescription(Name);
            norme.setUnite(Unit);
            norme.setMax(Max);
            norme.setMin(Min);
            iNormeService.saveNorme(norme);

    }
}