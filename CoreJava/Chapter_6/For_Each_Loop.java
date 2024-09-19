package CoreJava.Chapter_6;

public class For_Each_Loop {
    public static void main(String[] args) {

        int [] marks = {10, 20, 30, 40, 50};
        System.out.println(marks.length);

        float [] floatNum = {2.5f, 6.78f, 3.2f, 9.7f};
        System.out.println(floatNum.length);

        String [] name = {"Raj", "XO", "Max", "Kamran"};
        System.out.println(name.length);

//      Above - Dispelling the Array (Naive Way)
        System.out.println("Printing Using Naive Way");
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

//        Above - Dispelling the Array (For loop)
        System.out.println("Printing Using For Loop");
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

//        Above - Dispelling the Array (Reverse Order)
        System.out.println("Printing Using For Loop reverse Order");
        for (int i = name.length -1; i >= 0; i--){
            System.out.println(name[i]);
        }

//        Dispelling the Array (For-Each Loop)
        System.out.println("Printing Using For-Each Loop");
        for (String element: name){
            System.out.println(element);
        }
    }
}
