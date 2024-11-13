package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.LayoutAssignment;
import com.example.service.LayoutAssignmentService;

@RestController
@RequestMapping("/admin")
public class LayoutAssignmentController {

    private static final Logger logger = LoggerFactory.getLogger(LayoutAssignmentController.class);

    @Autowired
    private LayoutAssignmentService layoutAssignmentService;

    @PostMapping("/assign-layout")
    public ResponseEntity<String> assignLayout(@RequestBody LayoutAssignment request) {
        logger.info("Received request to assign layout: {}", request);
        
        layoutAssignmentService.assignLayout(request);
        
        logger.info("Layout assigned successfully for user ID: {}", request.getUserId());
        return ResponseEntity.ok("Layout assigned successfully");
    }

    @PutMapping("/update-layout")
    public ResponseEntity<String> updateLayout(@RequestBody LayoutAssignment request) {
        logger.info("Received request to update layout: {}", request);
        
        layoutAssignmentService.updateLayout(request);
        
        logger.info("Layout updated successfully for user ID: {}", request.getUserId());
        return ResponseEntity.ok("Layout updated successfully");
    }
}
