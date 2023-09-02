package javaIntro;

public class Loops {
    public static void main(String[] args) {
            /*
    While loop loops through a block of code as long as specified condition is true:
    while (condition) {
  // code block to be executed
}
     */
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }


        /*
        Do/While loop will execute the code once before checking if the condition is true, then it will repeat the
        loop as long as condition is true.
        do {
         // code block to be executed
        }
        while (condition);


        The loop will always be executed at least once, even if the condition is false,
        because the code block is executed before the condition is tested.
         */
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        //Print i as long as i is less than 6.
        do {
            System.out.println(i);
            i++;
        }while (i <= 6);

        /*
        FOR loop
        When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        for (statement 1; statement 2; statement 3) {
         // code block to be executed}
         */
        for (int k = 0; k < 4; k++){
            System.out.println(k +  " Hello");
        }


        /*
        NESTED LOOP
        It is also possible to place a loop inside another loop. This is called a nested loop.
        the inner loop will be executed one time for each interation of outer loop:

        // Outer loop
    for (int i = 1; i <= 2; i++) {
           System.out.println("Outer: " + i); // Executes 2 times
        // Inner loop
        for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
                }
        }
         */

        //Use a for loop to print "Yes" 5 times.

        for (int l = 1; l <= 5; l++){
            System.out.println(l + " Yes ");
        }

        for(int q = 1; q <=3; q++){
            System.out.println("this is outer loop");
            for (int w = 1; w <= 2; w++){
                System.out.println("This is inner loop");
            }
        }


        /*
        FOR EACH loop
        exclusively to loop through elements in array
        for (type variableName : arrayName) {
         // code block to be executed
         }
         */

        String [] cars = { "Camry", "Prius" , "Tundra", "Rav4"};
        for (String car: cars) {
            System.out.println(car + " BEST ");
        }

        String [] goods = {"pen", "pine" , "apple", "japan"};
        for (String good: goods
             ) {
            System.out.println(good + " GEGE");
        }

        //BREAK
        //is it used to jump out from a switch statement
        //it is also used to jump out from a loop

        for (int s = 0; s < 10; s++) {
            if (s == 4) {
                break;
            }
            System.out.println(s);
        }

        //CONTINUE
        //The continue statement breaks one iteration (in the loop),
        // if a specified condition occurs, and continues with the next iteration in the loop.
        for (int h = 0; h < 10; h++) {
            if (h == 4) {
                continue; // то есть он пропустит 4
            }
            System.out.println(h);
        }

        //Stop the loop if i is 5.
        for(int k = 1; k <10; k++){
            if(k==5){
                break;
            }
            System.out.println(k);
            System.out.println("GOGO");
        }














    }

}
