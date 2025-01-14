package OOPSBYSRADHA;

class Pen{
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something!");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(){
//        System.out.println("Constructor Call non-perimeter");
//    }

    Student(String name, int age){
        System.out.println("Constructor Call perimeterize");
        this.name = name;
        this.age = age;
    }
}

public class ClassObjects {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

//        pen1.printColor();
//        pen2.printColor();

//        <<< Student >>>
//        Student s1 = new Student();
//        s1.name = "Raj";
//        s1.age = 24;
//        s1.printInfo();

        Student s2 = new Student("Raj", 18);
        s2.printInfo();
    }
}

//Class & Object
//This Keyword
//Costructors
//3types - 1.non-perimeter, 2.perimeter, 3.Copy - Costructors