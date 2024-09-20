package CoreJava.Chapter_7;

public class Variable_Arguments {

    /*
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */

//    For solving define of multiple of argument we use this instant of passing argument on method.
    static int sum(int ...arr){  //var args define by (...)

        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("The sum of 4 & 5 is: "+ sum());
        System.out.println("The sum of 4, 5 & 9 is: "+sum(4, 5, 9));
        System.out.println("The sum of 4, 5, 9 & 12 is: "+sum(4, 5, 9, 12));
        System.out.println("The sum of 4, 5, 9, 12, 56, 87, 23 & 8 is: "+sum(4, 5, 9, 12, 56, 87, 23, 8));
        System.out.println("The sum of 4, 5, 9, 12, 56, 87, 23, 8, 80, 70, 90 & 100 is: "+sum(4, 5, 9, 12, 56, 87, 23, 8, 80, 70, 90, 100));
    }
}
