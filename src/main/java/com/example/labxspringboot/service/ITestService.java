package com.example.labxspringboot.service;

import com.example.labxspringboot.entity.Test;

import java.util.List;

public interface ITestService {
    Test saveTest(Test test);
    List<Test> getTests();
    Test getTestById(Long id);
    Test updateTest(Test test, Long id);
    void deleteTest(Long id);
}
