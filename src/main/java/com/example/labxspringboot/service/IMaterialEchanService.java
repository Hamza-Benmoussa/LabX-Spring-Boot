package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.MaterielEchan;

import java.util.List;

public interface IMaterialEchanService {
    MaterielEchan saveMaterialEchan(MaterielEchan materialEchan);
    List<MaterielEchan> getMaterialEchans();
    MaterielEchan getMaterialEchanById(Long id);
    MaterielEchan updateMaterialEchan(MaterielEchan materialEchan, Long id);
    void deleteMaterialEchan(Long id);
}
