package CoreJava.Chapter_7;

public class Method_Overloading {

    static void overLoad(){
        System.out.println("Hii Raj");
    }
    static void overLoad(int a){
        System.out.println("Hii Raj, your first no: "+a);
    }
    static void overLoad(int a, int b){
        System.out.println("Hii, Raj your first no:  "+a+ " Your second no: "+b);
    }

    public static void main(String[] args) {

        overLoad();
        overLoad(59);
        overLoad(95, 98);

    }
}