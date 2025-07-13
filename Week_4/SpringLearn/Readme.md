# Spring REST Hands-on Assignments (Spring Boot + XML + REST API)

This repository contains four Spring Boot hands-on assignments that demonstrate practical use of:
- REST APIs using Spring Web
- XML-based bean configuration
- CRUD operations
- Input validation
- Global exception handling
- Proper MVC layering (Controller, Service, DAO, Model)

---

## 📁 Project Structure

```bash
spring-learn/
├── controller/
├── service/
├── dao/
├── model/
├── exception/
├── resources/
│   ├── application.properties
│   ├── country.xml
│   ├── employee.xml
│   └── department.xml
├── SpringLearnApplication.java
├── pom.xml
└── README.md


---

## ✅ Assignment Overview

### 🟢 Assignment 1: Hello REST
- **Endpoint:** `/hello`
- **Description:** Basic `@RestController` returning `Hello World!!` via `GET`.

---

### 🟢 Assignment 2: Country API via XML
- **Endpoints:**
  - `GET /country` – Get a single country from XML bean
  - `GET /countries` – Get all countries (loaded via XML)
  - `GET /countries/{code}` – Fetch country by code (with exception handling)
- **Concepts Used:** XML beans, list injection, `@PathVariable`, `@ControllerAdvice`, custom exception

---

### 🟢 Assignment 3: Employee & Department API
- **Endpoints:**
  - `GET /employees` – Get all employees from XML
  - `GET /departments` – Get all departments from XML
- **Concepts Used:** XML config for nested beans (`Employee`, `Department`, `Skill`), model mapping, multi-file wiring

---

### 🟢 Assignment 4: RESTful CRUD with Validation
- **Endpoints:**
  - `GET /countries` – List all countries
  - `POST /countries` – Add a new country (uses `@Valid`)
  - `GET /employees` – View all employees
  - `PUT /employees` – Update employee (validated input)
  - `DELETE /employees/{id}` – Delete employee by ID
- **Concepts Used:**
  - `@Valid`, `@Size`, `@NotNull` from Jakarta Validation API
  - Global exception handling using `@ControllerAdvice`
  - JSON parsing (`@RequestBody`)
  - `@RestController` and REST standards
  - In-memory list operations

---

## 🛠 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Context (XML)
- Jakarta Bean Validation
- Maven
- Postman for testing

---

## ▶️ How to Run

```bash
# In IntelliJ Terminal or command line
mvn spring-boot:run
