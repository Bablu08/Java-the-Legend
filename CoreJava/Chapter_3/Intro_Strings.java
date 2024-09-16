package CoreJava.Chapter_3;

public class Intro_Strings {
    public static void main(String[] args) {

        String name = new String("Raj");
        System.out.print("my Name is: ");
        String name2 = "Raj";
        System.out.println(name2);

//        Use of Different Print statement
        System.out.print("print");
        System.out.println("println");

//        (printf)
        int a = 5;
        float f = 1.5f;
        System.out.printf("The value of a is %d, value of f is %f\n", a, f);
        System.out.printf("The value of a is %d, value of f is %8.3f\n", a, f); // Here after %8.3 I use for 8 space and after point 3 num display. new and usable way to display.

//        (format)
        System.out.format("The value of a is %d, value of f is %f\n", a, f);
        System.out.println("Both `printf` and `format` behave equal, C programmer Don't Worry");


    }
}
