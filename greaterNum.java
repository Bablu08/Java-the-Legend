package ClassWork;
import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter firstNum:");
        int firstNum = input.nextInt();

        System.out.println("Enter secondNum");
        int secNum = input.nextInt();

        if (firstNum > secNum){
            System.out.println("Fist one is Greater.");
        } else if (firstNum < secNum) {
            System.out.println("Second one is Greater.");
        } else {
            System.out.println("Not valid! Don't Give equal Number");
        }
    }
}
