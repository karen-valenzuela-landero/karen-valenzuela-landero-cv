package com.karenvalenzuela.cv.controller;

import com.karenvalenzuela.cv.model.Profile;
import com.karenvalenzuela.cv.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProfileController {
    
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public Profile getProfile() {
        return profileService.getProfile();
    }

}
