package javaIntro;

public class Methods {


     /*
     A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
    Why use methods? To reuse code: define the code once, and use it many times.
      */

    public static void printMessage(){
        System.out.println("Hello! I am here");
    }
 //one param:
    public static void printMessage(String name){
        System.out.println("Hello " + name);
    }
    //multiple param:
    public static void gigle(String name, String voice, String place){
        System.out.println(name + " has  " + voice + " voice in " + place);
    }

        /*
    Return Values
        The void keyword, used in the examples above,
         indicates that the method should not return a value.
         If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
         instead of void, and use the return keyword inside the method:
     */

    static int printAge(int age){
        return age;
    }

    static int sum(int x, int y){
        return x+y;
    }

    // Create a checkAge() method with an integer variable called age
    public static void checkAge(int age){
        if(age < 18){
            System.out.println("BABY");
        }else if(age >= 18 && age <50){
            System.out.println("MEDI");
        }else{
            System.out.println("GRAND");
        }

    }

    //METHOD OVERLOADING
    //With method overloading, multiple methods can have the same name with different parameters.


    //Method SCOPE
    //In Java, variables are only accessible inside the region they are created. This is called scope.
    //Variables declared directly inside a method are available anywhere
    // in the method following the line of code in which they were declared: local variable;


    /*
    Variables declared inside blocks of code are only accessible by the code
    between the curly braces, which follows the line in which the variable was declared:
     */

    /*
    RECURSION
    Recursion is the technique of making a function call itself.
    This technique provides a way to break complicated problems down into simple problems which are easier to solve.
    Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.
     */
    public static int sum(int k) {
        if (k > 0) { //if given number is more than zero it will go inside the if statement
            return k + sum(k - 1); // this will basically work like this: 10 + 10-1 + 9-1 + 8-1 + 7-1;
        } else {
            return 0;
        }
    }
    /* it will work like this:
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
     */



    public static void main(String[] args) {
        String name;
        printMessage();
        printMessage("Jane");
        gigle("Jane", "catchy", "Columbia");
        System.out.println(printAge(78));
        System.out.println(sum(5, 5));
        int j = sum(1,2);
        checkAge(18);

        int recursion = sum(5);
        System.out.println(recursion);
    }
}
