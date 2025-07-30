# Spring Boot Software Engineer API

A RESTful API built with Spring Boot for managing software engineer records. This project demonstrates a typical Spring Boot application with layered architecture, JPA integration, and PostgreSQL database.

## 🚧 Project Status
**Work in Progress** - This project is currently under development.

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Docker Compose**

## 📋 Prerequisites

- Java 21 or higher
- Docker and Docker Compose
- Maven (or use the included Maven wrapper)

## 🚀 Getting Started

### 1. Clone the repository
```bash
git clone <repository-url>
cd init-springboot
```

### 2. Start the database
```bash
docker-compose up -d
```

### 3. Run the application
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

### Base Endpoints
- `GET /` - Hello World endpoint
- `GET /api/v1/software-engineers` - Get all software engineers


## 🏗️ Project Structure

```
src/main/java/com/ariqbelajar/springboot/
├── Application.java                    # Main application class
├── SoftwareEngineer.java              # JPA Entity
├── SoftwareEngineerRepository.java    # Data access layer
├── SoftwareEngineerService.java       # Business logic layer
└── SoftwareEngineerController.java    # REST controller
```

## 🧪 Running Tests

```bash
./mvnw test
```

## 📦 Building the Application

```bash
./mvnw clean package
```

## 🔧 Development Commands

- **Compile**: `./mvnw clean compile`
- **Run tests**: `./mvnw test`
- **Run single test**: `./mvnw test -Dtest=ClassName`
- **Package**: `./mvnw clean package`

## 🐳 Docker

Start the PostgreSQL database:
```bash
docker-compose up -d
```

Stop the database:
```bash
docker-compose down
```

## 📝 Features

- [x] Basic Spring Boot setup
- [x] PostgreSQL integration
- [x] JPA entity configuration
- [x] REST API endpoints
- [x] Layered architecture (Controller → Service → Repository)
- [ ] CRUD operations (in progress)
- [ ] Input validation
- [ ] Error handling
- [ ] API documentation
- [ ] Unit tests
- [ ] Integration tests

## 📄 License

This project is for educational purposes.
