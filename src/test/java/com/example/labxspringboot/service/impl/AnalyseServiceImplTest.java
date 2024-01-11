//package com.example.labxspringboot.service.impl;
//
//import com.example.labxspringboot.entity.*;
//import com.example.labxspringboot.entity.enume.RoleUser;
//import com.example.labxspringboot.entity.enume.StatusAnalyse;
//import com.example.labxspringboot.entity.enume.StatusResultat;
//import com.example.labxspringboot.entity.enume.TypeAnalyse;
//import com.example.labxspringboot.repository.IAnalyseRepository;
//import com.example.labxspringboot.repository.IEchantillonRepository;
//import com.example.labxspringboot.repository.IUtilisateurRepository;
//import com.example.labxspringboot.service.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ComponentScan(basePackages = "com.example.labxspringboot.service")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@DataJpaTest
//public class AnalyseServiceImplTest {
//
//
//    @Autowired
//    private IAnalyseService iAnalyseService;
//
//    @Autowired
//    private IEchantillonService iEchantillonService;
//
//    @Autowired
//    private IUtilisateurService iUtilisateurService;
//
//    @Autowired
//    private IMaterialEchanService iMaterialEchanService;
//
//    @Autowired
//    private IPatientService iPatientService;
//
//    @Autowired
//    private ITestService iTestService;
//
//    private Analyse testAnalyse;
//
//    @BeforeEach
//    void setUp() {
//
//        Patient patient = new Patient();
//
//        patient.setNom("TestPatient");
//        patient.setPrenom("khona");
//        patient.setDateNaissance("2002");
//        patient.setSexe("homme");
//        patient.setAdresse("casa");
//        patient.setNumeroTelephone("044654645");
//        patient.setHistoriqueAnalyses(iEchantillonService.getEchantillons());
//        iPatientService.savePatient(patient);
//
//        Technicien technicien = new Technicien();
//
//        technicien.setNomUtilisateur("miko");
//        technicien.setMotDePasse("152");
//        technicien.setSpecialiteTechnicien("technicien");
//        technicien.setRole(RoleUser.TECHNICIEN);
//        iUtilisateurService.saveUtilisateur(technicien);
//
//        MaterielEchan materielEchan=new MaterielEchan();
//
//        materielEchan.setNomechan("bra");
//        materielEchan.setQuantiteStockEhcna(10);
//        materielEchan.setDateExpirationEchan("2025");
//        materielEchan.setFournisseurNom("lwalid");
//        materielEchan.setEchantillon(iEchantillonService.getEchantillonById(1L));
//        iMaterialEchanService.saveMaterialEchan(materielEchan);
//
//        Echantillon echantillon = new Echantillon();
//
//        echantillon.setDatePrelevement("2024");
//        echantillon.setTechnicienEch(technicien);
//        echantillon.setMaterielEchan(materielEchan);
//        echantillon.setPatient(patient);
//        echantillon.setAnalyses(iAnalyseService.getAnalyses());
//
//        // Save the Echantillon first
//        iEchantillonService.saveEchantillon(echantillon);
//
//
//        // Create a new ResponsableLabo
//        ResponsableLabo responsableLabo = new ResponsableLabo();
//        responsableLabo.setNomUtilisateur("TestResponsable");
//        responsableLabo.setMotDePasse("1234");
//        responsableLabo.setFonctionResponsable("responsable");
//        responsableLabo.setRole(RoleUser.RESPONSABLE_LABORATOIRE);
//        responsableLabo.setAnalyses(iAnalyseService.getAnalyses());
//        iUtilisateurService.saveUtilisateur(responsableLabo);
//
//        // Create a new Analyse
//        testAnalyse = new Analyse();
//        testAnalyse.setEchantillon(echantillon);
//        testAnalyse.setResponsableLabo(responsableLabo);
//        testAnalyse.setTypeAnalyse(TypeAnalyse.HEMATOLOGIE);
//        testAnalyse.setStatusAnalyse(StatusAnalyse.EN_COURS_ANALYSE);
//        testAnalyse.setStatus(StatusResultat.NORMAL);
//        testAnalyse.setCommentaires("Test Comment");
//        testAnalyse.setDateDebutAnalyse("2022");
//        testAnalyse.setDateFinAnalyse("2023");
//        testAnalyse.setTests(iTestService.getTests());
//
//        // Save the Analyse
//        iAnalyseService.saveAnalyse(testAnalyse);
//    }
//
//
//    @AfterEach
//    void tearDown() {
////        if (analyseService.getAnalyseById(testAnalyse.getId()) != null) {
////            analyseService.deleteAnalyse(testAnalyse.getId());
////        }
//    }
//    @Rollback(value = false)
//    @Test
//    void saveAnalyse() {
//        System.out.println(testAnalyse);
//        assertNotNull(testAnalyse.getId(), "Analyse ID should not be null after saving");
//    }
//
//    @Rollback(value = false)
//    @Test
//    void getAnalyseById() {
//        Analyse retrievedAnalyse = iAnalyseService.getAnalyseById(testAnalyse.getId());
//        assertNotNull(retrievedAnalyse, "Retrieved analysis should not be null");
//        assertEquals(testAnalyse.getId(), retrievedAnalyse.getId(), "IDs should match");
//    }
//    @Rollback(value = false)
//    @Test
//    void updateAnalyse() {
//        assertNotNull(testAnalyse.getId(), "Analyse ID should not be null before updating");
//        testAnalyse.setCommentaires("Updated Comment");
//        Analyse updatedAnalyse = iAnalyseService.updateAnalyse(testAnalyse, testAnalyse.getId());
//        assertNotNull(updatedAnalyse, "Updated analysis should not be null");
//        assertEquals("Updated Comment", updatedAnalyse.getCommentaires(), "Comment should be updated");
//    }
//    @Rollback(value = false)
//    @Test
//    void getAllAnalyses() {
//        List<Analyse> analyses = iAnalyseService.getAnalyses();
//        assertFalse(analyses.isEmpty());
//    }
//    @Rollback(value = false)
//    @Test
//    void deleteAnalyse() {
//        iAnalyseService.deleteAnalyse(testAnalyse.getId());
//        assertNull(iAnalyseService.getAnalyseById(testAnalyse.getId()), "Analysis should be deleted");
//    }
//}
