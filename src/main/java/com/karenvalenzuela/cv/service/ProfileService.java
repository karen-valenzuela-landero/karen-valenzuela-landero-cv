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

                List.of(
                        "Spring Boot",
                        "Microservices",
                        "REST APIs",
                        "Docker",
                        "CI/CD",
                        "Agile"
                ),

                List.of(
                        "Java Development",
                        "Web Development",
                        "Unit Testing",
                        "Scrum",
                        "Velneo Development"
                ),

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

                List.of(
                        "HTML/CSS",
                        "JavaScript",
                        "Java",
                        "SQL"
                ),

                List.of(
                        "Azure DevOps Test Plans",
                        "Test & Feedback Plugin",
                        "Postman",
                        "Figma"
                )
        );
    }

}
