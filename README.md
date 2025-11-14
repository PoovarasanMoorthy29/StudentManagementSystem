# Student Management System (JDBC)

A simple Student Management System built using Java + JDBC + Postgresql
This project demonstrates fundamental CRUD operations (Create, Read, Update, Delete) and is perfect for beginners practicing JDBC.

# Project Structure
StudentManagement/
│
├── DBConnection.java
├── Student.java
├── StudentDAO.java
└── Main.java

📄 File Descriptions

1️⃣ DBConnection.java

Handles the database connection.
Contains getConnect() method
Connects to Postgresql database using JDBC
Used by StudentDAO to send queries

Responsible only for establishing and returning a Connection object
This class keeps JDBC connection logic separate and clean.

2️⃣ Student.java

A simple model/POJO class representing a Student entity.
Contains:
id
name
age
grade

Includes:

Constructor
Getter methods
This class is used to pass student data between layers.

3️⃣ StudentDAO.java
The Data Access Object responsible for all database operations.
Implements:

add(Student student)
viewAll()
update(id, name, age, grade)
deleteStudent(id)

This class interacts directly with the database using:
Connection
PreparedStatement
Statement
ResultSet
It contains all SQL queries for the project.

4️⃣ Main.java
The entry point of the project.
Contains:
Console menu (Add, View, Update, Delete, Search, Exit)
Accepts user input using Scanner
Calls appropriate methods from StudentDAO
This is the file you run to use the Student Management System.

🗄️ PostgreSQL Database Setup
Run these SQL commands in pgAdmin, psql, or your PostgreSQL terminal:

CREATE DATABASE student_db;
\c student_db;
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    grade VARCHAR(10)
);

Run Main.java.
🚀 Features
✔ Add new student
✔ View all students
✔ Update student details
✔ Delete student
✔ Auto resource management using try-with-resources
✔ Clean DAO pattern

📚 Learning Outcome
By building this project, you learn:

JDBC Connectivity
SQL CRUD operations
DAO Pattern
Using PreparedStatement
Handling ResultSet
Structuring small Java projects

📌 Future Enhancements

You can extend this project with:
Login system
Marks management
Attendance system
Export to CSV/PDF
GUI using JavaFX or Swing
