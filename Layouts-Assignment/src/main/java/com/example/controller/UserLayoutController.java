package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Layout;
import com.example.service.UserLayoutService;

@RestController
@RequestMapping("/user")
public class UserLayoutController {

    private static final Logger logger = LoggerFactory.getLogger(UserLayoutController.class);

    @Autowired
    private UserLayoutService userLayoutService;

    @GetMapping("/layout/{userId}")
    public Layout getUserLayout(@PathVariable Long userId) {
        logger.info("Received request to fetch layout for user with ID: {}", userId);
        
        Layout layout = userLayoutService.getUserLayout(userId);
        
        if (layout == null) {
            logger.warn("No layout found for user ID: {}", userId);
        } else {
            logger.info("Successfully retrieved layout for user ID: {}", userId);
        }
        
        return layout;
    }
}
