package com.example.twoDbConnect.primary.controller;

import com.example.twoDbConnect.primary.entity.PrimaryEntity;
import com.example.twoDbConnect.primary.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/primary")
public class PrimaryController {

    @Autowired
    private PrimaryService primaryService;

    @GetMapping
    public List<PrimaryEntity> getAll() {
        return primaryService.getAll();
    }

    @PostMapping
    public PrimaryEntity save(@RequestBody PrimaryEntity entity) {
        return primaryService.save(entity);
    }
}
