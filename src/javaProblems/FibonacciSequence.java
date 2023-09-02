package javaProblems;

public class FibonacciSequence {
    public static void printFibonacci(int n){
        int [] fibonacci = new int [n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for( int i = 2; i < n; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < n; i++){
            System.out.println(fibonacci[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}
