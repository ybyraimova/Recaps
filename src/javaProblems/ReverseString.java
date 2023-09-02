package javaProblems;

public class ReverseString {

    //write a method that will reverse a string:

    public static String reverse (String str){
        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }



    public static void main(String[] args) {
        System.out.println(reverse("Monkey"));
    }
}
