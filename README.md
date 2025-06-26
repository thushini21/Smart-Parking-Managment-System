Smart Parking Management System 🚗


A Microservices-based system developed with Spring Boot, Spring Cloud, Eureka, and JWT Security.
It manages user registration, vehicle entry/exit, parking space allocation, reservations, and payments using a secure and scalable architecture.

📁 Project Structure
Smart-Parking-Management-System/

├── api-gateway/

├── config-server/

├── eureka-server/

└── docs/

├── user-service/

├── vehicle-service/

├── parking-service/

├── payment-service/

├── README.md


How to Run


* Start eureka server
* Start all microservices
* Open Postman and use the below collection to test endpoints
* Visit http://localhost:8761 to verify service registration

![eureka dashboard ss](https://github.com/user-attachments/assets/dcec032c-e0b6-4260-acca-c7f3134c9fd7)


The API documentation is available in the Postman collection: [Postman Collection](https://www.postman.com/collections/[https://web.postman.co/workspace/b46634b4-6556-44ff-8b8d-3efdfa8d759f/collection/40735357-0d07806e-cadc-4c83-9689-d5f807f6a8b5?action=share&source=copy-link&creator=40735357]

🧪 Technologies Used


Java 21

Spring Boot

Spring Cloud Gateway

Spring Security 

Eureka Discovery

RestTemplate / WebClient

MySQL

Lombok

Postman


Features

Real-time parking space availability tracking

Dynamic space allocation

Digital transactions and booking receipts

User authentication and authorization

Vehicle tracking and management

Payment processing

Historical logs and analytics
