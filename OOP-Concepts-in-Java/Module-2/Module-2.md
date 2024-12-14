
# Module 2: Classes, Objects, and Inheritance

## Chapter 1: Introduction to Classes and Objects

### Topics:
1. **Classes and Objects**  
   - A **Class** is a blueprint for creating objects.  
   - An **Object** is an instance of a class.  
   Example:  
   ```java
   class Car {
       String model;
       int year;
   }

   public class Main {
       public static void main(String[] args) {
           Car car = new Car();
           car.model = "Tesla";
           car.year = 2022;
           System.out.println("Car Model: " + car.model + ", Year: " + car.year);
       }
   }
   ```

2. **Data Hiding and Encapsulation**  
   - **Encapsulation**: Wrapping data (variables) and methods into a single unit (class).  
   - Use access modifiers (`private`, `public`, `protected`) to control access.

3. **Constructors**  
   - A special method used to initialize objects.  
   Example:  
   ```java
   class Person {
       String name;
       Person(String name) {
           this.name = name;
       }
   }
   ```

4. **Static and `this` Keyword**  
   - **`static`**: Belongs to the class, not instances.  
   - **`this`**: Refers to the current object.

---

## Chapter 2: Inheritance

### Topics:
1. **What is Inheritance?**  
   - Acquiring properties and behaviors of a parent class into a child class.

2. **Types of Inheritance**  
   - Single, Multilevel, Hierarchical.

3. **Using `super` in Java**  
   - Used to access parent class methods and constructors.

4. **Polymorphism**  
   - **Compile-time Polymorphism**: Method Overloading.  
   - **Run-time Polymorphism**: Method Overriding.

5. **Method Overloading and Overriding**  
   - Overloading: Methods with the same name but different parameters.  
   - Overriding: Methods in child classes redefine behavior.

Example:  
```java
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }
}
```

---

## Chapter 3: String Manipulations

### Topics:
1. **String Class**  
   Strings are immutable in Java.  
   Example:  
   ```java
   String name = "Hello";
   System.out.println(name);
   ```

2. **StringBuffer and StringBuilder**  
   - **StringBuffer**: Thread-safe.  
   - **StringBuilder**: Not thread-safe, but faster.

3. **Wrapper Classes**  
   - Converting primitive types to objects (`Integer`, `Double`, etc.).  
   Example:  
   ```java
   int num = 10;
   Integer obj = Integer.valueOf(num);
   ```

4. **Auto-boxing and Unboxing**  
   - **Auto-boxing**: Converting primitive to Wrapper class.  
   - **Unboxing**: Wrapper to primitive.

---

## Important Questions:
1. What is the difference between a class and an object?  
2. Explain method overloading with an example.  
3. What is the difference between `String`, `StringBuffer`, and `StringBuilder`?  
4. What is auto-boxing and unboxing in Java?  
