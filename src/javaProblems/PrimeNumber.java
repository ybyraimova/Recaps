package javaProblems;

public class PrimeNumber {
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i * i <= number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println(number + " is prime: " + isPrime(number));
    }
}
