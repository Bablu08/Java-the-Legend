package CoreJava;

public class Precedence_Associativity {
    public static void main(String[] args) {

        int a = 6*5-34/2;
        /*
        * = 30 - 34/2
        * = 30 - 17
        * = 13
        * */

        int b = 60/5-34*2;
        /*
         * = 12 - 34*2
         * = 12 - 68
         * = -54
         * */

        System.out.println(a);
        System.out.println(b);

//        Practices
        int x = 6;
        int y = 1;
        int z = x * y/2;
        /*
        * Same priority follow Associativity, It means It goes Left - Right
        * = 6*1 / 2
        * = 6 / 2
        * = 3
        * */
        System.out.println(z);
    }
}
