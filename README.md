# 🎓 Student Management System

A console-based **Student Management System** developed using Core Java. This project demonstrates fundamental Object-Oriented Programming (OOP) concepts, CRUD operations, Collections, Generics, and Exception Handling through a simple and structured application.

## 📌 Project Overview

The Student Management System allows users to manage student records through a menu-driven console application.

Users can add new students, view all student records, search students by ID, update student information, delete records, and automatically calculate grades based on marks.

The project follows a modular class-based structure to maintain code readability, reusability, and separation of responsibilities.

## ✨ Features

- **Add Student:** Register a new student with ID, name, age, and marks.
- **View Students:** Display all registered student records.
- **Search Student:** Find a student using their unique ID.
- **Update Student:** Modify existing student information.
- **Delete Student:** Remove a student record.
- **Grade Calculation:** Automatically calculate grades based on marks.
- **Duplicate ID Validation:** Prevent registration with an existing student ID.
- **Input Validation:** Handle invalid IDs, ages, marks, and empty names.
- **Exception Handling:** Handle application errors using custom and built-in exceptions.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java (JDK 17+) | Core programming language |
| OOP | Application design |
| ArrayList | In-memory data storage |
| Generics | Reusable CRUD interface |
| Exception Handling | Error management |
| Scanner | Console input handling |
| IntelliJ IDEA | Development environment |
| Git & GitHub | Version control |

## 📂 Project Structure

```text
StudentManagementSystem/
│
├── src/
│   ├── Main.java
│   ├── Person.java
│   ├── Student.java
│   ├── StudentService.java
│   ├── StudentRepository.java
│   ├── CrudOperations.java
│   ├── GradeCalculator.java
│   └── InvalidStudentException.java
│
└── README.md
```

## 🧩 Class Responsibilities

| Class / Interface | Responsibility |
|---|---|
| `Main` | Application entry point and console menu |
| `Person` | Parent class containing common personal details |
| `Student` | Student entity with ID, marks, and grade calculation |
| `StudentService` | Handles business logic and input validation |
| `StudentRepository` | Manages student records and CRUD operations |
| `CrudOperations<T>` | Generic interface defining CRUD methods |
| `GradeCalculator` | Interface defining the grade calculation method |
| `InvalidStudentException` | Custom exception for student-related errors |

## 🧠 OOP Concepts Implemented

This project demonstrates the following Core Java concepts:

**1. Encapsulation**
- Private instance variables.
- Getters and setters for controlled data access.

**2. Inheritance**
- `Student` extends the `Person` class.
- Reuses common properties such as name and age.

**3. Abstraction**
- Interfaces define the required operations.
- Implementation details are provided by implementing classes.

**4. Polymorphism**
- Interface implementation and method overriding.
- `StudentRepository` implements `CrudOperations<Student>`.

**5. Constructors**
- Parameterized constructors initialize objects.
- `super()` invokes the parent class constructor.

**6. Generics**
- `CrudOperations<T>` provides a reusable CRUD contract.
- `List<Student>` provides type-safe collection handling.

**7. Exception Handling**
- Custom exception using `InvalidStudentException`.
- `try-catch` for handling runtime input errors.
- `throw` and `throws` for exception propagation.

## 📊 Grade Calculation Criteria

| Marks | Grade |
|---|---|
| 90 – 100 | A+ |
| 80 – 89 | A |
| 70 – 79 | B |
| 60 – 69 | C |
| 40 – 59 | D |
| Below 40 | Fail |

## ⚙️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK 17 or later)
- IntelliJ IDEA / Eclipse / VS Code
- Git

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/StudentManagementSystem.git
```

### Step 2: Navigate to the Project

```bash
cd StudentManagementSystem
```

### Step 3: Compile the Java Files

```bash
javac -d out src/*.java
```

### Step 4: Run the Application

```bash
java -cp out Main
```

## 💻 Application Menu

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice:
```

## 📷 Sample Output

**Adding a Student**

```text
--- Add Student ---

Enter Student ID: 101
Enter Student Name: Kailas
Enter Student Age: 22
Enter Student Marks: 85

Student added successfully!
```

**Displaying Student Records**

```text
--- Student Records ---

ID: 101, Name: Kailas, Age: 22,
Marks: 85.0, Grade: A
```

**Handling Duplicate Student ID**

```text
Enter Student ID: 101

Error: Student ID already exists!
```

## 📚 Learning Outcomes

Through this project, I practiced:

- Implementing Object-Oriented Programming principles in Java.
- Designing applications using multiple classes and interfaces.
- Understanding inheritance and polymorphism.
- Working with Java Collections and ArrayList.
- Implementing generic interfaces.
- Performing CRUD operations.
- Creating and handling custom exceptions.
- Structuring applications using Service and Repository layers.

## 🚀 Future Enhancements

The project can be extended with the following features:

- Database integration using JDBC and MySQL.
- Persistent student data storage.
- Student sorting and filtering.
- Search students by name.
- Calculate average marks.
- Generate student report cards.
- Add administrator login functionality.

## ⚠️ Limitations

- Student records are stored in an in-memory ArrayList.
- Data is lost when the application terminates.
- The application currently supports console-based interaction only.
- No database or external framework is used.

## 👨‍💻 Author

**Kailas Doke**

- GitHub: [KailasDoke](https://github.com/KailasDoke)
- LinkedIn: [Connect with me](https://www.linkedin.com/in/kailas-doke/)

---

⭐ If you find this project useful, feel free to explore the code and share your feedback.

**Built with Java | Practicing Core Java & OOP Concepts**
