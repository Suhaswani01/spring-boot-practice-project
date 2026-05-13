# 👨‍💼 Employee Management System
### Spring Boot | Layered Architecture | JDBC | MySQL

A console-based Employee Management System built with Spring Boot,
demonstrating Layered Architecture, JDBC operations, and MySQL integration.

---

## 🏗 Architecture
AppRunner (Entry Point)
↓
EmployeeService (Business Logic) [@Service]
↓
EmployeeDAO (Database Operations) [@Repository]
↓
MySQL Database (employeedb)

---

## 📁 Project Structure
src/main/java/com/example/Miniproject04/
│
├── Miniproject04Application.java     ← Entry point
├── model/
│   └── Employee.java                 ← Data Model
├── dao/
│   ├── EmployeeDao.java              ← DAO Interface
│   └── EmloyeeImplDao.java           ← DB Operations (@Repository)
├── service/
│   ├── EmployeeService.java          ← Service Interface
│   └── EmployeeServiceImpl.java      ← Business Logic (@Service)
└── runner/
└── AppRunner.java                ← CommandLineRunner

---

## 💡 Concepts Covered

| Concept | Description |
|---|---|
| Layered Architecture | Model → DAO → Service → Runner |
| DAO Pattern | `@Repository` for DB operations |
| Service Layer | `@Service` for business logic |
| JdbcTemplate | Simplified JDBC operations |
| HikariCP | Auto-configured connection pooling |
| Loose Coupling | Interface-based design |
| Dependency Injection | `@Autowired` throughout |
| AUTO_INCREMENT | Surrogate primary key |

---

## 🛠 Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | Latest |
| MySQL | 8.0 |
| Maven | Latest |
| HikariCP | Auto-configured |

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- MySQL 8.0+
- Maven

### 1. Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/employee-management-spring-boot.git
cd employee-management-spring-boot
```

### 2. Database Setup
```sql
CREATE DATABASE employeedb;
USE employeedb;

CREATE TABLE employee (
    EMPNO   INT AUTO_INCREMENT PRIMARY KEY,
    ENAME   VARCHAR(50),
    SAL     DOUBLE,
    DEPTNO  INT
);
```

### 3. Configure application.properties
```bash
# Copy the example file
cp application.properties.example src/main/resources/application.properties
```

Fill in your credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

---

## ✅ Expected Output
Employee inserted: Rahul
Employee inserted: Priya
Employee inserted: Amit
=== All Employees ===
Employee [empno=1, ename=Rahul, sal=50000.0, deptno=10]
Employee [empno=2, ename=Priya, sal=60000.0, deptno=20]
Employee [empno=3, ename=Amit,  sal=55000.0, deptno=10]

---

## 📚 Key Learnings
@Component      →  Generic Spring Bean
@Service        →  Business Logic Layer
@Repository     →  Data Access Layer
@Autowired      →  Dependency Injection
JdbcTemplate    →  Simplified DB Operations
HikariCP        →  Connection Pool Management

---

## 🔗 Related Sessions

| Session | Topic |
|---|---|
| Session 5 | Spring Annotations |
| Session 6 | Loose Coupling + JDBC |
| Session 7 | Mini Project + MySQL |
| Session 8 | Layered Architecture |
| Session 9 | MySQL Connection + Debugging |

---

## 👨‍💻 Author
