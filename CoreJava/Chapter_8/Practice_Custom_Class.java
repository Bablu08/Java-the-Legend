package CoreJava.Chapter_8;

import java.util.Scanner;

class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrat(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Raj...");
    }
}

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

class Rectangle{
    int width;
    int height;
    public int area(){
        return width * height;
    }
    public int perimeter(){
        return 2 * (width + height);
    }
}

public class Practice_Custom_Class {
    public static void main(String[] args) {

//        Problem 1
        Employee1 raj = new Employee1();
        raj.setName("Rajkishore Behera");
        System.out.println(raj.getName());
        
        raj.salary = 25000;
        System.out.println(raj.getSalary());

//        Problem 2
        CellPhone phone = new CellPhone();
        phone.ring();
        phone.vibrat();
        phone.callFriend();

//        Problem 3
        System.out.println("Calculating area and perimeter of the square");
        Square sq = new Square();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        sq.side = sc.nextInt();
        
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

//        Problem 4
        System.out.println("Calculating area and perimeter of the rectangle");
        Rectangle rectangle = new Rectangle();
        
        System.out.print("Enter height: ");
        rectangle.height = sc.nextInt();
        
        System.out.print("Enter width: ");
        rectangle.width = sc.nextInt();
        
        System.out.println("Area of the rectangle is: " + rectangle.area());
        System.out.println("Parameter of the rectangle is: " + rectangle.perimeter());
    }
}
