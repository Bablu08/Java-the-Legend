package CoreJava;

public class Operators {
    public static void main(String[] args) {

//        Arithmetic Operator
        int a = 5;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);

//        Assignment Operator


//        Compairasion Operator
        System.out.println( a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);

//        Logical Operator
        System.out.println(15 < 5 && 5 < 15);
        System.out.println(15 > 5 && 5 < 15);

        System.out.println(15 < 5 || 5 < 15);
        System.out.println(15 > 5 || 5 < 15);

//        Bit-wise Operator
        System.out.println(2&3);
    }
}
