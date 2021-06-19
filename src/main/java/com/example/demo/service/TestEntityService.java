package com.example.demo.service;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TestEntityService {

    @Autowired
    private TestEntityRepository testEntityRepository;


    public Page<TestEntity> find(String status) {
        Pageable pageable = PageRequest.of(1, 10);
        return testEntityRepository.findByName(status, pageable);
    }

    public Page<TestEntity> findVersion(Integer version) {
        Pageable pageable = PageRequest.of(1, 10);
        return testEntityRepository.findByVersion(version, pageable);
    }
}
