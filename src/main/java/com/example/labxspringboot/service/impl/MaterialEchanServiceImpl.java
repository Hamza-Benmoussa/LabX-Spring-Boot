package com.example.labxspringboot.service.impl;


import com.example.labxspringboot.entity.MaterielEchan;
import com.example.labxspringboot.repository.IMaterialRepository;
import com.example.labxspringboot.service.IMaterialEchanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialEchanServiceImpl implements IMaterialEchanService {

    @Autowired
    private IMaterialRepository materialRepository;

    @Override
    public MaterielEchan saveMaterialEchan(MaterielEchan materialEchan) {
        return materialRepository.save(materialEchan);
    }

    @Override
    public List<MaterielEchan> getMaterialEchans() {
        return materialRepository.findAll();
    }

    @Override
    public MaterielEchan getMaterialEchanById(Long id) {
        return materialRepository.findById(id).orElse(null);
    }

    @Override
    public MaterielEchan updateMaterialEchan(MaterielEchan materialEchan, Long id) {
        return materialRepository.save(materialEchan);
    }

    @Override
    public void deleteMaterialEchan(Long id) {
        materialRepository.deleteById(id);
    }
}
