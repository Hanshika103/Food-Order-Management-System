# Food Order Management System

A desktop-based Food Order Management System developed using **Core Java, Java Swing, MySQL, and JDBC**. The application provides separate user and admin functionalities for managing food items, placing orders, and maintaining order-related data.

## Features

### User Features

- User registration
- User login and authentication
- View available food items
- Place food orders
- View order details
- Payment interface

### Admin Features

- Admin login
- Add new food items
- Update existing food items
- Delete food items
- View customer orders
- Manage menu items

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Application development |
| Java Swing | Graphical User Interface |
| MySQL | Database management |
| JDBC | Database connectivity |
| OOP | Application design |
| DAO Pattern | Database operation management |

## Project Architecture

The project follows a layered structure using **Model, DAO, UI, and Database** components.

```text
src/
│
├── dao/
│   ├── AdminDAO.java
│   ├── BookingDAO.java
│   ├── LoginDAO.java
│   ├── MenuDAO.java
│   └── RegistrationDAO.java
│
├── database/
│   └── DBConnection.java
│
├── model/
│   ├── MenuItem.java
│   ├── Order.java
│   ├── Registration.java
│   └── login.java
│
├── ui/
│   ├── AdminLoginFrame.java
│   ├── AdminMenuFrame.java
│   ├── AdminOrdersFrame.java
│   ├── BookingFrame.java
│   ├── LoginFrame.java
│   ├── MenuFrame.java
│   ├── OrdersFrame.java
│   ├── PaymentFrame.java
│   └── RegistrationFrame.java
│
└── main/
    └── Main.java
Architecture Components
UI Layer

The ui package contains the Java Swing frames responsible for the graphical interface and user interaction.

DAO Layer

The dao package handles database operations such as:

User registration
User authentication
Menu management
Order management
Admin operations
Model Layer

The model package contains classes representing application entities such as:

Users
Menu items
Orders
Login information
Database Layer

The database package contains the database connection utility responsible for establishing a connection with MySQL using JDBC.

Database

The application uses MySQL as the relational database.

The database stores application data related to users, menu items, and orders.

Database Configuration

The database connection is configured in:

src/database/DBConnection.java

The application uses an environment variable for the MySQL password instead of storing the password directly in the source code.

DB_PASSWORD

Security: Never commit your database password, .env files, or other sensitive credentials to GitHub.

Prerequisites

Before running the project, make sure you have:

Java JDK 8 or higher
MySQL Server
MySQL JDBC Driver
A Java IDE such as IntelliJ IDEA, Eclipse, or VS Code
How to Run
1. Clone the Repository
git clone https://github.com/Hanshika103/Food-Order-Management-System.git
2. Open the Project

Open the cloned project in your preferred Java IDE.

3. Configure MySQL

Create the required MySQL database:

CREATE DATABASE food_system_1;

Make sure MySQL Server is running.

4. Configure Database Password

Set the environment variable:

DB_PASSWORD

The value should be your MySQL password.

Windows PowerShell
$env:DB_PASSWORD="your_mysql_password"

For a permanent user environment variable, configure DB_PASSWORD through Windows Environment Variables.

Do not commit or share your actual database password.

5. Configure MySQL JDBC Driver

Make sure the MySQL Connector/J library is available in the project classpath.

6. Run the Application

Run:

src/main/Main.java

The application will start from the main class and open the appropriate Java Swing interface.

Application Flow
User
 │
 ├── Register
 │
 ├── Login
 │
 ├── View Menu
 │
 ├── Place Order
 │
 ├── Payment
 │
 └── View Orders
 │
 ▼
MySQL Database
Admin Flow
Admin
 │
 ├── Admin Login
 │
 ├── Manage Menu
 │     ├── Add Food Item
 │     ├── Update Food Item
 │     └── Delete Food Item
 │
 └── View Orders
 │
 ▼
MySQL Database
Key Highlights
Desktop-based food ordering application
User and admin role separation
MySQL database integration
JDBC-based database connectivity
CRUD operations for menu management
DAO-based database access
Object-oriented design using Java
Graphical user interface built with Java Swing
Environment-based database credential management
Project Structure
Food-Order-Management-System/
│
├── src/
│   ├── dao/
│   ├── database/
│   ├── model/
│   ├── ui/
│   └── main/
│
├── README.md
└── .gitignore
Security

Database credentials are not hardcoded in the source code.

The MySQL password is retrieved using:

System.getenv("DB_PASSWORD");

This prevents sensitive database credentials from being exposed in the public GitHub repository.

Future Improvements

The project can be extended with:

Shopping cart functionality
Online payment gateway integration
Order status tracking
Food search and filtering
Customer order history
Improved UI/UX
Food images and categories
Role-based access control
Input validation and improved error handling
Author

Hanshika Mukati

GitHub: Hanshika103
LeetCode: Hanshika Mukati
License

This project is created for educational and portfolio purposes
