package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Layout;
import com.example.service.LayoutService;

@RestController
@RequestMapping("/admin")
public class LayoutController {

    private static final Logger logger = LoggerFactory.getLogger(LayoutController.class);

    @Autowired
    private LayoutService layoutService;

    @GetMapping("/layouts")
    public List<Layout> getAllLayouts() {
        logger.info("Received request to fetch all layouts");
        
        List<Layout> layouts = layoutService.getAllLayouts();
        
        if (layouts.isEmpty()) {
            logger.warn("No layouts found");
        } else {
            logger.info("Successfully retrieved {} layouts", layouts.size());
        }
        
        return layouts;
    }
}
