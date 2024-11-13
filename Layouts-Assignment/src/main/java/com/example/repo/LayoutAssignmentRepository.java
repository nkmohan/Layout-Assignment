package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.LayoutAssignment;

@Repository
public interface LayoutAssignmentRepository extends JpaRepository<LayoutAssignment, Long> {
    Optional<LayoutAssignment> findByUserId(Long userId);
    Optional<LayoutAssignment> findByGroupId(Long groupId);
}
