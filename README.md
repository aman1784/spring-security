# Spring Boot Security Mini Project

This is a sample Spring Boot project demonstrating:

- User registration and login with JWT authentication
- Role-based authorization (ADMIN, USER)
- Manual user-role mapping without foreign keys or @ManyToMany JPA
- Clean DTO, mapper, and layered architecture
- Secure REST APIs with Spring Security and JWT
- Exception handling with global advice

---

## Features

- Register new users (default role USER)
- Authenticate users and receive JWT token
- Access role-protected endpoints
- Manual database relations without FK constraints

---

## Prerequisites

- Java 17+
- Gradle
- MySQL database

---

## Setup

1. Clone the repo:

```bash
git clone https://github.com/yourusername/security-demo.git
cd security-demo
```

2. Configure `src/main/resources/application.properties` with your MySQL credentials and JWT secret:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=root
spring.datasource.password=yourpassword

jwt.secret=YourJwtSecretKeyHere
jwt.expirationMs=86400000
```

3. Run MySQL scripts located in `db/schema.sql` to create tables.

4. Build and run the app:

```bash
./gradlew bootRun
```

---

## Testing APIs

- POST `/auth/register` to create users
- POST `/auth/login` to get JWT token
- Use JWT token in `Authorization: Bearer <token>` header for protected APIs
- GET `/api/admin/users` accessible only by ADMIN role
- GET `/api/user/profile` accessible by USER or ADMIN

---

## Notes

- Passwords are stored using BCrypt hashing.
- JWT token includes roles as claims.
- Roles and users are linked manually by storing user_id in role table (no foreign keys).
- Mapper interfaces help convert entities to DTOs and vice versa.

