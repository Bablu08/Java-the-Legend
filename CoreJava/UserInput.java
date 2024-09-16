package CoreJava;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from User.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();

        System.out.println("Enter B: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum is: "+sum);

        System.out.println("Enter your Name: ");
        String str = sc.next();
        System.out.println(str);

//        for check your data is actually coming or Not, You can use special Keyword
        System.out.println("Enter Int data type to check method working or Not: ");
        boolean data = sc.hasNextInt();
        System.out.println(data);
    }
}
