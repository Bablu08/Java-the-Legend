package CoreJava.Chapter_4;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Age verification for DL Using If-Else condition");
        System.out.print("Enter your Age: ");

//        If-else Conditional Operators Statement for checking one condition between many condition
        int age = sc.nextInt();

        if (age <= 18){
            System.out.println("You are not Allow for DL");
        }
        else if (age > 18 && age < 90) {
            System.out.println("You are Allow for DL");
        }
        else {
            System.out.println("Please Enter Valid input");
        }
        System.out.println("Thank you!");

//        Switch Case
        System.out.println("Day selector Using Switch Case");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number for the day");
        int dayNum = input.nextInt();

        switch (dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid!, please try again");
        }
    }
}