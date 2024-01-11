package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Utilisateur;
import com.example.labxspringboot.entity.enume.RoleUser;
import com.example.labxspringboot.repository.IUtilisateurRepository;
import com.example.labxspringboot.service.IUtilisateurService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ComponentScan(basePackages = "com.example.labxspringboot.service")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class UtilisateurServiceImplTest {

    @Autowired
    private IUtilisateurService utilisateurService;

    private Utilisateur testUtilisateur;

    @BeforeEach
    void setUp() {
        // Create a new Utilisateur before each test
        testUtilisateur = new Utilisateur();
        testUtilisateur.setNomUtilisateur("TestUser");
        testUtilisateur.setMotDePasse("password");
        testUtilisateur.setRole(RoleUser.TECHNICIEN);
        utilisateurService.saveUtilisateur(testUtilisateur);
        // Save the Utilisateur

    }

    @AfterEach
    void tearDown() {
        if (utilisateurService.getUtilisateurById(testUtilisateur.getId()) != null) {
            utilisateurService.deleteUtilisateur(testUtilisateur.getId());
        }
    }
    @Rollback(value = false)
    @Test
    void saveUtilisateur() {
        assertNotNull(testUtilisateur.getId());
    }
    @Rollback(value = false)
    @Test
    void getUtilisateurById() {
        Utilisateur retrievedUtilisateur = utilisateurService.getUtilisateurById(testUtilisateur.getId());
        assertNotNull(retrievedUtilisateur, "Retrieved user should not be null");
        assertEquals(testUtilisateur.getId(), retrievedUtilisateur.getId(), "IDs should match");
    }
    @Rollback(value = false)
    @Test
    void updateUtilisateur() {
        assertNotNull(testUtilisateur.getId(), "Utilisateur ID should not be null before updating");
        testUtilisateur.setMotDePasse("newPassword");
        Utilisateur updatedUtilisateur = utilisateurService.updateUtilisateur(testUtilisateur);
        assertNotNull(updatedUtilisateur, "Updated user should not be null");
        assertEquals("newPassword", updatedUtilisateur.getMotDePasse(), "Password should be updated");
    }
    @Rollback(value = false)
    @Test
    void getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurService.getUtilisateurs();
        assertFalse(utilisateurs.isEmpty());
    }
    @Rollback(value = false)
    @Test
    void deleteUtilisateur() {
        utilisateurService.deleteUtilisateur(testUtilisateur.getId());
        assertNull(utilisateurService.getUtilisateurById(testUtilisateur.getId()), "User should be deleted");
    }
}
