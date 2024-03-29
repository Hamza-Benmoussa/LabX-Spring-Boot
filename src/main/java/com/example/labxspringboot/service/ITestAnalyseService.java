package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.TestAnalyse;

import java.util.List;

public interface ITestAnalyseService {
    TestAnalyse saveTestAnalyse(TestAnalyse testAnalyse);
    List<TestAnalyse> getTestAnalyses();
    TestAnalyse getTestAnalyseById(Long id);
    TestAnalyse updateTestAnalyse(TestAnalyse testAnalyse, Long id);
    void deleteTestAnalyse(Long id);
}
