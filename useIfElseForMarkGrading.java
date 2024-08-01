package ClassWork;
import java.util.*;
public class useIfElseForMarkGrading {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Mark for find out your Grade:");
        int mark = input.nextInt();

        if (mark >= 90 && mark <= 100){
            System.out.println("Your grade is: A+ for " + mark + " mark");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Your grade is: A for " + mark + " mark");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Your grade is: B for " + mark + " mark");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is: C for " + mark + " mark");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is: D for " + mark + " mark");
        } else if (mark >= 30 && mark < 50) {
            System.out.println("Your grade is: E for " + mark + " mark");
        } else if (mark < 30) {
            System.out.println("Your grade is: Fail for " + mark + " mark");
        } else {
            System.out.println("Mark Invalid!, Please try again");
        }
        System.out.println("Thank You!");
    }

}
