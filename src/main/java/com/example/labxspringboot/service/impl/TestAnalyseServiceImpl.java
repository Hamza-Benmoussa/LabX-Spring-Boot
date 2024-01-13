package com.example.labxspringboot.service.impl;

import com.example.labxspringboot.entity.TestAnalyse;
import com.example.labxspringboot.repository.ITestAnalyseRepository;
import com.example.labxspringboot.service.ITestAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestAnalyseServiceImpl implements ITestAnalyseService {

    @Autowired
    private ITestAnalyseRepository testRepository;

    @Override
    public TestAnalyse saveTestAnalyse(TestAnalyse testAnalyse) {
        return testRepository.save(testAnalyse);
    }

    @Override
    public List<TestAnalyse> getTestAnalyses() {
        return testRepository.findAll();
    }

    @Override
    public TestAnalyse getTestAnalyseById(Long id) {
        return testRepository.findById(id).orElse(null);
    }

    @Override
    public TestAnalyse updateTestAnalyse(TestAnalyse testAnalyse, Long id) {
        return testRepository.save(testAnalyse);
    }

    @Override
    public void deleteTestAnalyse(Long id) {
        testRepository.deleteById(id);
    }
}
