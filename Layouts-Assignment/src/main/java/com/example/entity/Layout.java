package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Layout {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long layoutId;
    private String layoutName;
    private String layoutDescription;

    // Getters and setters
}