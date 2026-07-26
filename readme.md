# Expense Tracker Java 💰

A console-based **Expense Tracker application** developed using **Core Java and Object-Oriented Programming (OOP)** concepts.
This project allows users to manage income and expense transactions, calculate balance, and view transaction details.

## 🚀 Features

* Add Income transactions
* Add Expense transactions
* View all transactions
* Search transaction using ID
* Delete transactions using ID
* Check current balance
* Calculate total income
* Calculate total expense
* Automatic date and time recording
* Prevent duplicate transaction IDs

## 🛠️ Technologies Used

* Java
* ArrayList (Java Collections Framework)
* Java Time API
* Object-Oriented Programming Concepts

## 📚 OOP Concepts Implemented

### Encapsulation

* Private variables with getter methods to protect data.

### Inheritance

* `Income` and `Expense` classes inherit common properties from the `Transaction` class.

### Polymorphism

* Method overriding using `toString()` for displaying transaction details.

### Classes and Objects

* Used to represent transactions and manage application functionality.

## 📂 Project Structure

```
Expense-Tracker-Java
│
└── src
    │
    ├── Main.java
    ├── Transaction.java
    ├── Income.java
    ├── Expense.java
    └── TransactionManager.java
```

## ⚙️ Application Flow

```
User Input
    ↓
Create Income / Expense Object
    ↓
Store Transaction in ArrayList
    ↓
Transaction Manager Performs Operations
    ↓
Display Results
```

## 💡 How It Works

The application uses a parent `Transaction` class to store common transaction details such as:

* Transaction ID
* Amount
* Date
* Description

The `Income` and `Expense` classes extend the `Transaction` class and add their own specific details.

A `TransactionManager` class manages all transactions using an `ArrayList` and performs operations like adding, searching, deleting, and calculating totals.

## 🎯 Future Enhancements

* Store transactions permanently using files
* Connect with MySQL database
* Add graphical user interface (GUI)
* Support multiple user accounts
* Generate monthly expense reports

## 👩‍💻 Author

**Savitha S**

GitHub: Savitha0902
