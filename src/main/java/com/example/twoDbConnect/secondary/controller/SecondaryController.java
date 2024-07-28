package com.example.twoDbConnect.secondary.controller;


import com.example.twoDbConnect.secondary.entity.SecondaryEntity;
import com.example.twoDbConnect.secondary.service.SecondaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secondary")
public class SecondaryController {

    @Autowired
    private SecondaryService secondaryService;

    @GetMapping
    public List<SecondaryEntity> getAll() {
        return secondaryService.getAll();
    }

    @PostMapping
    public SecondaryEntity save(@RequestBody SecondaryEntity entity) {
        return secondaryService.save(entity);
    }
}
