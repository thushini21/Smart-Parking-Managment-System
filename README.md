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
Start eureka server
Start all microservices
Open Postman and use the below collection to test endpoints
Visit http://localhost:8761 to verify service registration

![eureka dashboard ss](https://github.com/user-attachments/assets/dcec032c-e0b6-4260-acca-c7f3134c9fd7)


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
