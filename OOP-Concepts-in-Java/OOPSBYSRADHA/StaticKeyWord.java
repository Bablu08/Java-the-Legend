package OOPSBYSRADHA;

class People{
    String name;
    static String school;
}

public class StaticKeyWord {
    public static void main(String[] args) {
        People.school = "NIT";
        People people = new People();
        people.name = "Raj";
        System.out.println(people.school);
    }
}
