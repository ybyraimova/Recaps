package javaIntro;

public class Strings {
    //Strings are used to store a text == collection of characters surrounded by double quotes;
    public static void main(String[] args) {
        String main = "H am here";
        // length()
        System.out.println(main.length());
        //trim the white space:
       main = main.trim();
        //to uppercase:
        main = main.toUpperCase();
        System.out.println(main);

        //indexof
        System.out.println(main.indexOf("AM"));

        //Concatenation
        String greeting = "Hello";
        String name = "Alice";
        System.out.println(greeting + " " + name);

        //Special characters
        /*
        \' single quote
        \" double quotes
        \\ backslash
        \n new line

         */



    }
}
