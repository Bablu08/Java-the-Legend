package Projects.MarkGradingSystem;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Mark for find out your Grade: ");
        int mark = input.nextInt();

        if (mark >= 90 && mark <= 100){
            System.out.println("Your grade is: A+ for " + mark + " mark");
            System.out.println("Incredible achievement! You've proven that with dedication and hard work, you can reach the pinnacle of success. But remember, true excellence is a continuous journey. Keep pushing your limits, stay curious, and never stop striving for growth. You're capable of even greater things!");
        }
        else if (mark >= 80 && mark < 90) {
            System.out.println("Your grade is: A for " + mark + " mark");
            System.out.println("Outstanding work! You've set the bar high with your dedication and focus. Now, don't stop here—there's always room to refine your skills and knowledge. Keep challenging yourself to grow even further and maintain this excellence!");
        }
        else if (mark >= 70 && mark < 80) {
            System.out.println("Your grade is: B for " + mark + " mark");
            System.out.println("Great job! You've shown strong effort and potential. You're so close to the top—push yourself just a little more, and you'll reach even greater heights. Stay consistent, focus on the details, and an 'A' is within your grasp!");
        }
        else if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is: C for " + mark + " mark");
            System.out.println("You're doing well, but there’s more you can achieve! You've got the basics down, now it’s time to fine-tune your approach. With a bit more focus and effort, you can turn this 'C' into something exceptional. Keep going—you’re capable of much more!");
        }
        else if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is: D for " + mark + " mark");
            System.out.println("You're on the right path, but there’s still work to be done. This 'D' shows that progress is possible, but it's time to step it up. Identify the areas that need improvement, and with determination, you can transform this into a grade you're proud of!");
        }
        else if (mark >= 30 && mark < 50) {
            System.out.println("Your grade is: E for " + mark + " mark");
            System.out.println("You've faced challenges, but challenges are opportunities in disguise. This 'E' is a reminder that more focus and effort are needed, but don’t be discouraged. Start fresh, work hard, and believe in your ability to rise higher. You can turn this around!");
        }
        else if (mark < 30) {
            System.out.println("Your grade is: Fail for " + mark + " mark");
            System.out.println("This is not the end, it's a beginning. Failure isn’t falling down, it’s staying down. You’ve faced a tough lesson, but it’s only a moment in your journey. Learn from this, work harder, and know that success is within reach if you keep moving forward!");
        }
        else {
            System.out.println("Mark Invalid!, Please try again");
        }
        System.out.println("Thank You!");
    }
}
