package CoreJava.Chapter_2;

public class Expressions_Increment_Decrement_Operators {
    public static void main(String[] args) {

//        Expressions
        byte b = 1;
        int i = 5;
        char c = 'R';
        float f = 1.5f;
        short s = 4;
        double d = 678765789D;
        long l = 8969L;

        System.out.println("Expression");
        System.out.println(b+s);
        System.out.println(s+i);
        System.out.println(l+f);
        System.out.println(i+f);
        System.out.println(c+i);
        System.out.println(c+s);
        System.out.println(l+d);
        System.out.println(f+d);



//        Increment and Decrement Operators
        System.out.println("Increment & Decrement");
        int x = 9;
        int y = x++; // In this case first x store in y then it's value increase.
        System.out.println(y);

        int a = 9;
        int bb = ++a; // In this case first value increase then it store in b.
        System.out.println(bb);

//        Like Above condition
        int m = 11;
        int n = m--;
        System.out.println(n);

        int p = 11;
        int q = --p;
        System.out.println(q);

    }
}