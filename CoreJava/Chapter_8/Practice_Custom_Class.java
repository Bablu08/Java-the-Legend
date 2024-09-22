package CoreJava.Chapter_8;

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
    }
}