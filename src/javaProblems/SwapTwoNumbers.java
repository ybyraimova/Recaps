package javaProblems;

public class SwapTwoNumbers {
    public static void  swap (int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
    }

    public static void main (String [] args){
        int x = 11;
        int y = 21;

        System.out.println("Before: x = " + x + " y = " + y);
        swap(x,y);
        System.out.println("AFTER: x = " + x + " y = " + y);

    }

}
