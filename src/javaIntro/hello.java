package javaIntro;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine().toLowerCase();

        int sum = 0;

        for(int i  = 0; i < name.length(); i++){
            char letter = name.charAt(i);

            if(letter >= 'a' && letter <= 'z'){

                int location = letter - 'a' +1;
                sum += location;

//                System.out.println(letter + " " + location);
            }
        }
        System.out.println("Output: " + sum);


    }
}
