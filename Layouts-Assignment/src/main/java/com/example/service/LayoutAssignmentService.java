package com.example.service;

import com.example.entity.LayoutAssignment;

public interface LayoutAssignmentService {
    void assignLayout(LayoutAssignment request);
    void updateLayout(LayoutAssignment request);
}