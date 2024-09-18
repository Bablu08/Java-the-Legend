package CoreJava.Chapter_5;

public class Break_and_Continue {
    public static void main(String[] args) {

//        Break And Continue using Loops
        System.out.println("Using Break in Program");
        for (int i = 0; i < 5; i++){

            System.out.println(i);
            System.out.println("Are you enjoying this Program?");

            if (i == 3){
                System.out.println("I am Glad to see your response.");
                break;
            }
        }

//        Using Continue
        System.out.print("\nUsing Continue in Program");
        for (int i = 0; i < 5; i++){

            if (i == 3){
                System.out.println("I am Glad to see your response.");
                continue;
            }

            System.out.println(i);
            System.out.println("Are you enjoying this Program?");
        }
    }
}
