# Spring Boot Multi-Database Configuration

This project demonstrates a multi-database connection setup in a Spring Boot application using the MVC architecture. The application is designed to connect to two databases (primary and secondary) with independent configurations for seamless operations.

## Features

+ **Multi-Database Configuration:**
Separate configurations for the Primary and Secondary databases using Spring's @Configuration annotation.
DataSource, EntityManagerFactory, and TransactionManager for each database.
+ **Modular Structure:**
Clear separation of concerns with distinct packages for controllers, services, repositories, and entities.
+ **Database Properties:**
Configured via application.properties (or application.yml) file for both primary and secondary databases.
+ **Spring Data JPA:**
Simplifies database operations with repositories for each database.
+ **Scalable:**
Easily extendable to add more databases or business logic.

## Prerequisites
+ **Java 17 or higher**
+ **Spring Boot 3.3.x**
+ **MySQL or any database of your choice**
+ **Maven/Gradle**

## API Endpoints
+ **Primary Database**
GET /primary
Description: Retrieves all records from the primary database.
POST /primary
Description: Saves a new record to the primary database.

+ **Secondary Database**
GET /secondary
Description: Retrieves all records from the secondary database.
POST /secondary
Description: Saves a new record to the secondary database.

## Technologies Used
+ **Java 17**
+ **Spring Boot 3.3.x**
+ **Spring Data JPA**
+ **MySQL**



