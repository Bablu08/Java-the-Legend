package OOPSBYSRADHA.Abstraction;

abstract class Shape {
    abstract void draw(); // Abstract method  // No implementation

    void concreteMethod() {         // Implementation
        System.out.println("This is a concrete method.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
