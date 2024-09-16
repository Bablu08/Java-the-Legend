package CoreJava.Chapter_3;

public class String_Methods {
    public static void main(String[] args) {

//        String is Immutable mens No change.
        /*
        * String Methods Operates on java string.
        * they can be used to finding length of thew string,
        * Convert to lower case, Etc.
        */

//        Some of commonly use string method & name 2 different way to write
        String obj = "  this is an Apple";
        System.out.println(obj);
        int value = obj.length();
//        String lCase = obj.toLowerCase();
//        String uCase = obj.toUpperCase();
        String objTrim = obj.trim();

        System.out.println(value); // Display total index Number
        System.out.println(obj.toLowerCase()); // Chane into Lower case
        System.out.println(obj.toUpperCase()); // Change into Upper case
        System.out.println(objTrim); // Cut the empty index after and before

        System.out.println(obj.substring(7)); // index start for 0 to End
        System.out.println(obj.substring(10, 18)); // Select index to selected index

        System.out.println(obj.replace("an Apple", "a Banana")); // Character replacing

        System.out.println(obj.startsWith("This")); // Check True or False start with this word or not
        System.out.println(obj.endsWith("Apple")); // Check True or False End with this word or not

        System.out.println(obj.charAt(8)); //Which character At that Index
        System.out.println(obj.indexOf('a')); // Find the index number of that character, it always displays first use letter index
        System.out.println(obj.indexOf('A', 11)); // Find this Character index after from given index
        System.out.println(obj.lastIndexOf('p'));
        System.out.println(obj.lastIndexOf('p', 14));

        System.out.println(obj.equals("This is an Apple")); // It is not sam as main declaration because it contains white spaces
        System.out.println(obj.equals("  this is an Apple")); // It is the perfect replica of the main one
        System.out.println(obj.equals("  This Is an Apple")); // It's not same as main declaration
        System.out.println(obj.equalsIgnoreCase("  This Is an Apple")); //It ignores the upper and lowercase

//        Escape Sequence Characters
//        System.out.println("I am a student of CSE" i am also"); this is not correct statement cou can write like billow for differentiate that they are two different statement
        System.out.println("I am a student of CSE \" i am also"); //This or
        System.out.println("I am a student of CSE \\ i am also"); // Also like this.
        System.out.println("I am a student of CSE \n i am also"); // Next Line
        System.out.println("I am a student of CSE\ti am also"); // For tab
    }
}
