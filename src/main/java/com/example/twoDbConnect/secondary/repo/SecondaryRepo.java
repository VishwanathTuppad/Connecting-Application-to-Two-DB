package com.example.twoDbConnect.secondary.repo;


import com.example.twoDbConnect.secondary.entity.SecondaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryRepo extends JpaRepository<SecondaryEntity, Long> {
}
