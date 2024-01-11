package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.Patient;
import com.example.labxspringboot.repository.IPatientRepository;
import com.example.labxspringboot.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private IPatientRepository iPatientRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return iPatientRepository.save(patient) ;
    }

    @Override
    public List<Patient> getPatients() {
        return iPatientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return iPatientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return iPatientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        iPatientRepository.deleteById(id);
    }
}
