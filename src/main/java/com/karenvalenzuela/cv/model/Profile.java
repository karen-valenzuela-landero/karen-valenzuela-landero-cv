package com.karenvalenzuela.cv.model;

import java.util.List;

public class Profile {
    private String name;
    private String role;

    private List<String> devExperience;
    private List<String> qaExperience;
    private List<String> languages;
    private List<String> technologies;
    private List<String> coreSkills;

    public Profile(String name, String role,
                   List<String> devExperience,
                   List<String> qaExperience,
                   List<String> languages,
                   List<String> technologies,
                   List<String> coreSkills) {

        this.name = name;
        this.role = role;
        this.devExperience = devExperience;
        this.qaExperience = qaExperience;
        this.languages = languages;
        this.technologies = technologies;
        this.coreSkills = coreSkills;
    }

    // Getters
    public String getName() { return name; }
    public String getRole() { return role; }
    public List<String> getDevExperience() { return devExperience; }
    public List<String> getQaExperience() { return qaExperience; }
    public List<String> getLanguages() { return languages; }
    public List<String> getTechnologies() { return technologies; }
    public List<String> getCoreSkills() { return coreSkills; }

}
