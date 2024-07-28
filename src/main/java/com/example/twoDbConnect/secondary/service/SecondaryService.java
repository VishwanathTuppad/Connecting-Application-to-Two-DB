package com.example.twoDbConnect.secondary.service;

import com.example.twoDbConnect.secondary.entity.SecondaryEntity;
import com.example.twoDbConnect.secondary.repo.SecondaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondaryService {

    @Autowired
    private SecondaryRepo secondaryRepo;

    public List<SecondaryEntity> getAll() {
        return secondaryRepo.findAll();
    }

    public SecondaryEntity save(SecondaryEntity entity) {
        return secondaryRepo.save(entity);
    }
}
