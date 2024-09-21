package CoreJava.Chapter_7;

public class Practice_Method {
    static void multiplication(int n){
        for (int i = 1; i <= 10; i++){
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }
    }
    static void pattern1(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Problem 1
        multiplication(7);

        //    Problem 2
        pattern1(4);
    }
}
