package com.karenvalenzuela.cv.service;

import com.karenvalenzuela.cv.model.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    public Profile getProfile() {
        return new Profile(
                "Karen Valenzuela",
                "Java Full Stack Developer | QA Engineer",
//SKILLS
                List.of(
                        "Java",
                        "Spring Boot",
                        "REST APIs",
                        "SQL",
                        "Git",
                        "Docker",
                        "Maven",
                        "Microservices",
                        "CI/CD",
                        "Agile/Scrum",
                        "HTML",
                        "Javascript"
                ),
//DEV EXPERIENCE
                List.of(
                        "Java Development",
                        "Web Development",
                        "Unit Testing",
                        "Scrum",
                        "Velneo Development"
                ),
//QA EXPERIENCE
                List.of(
                        "Requirement Analysis",
                        "Search for Ambiguities",
                        "Test Matrix",
                        "Test Case Design",
                        "Execution of Test Cases",
                        "Defect Report",
                        "Defect Tracking",
                        "Test Status Report",
                        "Smoke Testing",
                        "Exploratory Testing",
                        "Regression Testing",
                        "API Testing"
                ),
//LANGUAGES
                List.of(
                        "Java",
                        "SQL",
                        "JavaScript",
                        "HTML/CSS"
                ),
//TECHNOLOGIES
                List.of(
                        "Azure DevOps Test Plans",
                        "Test & Feedback Plugin",
                        "Postman",
                        "Figma"
                )
        );
    }

}
