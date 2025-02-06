
# Microservices Project with Spring Framework
![Captura de pantalla 2025-02-05 165720](https://github.com/user-attachments/assets/93a69550-70d3-4a1e-a8f8-be426681d271)

This project was developed following a tutorial from the YouTube channel [Un Programador Nace](https://www.youtube.com/@unprogramadornace), specifically the series **"Microservices with Spring Framework"**. Below are the main features of the implemented microservices ecosystem.

---

#### **Ecosystem Description**

The ecosystem consists of several independent services that work together:

1. **API Gateway**:
   - Provides a single entry point for client requests.
   - Redirects requests to the appropriate microservice based on the request.

2. **Courses Microservice**:
   - Manages logic related to courses.
   - Connected to a MySQL database.
   - Runs on port **9091**.

3. **Students Microservice**:
   - Manages logic related to students.
   - Connected to a MySQL database.
   - Runs on port **8090**.

   **Note**: Both microservices (`courses` and `students`) can communicate with each other via HTTP REST requests.

4. **Registry Server (Eureka)**:
   - Centralizes the registration of all microservices in one place, simplifying their management.
   - Runs on port **8761**.

5. **Config Server**:
   - Stores and manages the configurations for each microservice.
   - Allows centralized management of service properties.

---

#### **Technologies Used**
- Spring Framework (Spring Boot, Spring Cloud).
- MySQL as the database.
- Eureka for service registration.
- API Gateway for request routing.

---

#### **Additional Notes**
This project was developed for educational purposes and as part of guided learning. Special thanks to the [Un Programador Nace](https://www.youtube.com/@unprogramadornace) channel for their excellent content and tutorials.
