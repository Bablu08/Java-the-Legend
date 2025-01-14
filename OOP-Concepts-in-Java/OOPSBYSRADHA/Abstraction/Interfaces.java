package OOPSBYSRADHA.Abstraction;

interface Animals{
    public void walk();
//    Interface don't Support Constructor & Function
}

interface Herbivore{

}

class Hen implements Animals, Herbivore{
    public void walk(){
        System.out.println("Walks on two leg");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Hen hen = new Hen();
        hen.walk();
    }
}
