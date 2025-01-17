package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.LayoutAssignment;
import com.example.repo.LayoutAssignmentRepository;
import com.example.service.LayoutAssignmentService;

@Service
public class LayoutAssignmentServiceimpl implements LayoutAssignmentService {
    @Autowired
    private LayoutAssignmentRepository layoutAssignmentRepository;

	@Override
	public void assignLayout(LayoutAssignment request) {
		LayoutAssignment layoutAssignment = new LayoutAssignment();
        layoutAssignment.setUserId(request.getUserId());
        layoutAssignment.setGroupId(request.getGroupId());
        layoutAssignment.setLayoutId(request.getLayoutId());
        layoutAssignmentRepository.save(layoutAssignment);
		
	}

	@Override
	public void updateLayout(LayoutAssignment request) {
		 LayoutAssignment layoutAssignment = layoutAssignmentRepository.findByUserId(request.getUserId())
	                .orElseThrow(() -> new RuntimeException("Assignment not found"));
	        layoutAssignment.setLayoutId(request.getLayoutId());
	        layoutAssignmentRepository.save(layoutAssignment);
		
	}
}