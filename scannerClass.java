package ClassWork;
import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
//        create a scanner object to read input from keyboard;
        Scanner input = new Scanner(System.in);

//        prompt the user input
        System.out.println("Enter your Name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

//        display the input variable;
        System.out.println("Hello, "+ name);
        System.out.println("Your are " + age + " year old");

//        close the scanner class;
        input.close();
    }
}
