package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Layout;

@Repository
public interface LayoutRepository extends JpaRepository<Layout, Long>{
	
}