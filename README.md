# 💡 Project Overview

This is a REST API built with Spring Boot that serves structured data for a personal developer portfolio frontend.

It provides endpoints for retrieving profile information such as:

Developer skills
Professional experience
Technologies
Languages

# ⚙️ Tech Stack

Java
Spring Boot
Spring Web
Spring Boot REST API
Maven 
Swagger 

# 📡 API Features

RESTful endpoints
JSON structured responses
CORS enabled for frontend integration
Swagger documentation available

# 🔗 API Documentation

Swagger UI:
https://karen-valenzuela-landero-cv.onrender.com/swagger-ui.html


# 🌐 Frontend Consumer

This API is consumed by a Next.js frontend:
👉 https://karen-valenzuela-landero-cv-frontend.vercel.app

# 🚀 Deployment

Hosted on [Render](https://karen-cv-api.onrender.com/api/v1/profile)
⚠️ Note: The API may take up to 1 minute to start (free tier hosting).






## CV project

Includes :
⚙️ Build tool: Maven
🚀 Framework: Spring Boot 3.2.5
☕ Java: 17+


## Build 
mvn clean package
docker build -t karen-cv-api .
docker run -p 8080:8080 karen-cv-api
/*
Build del proyecto (Limpia y regenera proyecto)
Construye imagen en Docker
Ejecutar contenedor 
*/