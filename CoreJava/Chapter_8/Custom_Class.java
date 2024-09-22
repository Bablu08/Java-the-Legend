package CoreJava.Chapter_8;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("Employee id is: " + id);
        System.out.println("Employee name is: " + name);
        System.out.println("Employee salary is: " + salary);
    }

}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our Public class");

        Employee emp_1 = new Employee(); //Instantiating a new Employee Object
        Employee emp_2 = new Employee(); //Instantiating a new Employee Object
        Employee emp_3 = new Employee(); //Instantiating a new Employee Object
        Employee emp_4 = new Employee(); //Instantiating a new Employee Object
        Employee emp_5 = new Employee(); //Instantiating a new Employee Object
        Employee emp_6 = new Employee(); //Instantiating a new Employee Object


//        Setting Attributes for emp_1
        emp_1.id = 1000;
        emp_1.name = "Martin";
        emp_1.salary = 10;
//        System.out.println("Employee id  is: " + emp_1.id);
//        System.out.println("Employee id  is: " + emp_1.name);

//        Setting Attributes for emp_2
        emp_2.id = 1001;
        emp_2.name = "marry";
        emp_2.salary = 12;

//        Setting Attributes for emp_3
        emp_3.id = 1002;
        emp_3.name = "Max";
        emp_3.salary = 14;

//        Setting Attributes for emp_4
        emp_4.id = 1003;
        emp_4.name = "Devin";
        emp_4.salary = 23;

//        Setting Attributes for emp_5
        emp_5.id = 1004;
        emp_5.name = "Alessia";
        emp_5.salary = 22;

//        Setting Attributes for emp_6
        emp_6.id = 1005;
        emp_6.name = "Celina";
        emp_6.salary = 12;

        emp_1.printDetails();
        emp_2.printDetails();
        emp_3.printDetails();
        emp_4.printDetails();
        emp_5.printDetails();
        emp_6.printDetails();

    }
}