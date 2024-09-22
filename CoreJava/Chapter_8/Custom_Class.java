package CoreJava.Chapter_8;

class Employee{
    int id;
    String name;

    public void printDetails(){
        System.out.println("Employee id is: " + id);
        System.out.println("Employee name is: " + name);
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


//        Setting Attributes
        emp_1.id = 1000;
        emp_1.name = "Martin";
//        System.out.println("Employee Id  is: " + emp_1.id);
//        System.out.println("Employee Id  is: " + emp_1.name);

        emp_2.id = 1001;
        emp_2.name = "marry";

        emp_3.id = 1002;
        emp_3.name = "Max";

        emp_4.id = 1003;
        emp_4.name = "Devin";

        emp_5.id = 1004;
        emp_5.name = "Alessia";

        emp_6.id = 1005;
        emp_6.name = "Celina";

        emp_1.printDetails();
        emp_2.printDetails();
        emp_3.printDetails();
        emp_4.printDetails();
        emp_5.printDetails();
        emp_6.printDetails();


    }
}
