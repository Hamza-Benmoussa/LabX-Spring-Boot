package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.MaterielEchan;

import com.example.labxspringboot.service.IMaterialEchanService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ComponentScan(basePackages = "com.example.labxspringboot.service")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
@Transactional
public class MaterialEchanServiceImplTest {

    @Autowired
    private IMaterialEchanService materialEchanService;

    private MaterielEchan testMaterialEchan;

    @BeforeEach
    void setUp() {
        // Create a new MaterialEchan before each test
        testMaterialEchan = new MaterielEchan();
        testMaterialEchan.setNomechan("TestMaterialEchan");
        testMaterialEchan.setQuantiteStockEhcna(10);
        testMaterialEchan.setDateExpirationEchan("2025-01-01");
        testMaterialEchan.setFournisseurNom("TestFournisseur");

        // Save the MaterialEchan
        materialEchanService.saveMaterialEchan(testMaterialEchan);
    }

    @AfterEach
    void tearDown() {
        if (materialEchanService.getMaterialEchanById(testMaterialEchan.getId()) != null) {
            materialEchanService.deleteMaterialEchan(testMaterialEchan.getId());
        }
    }
    @Rollback(value = false)
    @Test
    void saveMaterialEchan() {
        assertNotNull(testMaterialEchan.getId(), "MaterialEchan ID should not be null after saving");
    }
    @Rollback(value = false)
    @Test
    void getMaterialEchanById() {
        MaterielEchan retrievedMaterialEchan = materialEchanService.getMaterialEchanById(testMaterialEchan.getId());
        assertNotNull(retrievedMaterialEchan, "Retrieved materialEchan should not be null");
        assertEquals(testMaterialEchan.getId(), retrievedMaterialEchan.getId(), "IDs should match");
    }
    @Rollback(value = false)
    @Test
    void updateMaterialEchan() {
        assertNotNull(testMaterialEchan.getId(), "MaterialEchan ID should not be null before updating");
        testMaterialEchan.setQuantiteStockEhcna(20);
        MaterielEchan updatedMaterialEchan = materialEchanService.updateMaterialEchan(testMaterialEchan, testMaterialEchan.getId());
        assertNotNull(updatedMaterialEchan, "Updated materialEchan should not be null");
        assertEquals(20, updatedMaterialEchan.getQuantiteStockEhcna(), "QuantiteStockEhcna should be updated");
    }
    @Rollback(value = false)
    @Test
    void getAllMaterialEchans() {
        List<MaterielEchan> materialEchans = materialEchanService.getMaterialEchans();
        assertFalse(materialEchans.isEmpty());
    }
    @Rollback(value = false)
    @Test
    void deleteMaterialEchan() {
        materialEchanService.deleteMaterialEchan(testMaterialEchan.getId());
        assertNull(materialEchanService.getMaterialEchanById(testMaterialEchan.getId()), "MaterialEchan should be deleted");
    }
}
