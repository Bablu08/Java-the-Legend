package CoreJava.Chapter_9;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
   public int getId(){
        return id;
   }
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee raj = new MyEmployee();
//        raj.id = 24;
//        raj.name = "Hello Raj";
    }
}
