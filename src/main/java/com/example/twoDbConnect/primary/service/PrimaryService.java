package com.example.twoDbConnect.primary.service;

import com.example.twoDbConnect.primary.entity.PrimaryEntity;
import com.example.twoDbConnect.primary.repo.PrimaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimaryService {

    @Autowired
    private PrimaryRepo primaryRepo;

    public List<PrimaryEntity> getAll() {
        return primaryRepo.findAll();
    }

    public PrimaryEntity save(PrimaryEntity entity) {
        return primaryRepo.save(entity);
    }
}
