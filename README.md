# Spring Boot CRUD System - Student Registration

## Project Description

This project is a **Student Registration System** built using **Spring Boot** framework. It demonstrates the implementation of **CRUD (Create, Read, Update, Delete)** operations using **REST API** and integrates with a **MySQL** database for persistent storage of student information. The application provides a user-friendly interface where users can add new students, view the list of all registered students, edit student information, and delete records. 

The backend is developed using **Spring Boot**, while the frontend utilizes **Thymeleaf** templates with **Bootstrap** for styling. The application is designed with RESTful principles to manage student data efficiently and is highly scalable for future enhancements like validation, authentication, and more.

## Features

- **Add Students**: Register a new student in the system.
- **List Students**: View the list of all registered students.
- **Edit Student Information**: Update the details of any student.
- **Delete Students**: Remove a student from the database.
- **REST API Endpoints**: Expose the API to perform the above operations.

## Technologies Used

- **Spring Boot**: Backend framework to build the application and expose RESTful APIs.
- **Thymeleaf**: Template engine for rendering dynamic content on the frontend.
- **MySQL**: Database for persistent storage of student records.
- **Bootstrap 5**: Frontend styling and responsive design.
- **Maven**: Build and dependency management.
- **REST API**: For client-server communication using HTTP requests.
  
## Database Configuration
This project uses **MySQL** as the database. You will need to set up a MySQL instance and configure the connection details in the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

