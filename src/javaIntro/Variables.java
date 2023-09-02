package javaIntro;

public class Variables {
    public static void main(String[] args) {
        //There are 8 primitive variables:
        byte liter = 20; //integer between -128 and 127;
        short shortNumber = 140; //integer btw -32K to 32K;
        int age = 20; // integer btw 2B to -2B;
        long longNumber = 9000234541l; //integer btw 900b to -900b;
        float floatNumber = 2.9f; // 7 decimals;
        double height = 1.5d; //15 decimals;
        boolean isTrue = false; //stores true or false values;
        char letter = 'k'; //single character;

        int friends;//var declaration
        friends = 45;//assigning a value

        friends = 100; //is changed to 100;

        //FINAL variables:
        /*
        if you don't want anyone to overwrite existing values, use the final keyword (This will declare the variable
        as "final" or "constant", which means unchangeable and read-only:
         */
        final int intNum = 12;


        //There are 2 reference variables:
        String str = "Hello World"; //stores a reference to a string of characters;
        String gogo = "Hello World";
        Variables var = new Variables(); //object ==> stores reference to an object;
        

        /* There are local variables:
        LOCAL variables are declared within method or block of code. They are only accessible within the scope of the
        method or block of code in which they are declared.
         */

        /* Instance variables:
        Instance variables are declared in a class. They are accessible to all methods in the class.
         */

        /* Special variables:
        The "this" variable refers to the current object;
        The "super" variable refers to the parent class of the current object
         */

        System.out.println(height);
        System.out.println(age);


        //Declare many variables:
        int skirts = 10, pants = 7,  caps = 8;
        String name = "Alina", surname = "Happy", father = "Hello";

        //One value to multiple variables:
        int x,z,y;
        x = y = z = 20;


        //All variables must be identified with unique names ==> they are called unique identifiers


        //JAVA TYPE CASTING:
        /*
        Type casting is when you assign a value of one primitive data type to another type:
        - Widening Casting => automatically happens => converting smaller to larger: byte => int => long => double
        Narrowing Casting => manually happens => converting larger to smaller size type: double => byte;
         */
    }
}
