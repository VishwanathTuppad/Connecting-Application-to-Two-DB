package com.example.twoDbConnect.secondary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SecondaryEntity {
    @Id
    private Long id;
    private String description;
}
