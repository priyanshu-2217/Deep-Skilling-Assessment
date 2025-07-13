# Spring Boot JWT Authentication Example

This project demonstrates how to implement JWT-based authentication and authorization in a Spring Boot 3 application using Spring Security 6.

---

## 🔐 Features

- Login using Basic Authentication
- Generate JWT token at `/authenticate`
- Secure endpoints (`/countries`, `/employees`) using JWT
- In-memory user roles (USER, ADMIN)
- Token expiration handling

---

## 🛠 Technologies

- Java 17+
- Spring Boot 3.1
- Spring Security 6
- JWT (JJWT 0.9.0)
- Maven

---

## ▶️ How to Run

1. Open the project in IntelliJ or any IDE
2. Run:
```bash
mvn spring-boot:run
App runs at:
🔗 http://localhost:8080

🔑 How to Use
✅ Step 1: Get JWT Token

curl -u user:pwd http://localhost:8080/authenticate
Response:


{ "token": "eyJhbGciOiJIUzI1NiJ9..." }
✅ Step 2: Access Secured Endpoints

Get Countries:

curl -H "Authorization: Bearer <paste_token_here>" http://localhost:8080/countries

Get Employees:

curl -H "Authorization: Bearer <paste_token_here>" http://localhost:8080/employees

