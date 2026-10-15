# 🚗 Smart Vehicle Management System

A menu-driven Java application developed as part of **Practical 9 – Java OOP Laboratory Assignment**. This project demonstrates core Object-Oriented Programming (OOP) concepts through a vehicle fleet management system.

The application manages different types of vehicles, including cars, bikes, buses, electric cars, and electric bikes, using inheritance, abstraction, interfaces, runtime polymorphism, and Java collections.

## 📌 Project Overview

The Smart Vehicle Management System provides a simple console-based interface for managing a fleet of vehicles. Users can add vehicles, display their details, start and stop them, charge electric vehicles, and view GPS information for supported vehicles.

The project also demonstrates extensibility by adding new vehicle types without modifying the existing base class or vehicle subclasses.

## ✨ Features

- Add cars, bikes, buses, electric cars, and electric bikes.
- Display details of all registered vehicles.
- Start and stop vehicles using polymorphic method dispatch.
- Charge electric vehicles that implement the `Chargeable` interface.
- Display GPS information for vehicles that implement the `GPS` interface.
- Search for vehicles using unique vehicle IDs.
- Store multiple vehicle types in an `ArrayList<Vehicle>`.
- Validate user input and handle exceptions.
- Extend the system with new vehicle types.

## 🛠️ Technologies Used

- **Language:** Java
- **JDK:** 26
- **IDE:** IntelliJ IDEA
- **Collections:** Java Collections Framework
- **Version Control:** Git and GitHub

## 📂 Project Structure

```text
Practical-9/
│
├── src/
│   └── SmartVehicle_ManagementSystem/
│       ├── Vehicle.java
│       ├── Car.java
│       ├── Bike.java
│       ├── Bus.java
│       ├── Chargeable.java
│       ├── GPS.java
│       ├── ElectricCar.java
│       ├── ElectricBike.java
│       └── Main.java
│
└── README.md
```

## 🧠 OOP Concepts Implemented

### 1. Classes and Objects
Classes represent different vehicle types, while objects store the details of individual vehicles.

### 2. Encapsulation
The `Vehicle` class uses private fields and public getters and setters to control access to vehicle data.

### 3. Constructors
Parameterized constructors initialize vehicle properties when objects are created.

### 4. Inheritance
`Car`, `Bike`, `Bus`, `ElectricCar`, and `ElectricBike` extend the abstract `Vehicle` class.

### 5. Abstraction
The abstract `Vehicle` class defines the `start()` contract and provides a common `stop()` implementation.

### 6. Interfaces
- `Chargeable` defines the `charge()` capability.
- `GPS` defines the `showLocation()` capability.

### 7. Method Overriding
Each vehicle type provides its own implementation of `start()` and `displayDetails()` where appropriate.

### 8. Runtime Polymorphism
A `Vehicle` reference can point to different vehicle objects, allowing Java to execute the appropriate overridden method at runtime.

### 9. Collections
`ArrayList<Vehicle>` stores different vehicle types in a single collection.

### 10. Interface-Based Capability Detection
The `instanceof` operator checks whether a vehicle supports charging or GPS functionality.

### 11. Exception Handling
The application handles invalid numerical input and invalid vehicle property values.

### 12. Open/Closed Principle
The `ElectricBike` class demonstrates how a new vehicle type can extend the existing design without modifying `Vehicle`, `Car`, `Bike`, or `Bus`.

## 🚀 How to Run the Project

### Prerequisites

- Install JDK 26.
- Install IntelliJ IDEA.
- Clone or download this repository.

### Step 1: Clone the Repository

```bash
git clone https://github.com/rajsyntax/Java_Practical_9.git
```

### Step 2: Open the Project

Open the cloned `Java_Practical_9` project in IntelliJ IDEA and configure JDK 26.

### Step 3: Run the Application

Open `Main.java` inside the `SmartVehicle_ManagementSystem` folder and run its `main()` method.

### Step 4: Use the Console Menu

Choose an option from the displayed menu to add, display, start, stop, charge, or locate vehicles.

## 🖥️ Sample Console Menu

```text
======================================
 SMART VEHICLE MANAGEMENT SYSTEM
======================================
1.  Add Car
2.  Add Bike
3.  Add Bus
4.  Add Electric Car
5.  Add Electric Bike
6.  Display All Vehicles
7.  Start Vehicle
8.  Stop Vehicle
9.  Charge Vehicle
10. Show GPS Location
11. Exit
======================================
Enter your choice:
```

## 📍 GPS Demonstration

The electric vehicle classes demonstrate the `GPS` interface using sample coordinates. These are demonstration values and do not represent live GPS tracking.

## 🎯 Learning Objectives

- Understand the practical implementation of Java OOP concepts.
- Design reusable classes using inheritance and abstraction.
- Implement multiple interfaces for independent capabilities.
- Apply runtime polymorphism and collections.
- Handle invalid input using exception handling.
- Develop an extensible, menu-driven console application.

## 🔮 Future Enhancements

- Add persistent storage using files or a database.
- Introduce vehicle maintenance records.
- Add fuel and battery status tracking.
- Implement real GPS integration.
- Develop a graphical user interface.

## 👨‍💻 Author

**Rajesh Maurya**

B.Tech Computer Science and Engineering

## 📄 License

This project was developed for educational and academic purposes as part of a Java OOP Laboratory Assignment.
