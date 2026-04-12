package com.karenvalenzuela.cv.controller;

import com.karenvalenzuela.cv.model.Profile;
import com.karenvalenzuela.cv.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/api/profile")
    public Profile getProfile() {
        return profileService.getProfile();
    }
    
}
