package javaIntro;

public class IfElse {
    public static void main(String[] args) {
        // If statement is used to specify a block of code to be executed if a condition is true;
        int age = 29;
        int votingAge = 18;
        if (age >= votingAge) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You cannot vote");
        }
        // Else statement is used to specify a block of code to be executed if the condition is false;
        int time = 22;
        if (time == 22) {
            System.out.println("Good night");
        } else {
            System.out.println("It is early to sleep");
        }

        // Else if statement to specify a new condition if the first condition is false
        /*
        if (condition1) {
        // block of code to be executed if condition1 is true
        } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
        } else {
        // block of code to be executed if the condition1 is false and condition2 is false
           }
         */

        if (time <= 11) {
            System.out.println("good morning!");
        } else if (time > 11 && time <= 19) {
            System.out.println("good day");
        } else {
            System.out.println("good evening!");
        }


        //TERNARY OPERATOR
        /*
        it is used to replace if-else.
        variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
         */

        String result = (time < 18) ? "good day" : "good evening";

        String name = "Alina";
        String result1 = (2 > name.indexOf('a')) ? "short" : "long";
        System.out.printf("", result1);

        //JAVA SWITCH Statement:
    /*
    SWitch statement selects one of many code blocks to be executed:
    switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

This is how it works:

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
     */

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; //break will stop the execution of switch for each case after finding the match
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("NOT FOUND");

        }
        // default keyword specifies some code to run if there is no case match.
        //for example in the previous code let's say the day = 28; it will run default.






    }


}

