package com.example.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Layout;
import com.example.entity.LayoutAssignment;
import com.example.repo.LayoutAssignmentRepository;
import com.example.repo.LayoutRepository;
import com.example.service.UserLayoutService;

@Service
public class UserServiceImpl implements UserLayoutService{

	@Autowired
	private LayoutRepository layoutRepository;
	
	@Autowired
	private LayoutAssignmentRepository assignmentRepository;
	
	@Override
	public Layout getUserLayout(Long userId) {
		Optional<LayoutAssignment> findById = assignmentRepository.findById(userId);
		
		return findById.map(a -> layoutRepository.findById(a.getLayoutId()).orElse(null)).orElse(null);
	}

}
