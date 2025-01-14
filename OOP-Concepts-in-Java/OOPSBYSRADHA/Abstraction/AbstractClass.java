package OOPSBYSRADHA.Abstraction;

abstract class Animal{
    abstract public void walk();

    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat(){
        System.out.println("Animal can Eats.");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Horse horse = new Horse();
//        horse.walk();
//        horse.eat();


//        Chicken chicken = new Chicken();
//        chicken.walk();
//        chicken.eat();

//        Animal animal = new Animal();
//        animal.walk();
    }
}
