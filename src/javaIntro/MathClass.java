package javaIntro;

public class MathClass {
    public static void main(String[] args) {
        // Math.max(x,y) method can be used to find the max value of x and y
        Math.max(20, 50);
        //Math.min(x,y) method can be used to find the min value of x and y
        Math.min(5, 10);
        // Math.sqrt(x) method can be used for x2 square root
        Math.sqrt(2);
        Math.abs(-10); //return absolute positive value of x;
        Math.random(); //returns a random number btw 0.0 and 1.0

        int randomNum = (int)(Math.random()*101); //random number btw 0 and 100;

    }
}
