package com.karenvalenzuela.cv.model;

import java.util.List;

public class Profile {
    private String name;
    private String role;

    private List<String> coreSkills;
    private List<String> devExperience;
    private List<String> qaExperience;
    private List<String> languages;
    private List<String> technologies;
    
    public Profile(String name, String role,
                   List<String> coreSkills,
                   List<String> devExperience,
                   List<String> qaExperience,
                   List<String> languages,
                   List<String> technologies) {

        this.name = name;
        this.role = role;
        this.coreSkills = coreSkills;
        this.devExperience = devExperience;
        this.qaExperience = qaExperience;
        this.languages = languages;
        this.technologies = technologies;
    }

    // Getters
    public String getName() { return name; }
    public String getRole() { return role; }
    public List<String> getCoreSkills() { return coreSkills; }
    public List<String> getDevExperience() { return devExperience; }
    public List<String> getQaExperience() { return qaExperience; }
    public List<String> getLanguages() { return languages; }
    public List<String> getTechnologies() { return technologies; }
    
}
