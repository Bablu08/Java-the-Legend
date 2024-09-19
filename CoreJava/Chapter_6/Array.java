package CoreJava.Chapter_6;

public class Array {
    public static void main(String[] args) {

//        type of declaration
//       (1). First declaration and then memory Allocation
        int[] arr;
        arr = new int[5];

//        (2). Declaration + Memory Allocation.
//        Data Storing in Array
        int [] marks= new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks[1]);
//        The above is example of an array, but it manually takes inputs

//        (3). Declaration + Initialization
        int [] Marks = {10, 20, 30, 40, 50, 50, 60, 70, 80, 90, 100};
        System.out.println(Marks[10]);


    }
}
