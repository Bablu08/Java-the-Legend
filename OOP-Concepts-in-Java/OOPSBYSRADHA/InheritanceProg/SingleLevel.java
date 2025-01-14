package OOPSBYSRADHA.InheritanceProg;

class Shapes{
    public void area(){
        System.out.println("Display area");
    }
}
class triangle extends Shapes{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class SingleLevel {
    public static void main(String[] args) {

    }
}
