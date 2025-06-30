[spms.postman_collection.json](https://github.com/user-attachments/files/20978272/spms.postman_collection.json)Smart Parking Management System 🚗


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


## 📬 Postman Collection

Use this collection to test all Smart Parking Management System APIs:


[Uploading spms.postman_collection.json…{
	"info": {
		"_postman_id": "caf3fd46-a096-4eeb-8892-06f9cecde469",
		"name": "spms",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "40735357",
		"_collection_link": "https://bn6666.postman.co/workspace/-bn-Workspace~b46634b4-6556-44ff-8b8d-3efdfa8d759f/collection/40735357-caf3fd46-a096-4eeb-8892-06f9cecde469?action=share&source=collection_link&creator=40735357"
	},
	"item": [
		{
			"name": "User",
			"item": [
				{
					"name": "create new user",
					"request": {
						"auth": {
							"type": "noauth"
						},
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\n  \"email\": \"janedoe@example.com\",\n  \"password\": \"securePass123\",\n  \"name\": \"Jane\",\n  \"role\": \"ROLE_USER\",\n  \"phoneNumber\": \"0712345678\",\n  \"address\": \"456 Park Avenue\"\n}\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8081/api/users/register",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"api",
								"users",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get All Users",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8081/api/users/getAll",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"api",
								"users",
								"getAll"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get User By Id",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Delete User",
					"request": {
						"method": "DELETE",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8081/api/users/5",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"api",
								"users",
								"5"
							]
						}
					},
					"response": []
				},
				{
					"name": "Login User By Email & password",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"email\": \"johdoe@example.com\",\r\n  \"password\": \"$2a$10$0OoG0RkgcI7gLEwPoPa4f.wP.7Zq5MeHXKH0nX9Z3kUOfXRVQqor2\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8081/api/users/login",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"api",
								"users",
								"login"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update User",
					"request": {
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8081/api/users/4",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"api",
								"users",
								"4"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Parking Space",
			"item": [
				{
					"name": "get All",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/api/parking",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking"
							]
						}
					},
					"response": []
				},
				{
					"name": "Create New Parking Spaces",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"location\": \"Zone A2\",\r\n  \"isAvailable\": true,\r\n  \"hourlyRate\": 100.00,\r\n  \"ownerId\": \"OWNER003\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/api/parking",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Parking Space by Id",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/api/parking/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Available Parking Spaces",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/api/parking/available",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking",
								"available"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Parking Spaces by Owner ID",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/api/parking/owner/OWNER001",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking",
								"owner",
								"OWNER001"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update Parking Spaces",
					"request": {
						"method": "PUT",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/api/parking/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Delete Parking Spaces",
					"request": {
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/api/parking/2",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"parking",
								"2"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Vehicle",
			"item": [
				{
					"name": "Get All Vehicles",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/api/vehicles/getAll",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"getAll"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get All Vehicles by ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/api/vehicles/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Vehicles by User ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/api/vehicles/users/2",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"users",
								"2"
							]
						}
					},
					"response": []
				},
				{
					"name": "Create New Vehicle",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"licensePlate\": \"ABC-1234\",\r\n  \"model\": \"Toyota Aqua\",\r\n  \"color\": \"Blue\",\r\n  \"userId\": \"1\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8082/api/vehicles/save",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"save"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update Vehicle",
					"request": {
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/api/vehicles/1\n",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"api",
								"vehicles",
								"1\n"
							]
						}
					},
					"response": []
				},
				{
					"name": "Delete Vehicle",
					"request": {
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/api/vehicles/1\n",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"1\n"
							]
						}
					},
					"response": []
				},
				{
					"name": "Assign Vehicle to Parking Space",
					"request": {
						"method": "PUT",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/api/vehicles/1/parking-space/3\n",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"api",
								"vehicles",
								"1",
								"parking-space",
								"3\n"
							]
						}
					},
					"response": []
				},
				{
					"name": "Remove Vehicle from Parking Space",
					"request": {
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/api/vehicles/1/parking-space\n",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"api",
								"vehicles",
								"1",
								"parking-space\n"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Payment",
			"item": [
				{
					"name": "Get All Payments",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payment by ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payments by User ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments/user/U001",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments",
								"user",
								"U001"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payments by Parking Space ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments/parking-space/3",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments",
								"parking-space",
								"3"
							]
						}
					},
					"response": []
				},
				{
					"name": "Create New Payment",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": \"U001\",\r\n  \"parkingSpaceId\": 3,\r\n  \"amount\": 500.00,\r\n  \"status\": \"PENDING\",\r\n  \"timestamp\": \"2025-06-18T20:00:00\",\r\n  \"paymentMethod\": \"CREDIT_CARD\",\r\n  \"receiptNumber\": \"R123456789\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8084/api/payments",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments"
							]
						}
					},
					"response": []
				},
				{
					"name": "Process Payment by ID",
					"request": {
						"method": "POST",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments/1/process",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments",
								"1",
								"process"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update Payment by ID",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": ""
						}
					},
					"response": []
				},
				{
					"name": "Delete Payment by ID",
					"request": {
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/api/payments/2",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"api",
								"payments",
								"2"
							]
						}
					},
					"response": []
				}
			]
		}
	]
}]()


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
