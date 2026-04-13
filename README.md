# 💼 My CV as an API

🌐 Interactive CV:
https://karen-valenzuela-landero-cv-frontend.vercel.app

🔗 API Endpoint:
https://karen-cv-api.onrender.com/api/v1/profile
⚠️ Note: The API may take up to 1 minute to start (free tier hosting).

🔗 API Docs:
https://karen-valenzuela-landero-cv.onrender.com/swagger-ui.html


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