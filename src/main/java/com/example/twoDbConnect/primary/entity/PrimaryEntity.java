package com.example.twoDbConnect.primary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PrimaryEntity {
    @Id
    private Long id;
    private String name;
}
