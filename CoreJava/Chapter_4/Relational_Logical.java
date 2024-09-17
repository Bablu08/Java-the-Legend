package CoreJava.Chapter_4;

public class Relational_Logical {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

//        This is (&&) operators, for getting stetement true two side must be true
        System.out.println("For `AND` Operator");
        if (a && b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

//        This is (||) `OR` operators for making this statement true, at list one statement needed to be true.
        System.out.println("For `OR` Operator");
        if (a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For `NOT` Operator");

        System.out.println("Not(A) is ");
        System.out.println(!a);

        System.out.println("Not(b) is ");
        System.out.println(!b);
    }
}