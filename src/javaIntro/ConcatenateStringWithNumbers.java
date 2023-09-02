package javaIntro;

public class ConcatenateStringWithNumbers {

    public static String concatenateStringWithNumbers(String str1, String str2, int number){
        //turn int into string :
        String strNumber = String.valueOf(number);

        //Concatenate the string
        return str1 + str2 + strNumber;
    }

    public static void main(String[] args) {
        System.out.println(concatenateStringWithNumbers("hi", "bob", 34));
    }
}
