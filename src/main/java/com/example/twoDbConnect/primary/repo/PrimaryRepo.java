package com.example.twoDbConnect.primary.repo;


import com.example.twoDbConnect.primary.entity.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryRepo extends JpaRepository<PrimaryEntity, Long> {
}
