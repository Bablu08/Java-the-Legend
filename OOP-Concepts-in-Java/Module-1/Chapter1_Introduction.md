# Chapter 1: An Introduction to Programming

## What is Programming?
Programming is the process of giving instructions to a computer to perform specific tasks. These instructions are written in a **programming language**.

### Types of Programming Languages
1. **Low-Level Languages**:  
   - Directly interact with the hardware.
   - Examples: Machine Language, Assembly Language.
   - Faster but harder to understand.

2. **High-Level Languages**:  
   - Closer to human languages, easy to understand.  
   - Examples: Java, Python, C++.  
   - Require a compiler or interpreter to convert into machine language.

---

## Compiler vs Interpreter

| **Feature**        | **Compiler**                              | **Interpreter**                          |
|---------------------|-------------------------------------------|------------------------------------------|
| **Execution**       | Translates the entire program at once.    | Translates line-by-line.                 |
| **Speed**           | Faster, as it processes the entire code.  | Slower due to real-time interpretation.  |
| **Examples**        | C, C++                                    | Python, JavaScript.                      |

### Example:
- **Compiler**: Converts Java code into bytecode.  
- **Interpreter**: Executes the bytecode using JVM.

---

## What is Object-Oriented Programming (OOP)?
OOP is a programming paradigm where code is organized around **objects** and **classes**, which makes it easier to design and manage.

### Advantages of OOP:
1. **Reusability**: Reuse code using inheritance.  
2. **Data Security**: Protect data using encapsulation.  
3. **Easy Maintenance**: Modular code structure.  
4. **Flexibility**: Polymorphism allows objects to behave differently.

### Key Features of OOP:
1. **Encapsulation**: Wrap data and methods together.  
   Example: A `class` has both variables and methods.  
2. **Abstraction**: Hide unnecessary details from the user.  
3. **Inheritance**: A class can inherit properties of another.  
   Example: A `Dog` class can inherit from an `Animal` class.  
4. **Polymorphism**: Same method can behave differently in different classes.

---

## Example of a Simple Java Program
```java
// Java Program to demonstrate OOP Concepts
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to Programming!");
    }
}
