package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Analyse;
import com.example.labxspringboot.entity.Echantillon;
import com.example.labxspringboot.entity.Patient;
import com.example.labxspringboot.entity.ResponsableLabo;
import com.example.labxspringboot.entity.enume.StatusAnalyse;
import com.example.labxspringboot.entity.enume.StatusResultat;
import com.example.labxspringboot.entity.enume.TypeAnalyse;
import com.example.labxspringboot.repository.IAnalyseRepository;
import com.example.labxspringboot.repository.IEchantillonRepository;
import com.example.labxspringboot.repository.IUtilisateurRepository;
import com.example.labxspringboot.service.IAnalyseService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ComponentScan(basePackages = "com.example.labxspringboot.service")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class AnalyseServiceImplTest {

    @Autowired
    private IAnalyseRepository analyseRepository;

    @Autowired
    private IAnalyseService analyseService;

    @Autowired
    private IEchantillonRepository echantillonRepository;

    @Autowired
    private IUtilisateurRepository responsableLaboRepository;

    private Analyse testAnalyse;

    @BeforeEach
    void setUp() {
        // Create a new Echantillon before each test
        Echantillon echantillon = new Echantillon();
        Patient patient = new Patient();
        patient.setNom("TestPatient");
        echantillon.setPatient(patient);

        // Save the Echantillon first
        echantillonRepository.save(echantillon);

        // Create a new ResponsableLabo
        ResponsableLabo responsableLabo = new ResponsableLabo();
        responsableLabo.setNomUtilisateur("TestResponsable");
        responsableLaboRepository.save(responsableLabo);

        // Create a new Analyse
        testAnalyse = new Analyse();
        testAnalyse.setEchantillon(echantillon);
        testAnalyse.setResponsableLabo(responsableLabo);
        testAnalyse.setTypeAnalyse(TypeAnalyse.HEMATOLOGIE);
        testAnalyse.setStatusAnalyse(StatusAnalyse.EN_COURS_ANALYSE);
        testAnalyse.setStatus(StatusResultat.NORMAL);
        testAnalyse.setCommentaires("Test Comment");

        // Save the Analyse
        analyseRepository.save(testAnalyse);
    }

    @AfterEach
    void tearDown() {
        if (analyseRepository.findById(testAnalyse.getId()).isPresent()) {
            analyseRepository.deleteById(testAnalyse.getId());
        }
    }

    @Test
    void saveAnalyse() {
        assertNotNull(testAnalyse.getId(), "Analyse ID should not be null after saving");
    }


    @Test
    void getAnalyseById() {
        Analyse retrievedAnalyse = analyseService.getAnalyseById(testAnalyse.getId());
        assertNotNull(retrievedAnalyse, "Retrieved analysis should not be null");
        assertEquals(testAnalyse.getId(), retrievedAnalyse.getId(), "IDs should match");
    }

    @Test
    void updateAnalyse() {
        assertNotNull(testAnalyse.getId(), "Analyse ID should not be null before updating");
        testAnalyse.setCommentaires("Updated Comment");
        Analyse updatedAnalyse = analyseService.updateAnalyse(testAnalyse, testAnalyse.getId());
        assertNotNull(updatedAnalyse, "Updated analysis should not be null");
        assertEquals("Updated Comment", updatedAnalyse.getCommentaires(), "Comment should be updated");
    }
    @Test
    void getAllAnalyses() {
        List<Analyse> analyses = analyseService.getAllAnalyse();
        assertFalse(analyses.isEmpty());
    }
    @Test
    void deleteAnalyse() {
        analyseService.deleteAnalyse(testAnalyse.getId());
        assertFalse(analyseRepository.findById(testAnalyse.getId()).isPresent(), "Analysis should be deleted");
    }
}
