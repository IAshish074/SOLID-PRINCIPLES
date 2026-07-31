# SOLID Principles in Java

A beginner-friendly Java project demonstrating the **SOLID Principles of Object-Oriented Design** with simple and practical examples.

## 📚 Overview

The SOLID principles are five design principles that help developers write clean, maintainable, scalable, and extensible software.

This repository contains Java implementations of each principle with easy-to-understand examples.

---

## 📂 Project Structure

```
SOLID PRINCIPLES/
│
├── SRP/        # Single Responsibility Principle
├── OCP/        # Open/Closed Principle
├── LSP/        # Liskov Substitution Principle
├── ISP/        # Interface Segregation Principle
└── DIP/        # Dependency Inversion Principle
```

---

## 🚀 SOLID Principles

### 1. Single Responsibility Principle (SRP)

> A class should have only one reason to change.

**Example:**
- Product
- ShoppingCart
- CartCalculator
- InvoicePrinter
- CartDBStorage

Each class has a single responsibility, making the code easier to maintain.

---

### 2. Open/Closed Principle (OCP)

> Software entities should be open for extension but closed for modification.

**Example:**
- Database Interface
- SaveToSQL
- SaveToMongoDB

New database implementations can be added without modifying existing code.

---

### 3. Liskov Substitution Principle (LSP)

> A subclass should be able to replace its parent class without affecting program correctness.

**Example:**
- DepositOnlyAccount
- WithdrawOnlyAccount
- SavingAccount
- CurrentAccount
- FixedDeposit

Each account follows the expected behavior defined by its interface.

---

### 4. Interface Segregation Principle (ISP)

> Clients should not be forced to depend on interfaces they do not use.

**Example:**
- TwoDShape
- ThreeDShape
- Square
- Rectangle
- Cube

Small and focused interfaces help avoid unnecessary implementations.

---

### 5. Dependency Inversion Principle (DIP)

> High-level modules should depend on abstractions, not concrete implementations.

**Example:**
- Payment Interface
- CreditCardPayment
- UPIPayment
- PayPalPayment

The application depends on interfaces, allowing implementations to change without affecting business logic.

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- SOLID Design Principles

---

## ▶️ How to Run

Clone the repository:

```bash
git clone <repository-url>
```

Move to the project directory:

```bash
cd "SOLID PRINCIPLES"
```

Compile a package:

```bash
javac SRP/*.java
```

Run:

```bash
java SRP.Main
```

Replace `SRP` with `OCP`, `LSP`, `ISP`, or `DIP` to run other examples.

---

## 🎯 Learning Outcomes

This project helps understand:

- Object-Oriented Programming
- SOLID Principles
- Clean Code Practices
- Interface Design
- Java Packages
- Extensible Software Design

---

## 🤝 Contributions

Contributions, suggestions, and improvements are welcome.

Feel free to fork the repository and submit a pull request.

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.