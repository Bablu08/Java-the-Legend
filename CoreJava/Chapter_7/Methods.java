package CoreJava.Chapter_7;

public class Methods {

    static int sum(int x, int y){
        int z;
        if(x > y){
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c;
        c = sum(a,b);

//        Method invocation using Object Creation
        /*
        * Methods obj = new Methods();
        * c = obj.sum(a,b);
        */
        System.out.println(c);
    }
}
