# Java Practical 9 — Object-Oriented Programming

A collection of Java programming exercises developed to practice and strengthen core Object-Oriented Programming (OOP) concepts through structured, real-world-inspired problems.

This repository contains multiple practical questions, including an ATM system, a payment processing system, a vehicle hierarchy, and an extended vehicle hierarchy. Each program is organized into a separate directory to keep the source code readable, maintainable, and easy to execute.

The repository is designed to grow as additional questions and implementations are added to Practical 9.

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Objectives](#-objectives)
- [Technologies Used](#-technologies-used)
- [Repository Structure](#-repository-structure)
- [Practical Questions](#-practical-questions)
  - [Question 1 — ATM System](#question-1--atm-system)
  - [Question 2 — Payment System](#question-2--payment-system)
  - [Question 3 — Vehicle Hierarchy](#question-3--vehicle-hierarchy)
  - [Extended Question 3 — Advanced Vehicle Hierarchy](#extended-question-3--advanced-vehicle-hierarchy)
- [OOP Concepts Covered](#-oop-concepts-covered)
- [Prerequisites](#-prerequisites)
- [Installation and Setup](#-installation-and-setup)
- [How to Run](#-how-to-run)
- [Development Workflow](#-development-workflow)
- [Future Enhancements](#-future-enhancements)
- [Learning Outcomes](#-learning-outcomes)
- [Author](#-author)
- [Repository Link](#-repository-link)

---

## 📖 About the Project

**Java Practical 9** is an educational programming repository focused on implementing Object-Oriented Programming principles in Java.

Instead of writing all programs in a single file or directory, each question is maintained in its own folder. This organization makes it easier to understand individual solutions, test programs independently, and add more questions without disturbing existing implementations.

The practical exercises use different problem scenarios to demonstrate how Java classes, inheritance, interfaces, abstraction, and polymorphism can help organize code and represent relationships between real-world entities.

### Key Highlights

- Multiple independent Java programming exercises.
- Organized source code with separate folders for each question.
- Real-world-inspired examples such as banking, payment processing, and vehicles.
- Practice with class hierarchies and interface-based design.
- An extended vehicle example demonstrating additional classes and relationships.
- Git and GitHub version control for tracking changes.
- A scalable structure for adding future practical questions.

---

## 🎯 Objectives

The main objectives of this practical are:

1. Understand the structure and behavior of Java classes and objects.
2. Apply inheritance to establish relationships between parent and child classes.
3. Explore abstraction to define common behavior.
4. Use interfaces to describe capabilities that different classes can implement.
5. Implement method overriding to customize inherited behavior.
6. Understand runtime polymorphism through parent-type references and child objects.
7. Model simple real-world systems using OOP principles.
8. Organize source files into logical directories.
9. Practice maintaining and publishing source code through Git and GitHub.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming language |
| JDK | Compiling and executing Java programs |
| IntelliJ IDEA | Java development environment |
| Git | Source code version control |
| GitHub | Remote repository and code hosting |
| PowerShell | Running Git commands on Windows |

The programs are written in Java. The exact language features available depend on the installed JDK and the configuration used to compile each program.

---

## 📂 Repository Structure

```text
Java_Practical_9/
│
├── .gitignore
├── README.md
│
└── src/
    │
    ├── Question_1/
    │   ├── ATM.java
    │   ├── BankATM.java
    │   └── Main.java
    │
    ├── Question_2/
    │   ├── Payment.java
    │   ├── CashPayment.java
    │   ├── CardPayment.java
    │   ├── UPIPayment.java
    │   └── Main.java
    │
    ├── Question_3/
    │   ├── Vehicle.java
    │   ├── Car.java
    │   ├── Bike.java
    │   ├── Serviceable.java
    │   └── Main.java
    │
    └── Extended_Question_3/
        ├── Vehicle.java
        ├── Car.java
        ├── Bike.java
        ├── Truck.java
        ├── ElectricVehicle.java
        ├── ElectricCar.java
        ├── Serviceable.java
        └── Main.java
```

**Note:** The structure above reflects the source files currently included in the repository. Future questions can be added as new directories, such as `Question_4`, `Question_5`, and so on.

---

## 🧩 Practical Questions

### Question 1 — ATM System

**Directory:** `src/Question_1/`

This exercise represents an ATM-related system using separate classes.

**Source files:**

- `ATM.java`
- `BankATM.java`
- `Main.java`

**Concepts to explore:**

- Defining classes and creating objects.
- Establishing relationships between classes.
- Separating general ATM behavior from a bank-specific implementation.
- Using a main class to execute and test the program.

This example provides a foundation for understanding how object-oriented design can represent a banking-related system.

### Question 2 — Payment System

**Directory:** `src/Question_2/`

This exercise organizes different payment methods around a common payment abstraction.

**Source files:**

- `Payment.java`
- `CashPayment.java`
- `CardPayment.java`
- `UPIPayment.java`
- `Main.java`

**Concepts to explore:**

- Defining common payment behavior.
- Implementing different payment methods.
- Reusing a shared abstraction across multiple implementations.
- Overriding behavior where required by the program design.
- Separating payment-specific logic into individual classes.

**Real-world relevance:**

Payment systems commonly support multiple methods, such as cash, debit or credit cards, and UPI. A common abstraction can help organize these methods while allowing each implementation to provide its own behavior.

### Question 3 — Vehicle Hierarchy

**Directory:** `src/Question_3/`

This exercise models a basic vehicle hierarchy with different vehicle types and a service-related interface.

**Source files:**

- `Vehicle.java`
- `Car.java`
- `Bike.java`
- `Serviceable.java`
- `Main.java`

**Concepts to explore:**

- Inheritance between a general vehicle class and specific vehicle types.
- Reusing common vehicle properties and behavior.
- Implementing a shared interface for service-related capabilities.
- Overriding methods to customize child-class behavior.
- Using objects to represent different vehicle types.

**Real-world relevance:**

A vehicle management application can use a common vehicle structure while supporting different types of vehicles. Shared behavior can be maintained in a parent class, while specialized behavior is implemented in child classes.

### Extended Question 3 — Advanced Vehicle Hierarchy

**Directory:** `src/Extended_Question_3/`

This extended implementation expands the vehicle hierarchy with additional vehicle types and electric vehicle-related classes.

**Source files:**

- `Vehicle.java`
- `Car.java`
- `Bike.java`
- `Truck.java`
- `ElectricVehicle.java`
- `ElectricCar.java`
- `Serviceable.java`
- `Main.java`

**Concepts to explore:**

- Extending a class hierarchy with additional vehicle types.
- Modeling shared and specialized behavior.
- Working with inheritance across related classes.
- Representing electric vehicle functionality separately.
- Applying interfaces for common capabilities.
- Exploring how a hierarchy can be expanded as requirements grow.

**Real-world relevance:**

Vehicle management systems may need to represent cars, bikes, trucks, and electric vehicles. An extended hierarchy helps demonstrate how related entities can share common characteristics while retaining specialized behavior.

**Note:** The descriptions above explain the purpose suggested by the filenames and structure. Refer to each Java source file for the exact implemented functionality and method behavior.

---

## 🧠 OOP Concepts Covered

### 1. Classes and Objects

A class defines the structure and behavior of an entity. An object is an instance of that class.

For example, a `Car` class can describe the properties and operations associated with a car, while individual objects represent specific cars.

### 2. Inheritance

Inheritance allows a child class to acquire accessible members and behavior from a parent class.

In the vehicle example, a `Car` or `Bike` class can extend a general `Vehicle` class to reuse common functionality.

### 3. Abstraction

Abstraction focuses on essential behavior while hiding implementation details. Java supports abstraction through abstract classes and interfaces.

The payment example uses a common payment type, while the vehicle examples include a service-related interface. The exact abstraction mechanism can be verified in the corresponding source files.

### 4. Interfaces

An interface defines a contract that implementing classes agree to follow.

For example, a service-related interface can define a capability that multiple vehicle classes implement.

### 5. Method Overriding

Method overriding allows a child class to provide its own implementation of an inherited method, subject to Java's overriding rules.

This is useful when different vehicle or payment types need to respond differently to the same operation.

### 6. Runtime Polymorphism

Runtime polymorphism allows an overridden instance method to be selected according to the actual object at runtime when accessed through an appropriate parent-class or interface reference.

This principle supports flexible, extensible object-oriented programs.

### 7. Code Reusability and Maintainability

Separating common behavior from specialized behavior reduces unnecessary duplication and makes programs easier to extend.

---

## 💻 Prerequisites

Before running the programs, ensure that you have:

- A compatible Java Development Kit (JDK) installed.
- A Java-compatible IDE such as IntelliJ IDEA or Visual Studio Code.
- Basic familiarity with Java syntax and OOP concepts.
- Git installed if you want to clone or update the repository using Git commands.

To check your Java installation, open a terminal and execute:

```bash
java -version
javac -version
```

Both commands should report compatible Java versions if the runtime and compiler are correctly installed and available on your system path.

---

## 🚀 Installation and Setup

### Step 1 — Clone the Repository

Open a terminal and run:

```bash
git clone https://github.com/rajsyntax/Java_Practical_9.git
```

### Step 2 — Navigate to the Project

```bash
cd Java_Practical_9
```

### Step 3 — Open the Project

Open the `Java_Practical_9` directory in IntelliJ IDEA or another Java-compatible IDE.

### Step 4 — Locate the Required Question

Navigate to the required directory under `src`, for example:

```text
src/Question_1/
src/Question_2/
src/Question_3/
src/Extended_Question_3/
```

### Step 5 — Run the Program

Open the relevant `Main.java` file and execute its main method through the IDE.

---

## ▶️ How to Run

### Using IntelliJ IDEA

1. Open the project.
2. Allow the IDE to configure or detect the installed JDK.
3. Expand the `src` directory.
4. Open the `Main.java` file for the question you want to run.
5. Click the Run icon beside the main method.

### Using the Command Line

The programs can also be compiled and executed through the terminal, provided the source files and JDK are configured correctly.

Because each question contains its own `Main.java`, compile and run the relevant question separately. If the files use packages or depend on multiple classes, compile them together using the appropriate package structure.

For example, if a question's Java files have no package declarations, you can compile its source files from the project root using a command like:

```bash
javac -d out src/Question_1/*.java
```

Then run the main class:

```bash
java -cp out Main
```

**Important:** The command above assumes that `Main` is in the default package. If the source files declare a package, use the fully qualified main-class name instead. The exact execution command should match the package declarations in the source files.

---

## 🔄 Development Workflow

This repository uses Git and GitHub to track changes and maintain the latest version of the practical programs.

### Check the Current Status

```bash
git status
```

### Add New or Updated Files

```bash
git add .
```

### Commit Changes

```bash
git commit -m "Add Practical 9 Question 4"
```

Use a commit message that describes the actual changes.

### Push Changes to GitHub

```bash
git push
```

After the first push has configured upstream tracking for the branch, future pushes can usually use `git push`.

### Add Future Questions

When additional questions are introduced, create a separate folder for each question under `src`.

For example:

```text
src/
├── Question_1/
├── Question_2/
├── Question_3/
├── Extended_Question_3/
├── Question_4/
└── Question_5/
```

Keep each question's files organized together, and update this README whenever new exercises are added.

---

## 🔮 Future Enhancements

The repository can be expanded gradually with the following improvements:

- Add the remaining practical questions and their source files.
- Include sample input and output for each program.
- Document the exact concepts demonstrated by each implementation.
- Add explanations of important methods and class relationships.
- Include UML class diagrams where useful.
- Improve consistency in naming, formatting, and source organization.
- Add automated compilation or testing where appropriate.
- Maintain a clear commit history as new questions are introduced.

These are potential future improvements, not claims that the features already exist.

---

## 📈 Learning Outcomes

By working through these programs, learners can develop practical experience with:

- Translating simple problem statements into Java classes.
- Designing relationships between classes.
- Reusing common behavior through inheritance.
- Organizing related operations behind abstractions and interfaces.
- Overriding methods to customize behavior.
- Understanding polymorphism and extensible class hierarchies.
- Structuring multi-file Java programs.
- Using Git and GitHub to maintain an educational coding portfolio.

---

## 👨‍💻 Author

**Rajesh Maurya**

- GitHub: [@rajsyntax](https://github.com/rajsyntax)
- Repository: [Java_Practical_9](https://github.com/rajsyntax/Java_Practical_9)

---

## 🔗 Repository Link

Access the complete source code here:

**[Java Practical 9 — GitHub Repository](https://github.com/rajsyntax/Java_Practical_9)**

---

## 📄 License and Usage

This repository is maintained for educational and learning purposes.

You may refer to the source code to understand Java OOP concepts and practice similar programming exercises. If you reuse or distribute the code, follow any applicable licensing terms specified in the repository.

---

**Java Practical 9 — Learn, Implement, Practice, and Improve.**
