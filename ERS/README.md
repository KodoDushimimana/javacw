This group is composed of 10 people and collaborating on coursework project of a simple application that connects to OpenOffice base as the database

#Credentials for the ERS

Username: Admin Password: Admin@123

Project Overview
The Exhibition Registration System (ERS) is a Java-based desktop application developed to streamline the process of registering participants for an exhibition. The system provides a user-friendly graphical interface that allows participants to enter their details, and administrators to manage these records efficiently.

This system supports full CRUD (Create, Read, Update, Delete) operations and ensures that participant information such as registration ID, name, faculty, contact details, and project information is properly captured and stored in a backend database. Java Swing is used for the GUI, while JDBC is used for database connectivity. The application follows Object-Oriented Programming (OOP) principles for scalability and maintainability.

System Features
Register: Allows entry of new participant data and saves it to the database.
Update: Modifies existing participant details in the system.
Delete: Removes participant records from the database.
Exit: Closes the application interface safely.

Advantages of the ERS
* User-Friendly Interface: Clean and intuitive layout built using Java Swing.
* Secure Access: Includes basic login functionality to restrict access.
* Structured Codebase: Built using OOP principles for clear code separation and ease of maintenance.
* Reusable Components: DAO and model classes can be reused in similar systems.

Summary of Key Classes
Student.java: A model class representing a participant, encapsulating their personal and exhibition details.

recordsDAO.java: A Data Access Object that executes SQL operations, abstracting the database layer from the business logic.

Login.java: Provides a simple login mechanism to control access to the system.

homepage.java: The main graphical user interface where users can interact with the system through buttons and input fields.

Ers.java: The entry point of the application that initializes and displays the GUI.