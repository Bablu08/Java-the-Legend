
# Module 1: Introduction to Programming and Java Basics

## Chapter 1: An Introduction to Programming

### Topics:
1. **Types of Programming Languages**  
   Programming languages are tools to communicate instructions to a computer.  
   - **Low-level languages**: Machine code or assembly language (e.g., Assembly).
   - **High-level languages**: Closer to human language (e.g., Java, Python, C++).

2. **Compiler vs Interpreter**  
   - **Compiler**: Translates the entire program into machine code at once (e.g., C, C++).  
   - **Interpreter**: Translates line-by-line during runtime (e.g., Python, JavaScript).  

3. **Advantages of Object-Oriented Programming (OOP)**  
   - Promotes **reusability** (through inheritance).  
   - Ensures **data security** using encapsulation.  
   - Supports modular code, which improves readability.  
   - Offers flexibility via **polymorphism**.

4. **Features of OOP**  
   - **Encapsulation**: Wrapping data and methods together in a class.  
   - **Abstraction**: Hiding implementation details.  
   - **Inheritance**: Acquiring properties of one class into another.  
   - **Polymorphism**: Performing actions in multiple ways.

---

## Chapter 2: Introduction to Java

### Topics:
1. **What is Java?**  
   Java is a high-level, object-oriented programming language developed by Sun Microsystems. It is platform-independent and widely used for developing web, mobile, and desktop applications.

2. **Why Java?**  
   - Platform-independent: Write Once, Run Anywhere (WORA).  
   - Object-oriented: Supports classes, objects, and OOP principles.  
   - Secure and Robust.  

3. **History of Java**  
   Developed by James Gosling in 1995. Initially named "Oak", it was later renamed Java.

4. **Different Versions of Java**  
   - Java SE (Standard Edition)  
   - Java EE (Enterprise Edition)  
   - Java ME (Micro Edition)

5. **Difference Between C/C++ and Java**  
   - **C/C++** uses pointers and manual memory management.  
   - **Java** uses automatic memory management (Garbage Collection).  
   - Java does not support multiple inheritance directly.

6. **Features of Java**  
   - Platform-independent  
   - Object-oriented  
   - Secure and robust  
   - Multi-threaded

7. **First Java Program**  
   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

8. **JVM and Its Significance**  
   - **JVM**: Java Virtual Machine executes bytecode generated by the Java compiler.  
   - Architecture: Class Loader, Runtime Data Area, Execution Engine.

---

## Chapter 3: Java Fundamentals

### Topics:
1. **Understanding Java Tokens**  
   - Keywords, Identifiers, Literals, Operators, and Special Symbols.

2. **Datatypes**  
   - **Primitive**: int, float, double, char, boolean.  
   - **Non-primitive**: Arrays, Strings, Classes.

3. **Operators**  
   - Arithmetic, Relational, Logical, Bitwise, Assignment.

4. **Control Structures**  
   - Conditional Statements: `if`, `if-else`, `switch`.  
   - Loops: `for`, `while`, `do-while`.  
   - Jump Statements: `break`, `continue`.

5. **Arrays**  
   - Single-dimensional and multi-dimensional arrays.  
   ```java
   int[] numbers = {1, 2, 3, 4, 5};  // Example of single-dimensional array.
   ```

6. **Taking Input in Java**  
   - **Scanner Class**  
     ```java
     import java.util.Scanner;
     public class InputExample {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter your name:");
             String name = sc.nextLine();
             System.out.println("Hello, " + name);
         }
     }
     ```

7. **Command Line Arguments**  
   Passing arguments while running a program from the terminal.

---

## Important Questions:

1. What are the differences between compilers and interpreters?  
2. List the key features of Object-Oriented Programming.  
3. Explain the significance of JVM in Java.  
4. Write a Java program to demonstrate conditional statements (if-else).  
5. How can we take input from the user in Java? Provide an example.