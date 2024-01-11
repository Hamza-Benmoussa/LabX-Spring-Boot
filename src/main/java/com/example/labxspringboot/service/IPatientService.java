package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Patient;

import java.util.List;

public interface IPatientService {

    Patient savePatient(Patient patient);
    List<Patient> getPatients();
    Patient getPatientById(Long id);
    Patient updatePatient(Patient patient);
    void deletePatient(Long id);
}
